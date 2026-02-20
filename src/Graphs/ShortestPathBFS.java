package Graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// Shortest path in an unweighted graph using BFS.
// BFS guarantees the shortest path in terms of edge count for unweighted graphs.
public class ShortestPathBFS {
    public static void shortestPath() {
        int vertices = 6;
        GraphUtils g = new GraphUtils(vertices);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 5);

        int source = 0;
        int[] dist = new int[vertices];
        Arrays.fill(dist, -1);
        dist[source] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int neighbor : g.adjList.get(node)) {
                if (dist[neighbor] == -1) {
                    dist[neighbor] = dist[node] + 1;
                    queue.add(neighbor);
                }
            }
        }

        System.out.println("Shortest distances from source " + source + ":");
        for (int i = 0; i < vertices; i++) {
            System.out.println("  Node " + i + " -> " + dist[i]);
        }
    }
}
