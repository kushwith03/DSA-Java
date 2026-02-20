package Graphs;

import java.util.ArrayList;

// Detect cycle in a directed graph using DFS (coloring approach).
// Uses three states: 0 = unvisited, 1 = in current DFS path, 2 = fully processed.
public class DetectCycleDirected {
    public static void detect() {
        int vertices = 6;
        GraphUtils g = new GraphUtils(vertices);
        g.addDirectedEdge(0, 1);
        g.addDirectedEdge(1, 2);
        g.addDirectedEdge(2, 3);
        g.addDirectedEdge(3, 1); // creates a cycle: 1->2->3->1
        g.addDirectedEdge(4, 5);

        int[] color = new int[vertices]; // 0=white, 1=gray, 2=black
        boolean hasCycle = false;
        for (int i = 0; i < vertices; i++) {
            if (color[i] == 0 && dfs(g.adjList, color, i)) {
                hasCycle = true;
                break;
            }
        }
        System.out.println("Directed graph has cycle: " + hasCycle);
    }

    private static boolean dfs(ArrayList<ArrayList<Integer>> adj, int[] color, int node) {
        color[node] = 1;
        for (int neighbor : adj.get(node)) {
            if (color[neighbor] == 1) return true;
            if (color[neighbor] == 0 && dfs(adj, color, neighbor)) return true;
        }
        color[node] = 2;
        return false;
    }
}
