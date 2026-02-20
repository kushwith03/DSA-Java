package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// Topological Sort of a Directed Acyclic Graph (DAG)
// Returns an ordering of vertices such that for every directed edge u->v,
// vertex u comes before v in the ordering.
//
// Two approaches:
// 1. DFS-based (push to stack after all neighbors are processed)
// 2. Kahn's Algorithm (BFS-based, using in-degree)
public class TopologicalSort {
    public static void dfsBased() {
        int vertices = 6;
        GraphUtils g = new GraphUtils(vertices);
        g.addDirectedEdge(5, 2);
        g.addDirectedEdge(5, 0);
        g.addDirectedEdge(4, 0);
        g.addDirectedEdge(4, 1);
        g.addDirectedEdge(2, 3);
        g.addDirectedEdge(3, 1);

        boolean[] visited = new boolean[vertices];
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                dfsHelper(g.adjList, visited, stack, i);
            }
        }
        System.out.print("Topological Sort (DFS): ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    private static void dfsHelper(ArrayList<ArrayList<Integer>> adj, boolean[] visited,
                                   java.util.Stack<Integer> stack, int node) {
        visited[node] = true;
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfsHelper(adj, visited, stack, neighbor);
            }
        }
        stack.push(node);
    }

    public static void kahns() {
        int vertices = 6;
        GraphUtils g = new GraphUtils(vertices);
        g.addDirectedEdge(5, 2);
        g.addDirectedEdge(5, 0);
        g.addDirectedEdge(4, 0);
        g.addDirectedEdge(4, 1);
        g.addDirectedEdge(2, 3);
        g.addDirectedEdge(3, 1);

        int[] inDegree = new int[vertices];
        for (int u = 0; u < vertices; u++) {
            for (int v : g.adjList.get(u)) {
                inDegree[v]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < vertices; i++) {
            if (inDegree[i] == 0) queue.add(i);
        }

        System.out.print("Topological Sort (Kahn's BFS): ");
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int neighbor : g.adjList.get(node)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) queue.add(neighbor);
            }
        }
        System.out.println();
    }
}
