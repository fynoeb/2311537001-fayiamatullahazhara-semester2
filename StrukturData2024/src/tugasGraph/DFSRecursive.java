package tugasGraph;

import java.util.*;

public class DFSRecursive {
    private Map<String, List<String>> graph = new HashMap<>();

    public void addEdge(String node, List<String> neighbors) {
        graph.put(node, neighbors);
    }

    public void dfs(String vertex, Set<String> visited) {
        if (!visited.contains(vertex)) {
            visited.add(vertex);
            System.out.print(vertex + " ");
            for (String neighbor : graph.get(vertex)) {
                dfs(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        DFSRecursive dfs = new DFSRecursive();
        dfs.addEdge("A", Arrays.asList("B", "C"));
        dfs.addEdge("B", Arrays.asList("D", "E"));
        dfs.addEdge("C", Arrays.asList("F"));
        dfs.addEdge("D", new ArrayList<>());
        dfs.addEdge("E", Arrays.asList("F"));
        dfs.addEdge("F", new ArrayList<>());

        System.out.println("\nDFS Traversal (Recursive):");
        dfs.dfs("A", new HashSet<>());
    }
}