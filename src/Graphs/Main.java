package Graphs;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Graph BFS & DFS ===");
        GraphUtils g = new GraphUtils(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.bfs(0);
        g.dfs(0);

        System.out.println("\n=== Number of Islands ===");
        NumberOfIslands.bfs();
        NumberOfIslands.dfs();

        System.out.println("\n=== Detect Cycle in Directed Graph ===");
        DetectCycleDirected.detect();

        System.out.println("\n=== Topological Sort ===");
        TopologicalSort.dfsBased();
        TopologicalSort.kahns();

        System.out.println("\n=== Shortest Path (BFS) ===");
        ShortestPathBFS.shortestPath();
    }
}
