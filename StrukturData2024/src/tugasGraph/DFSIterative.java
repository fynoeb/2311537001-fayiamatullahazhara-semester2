package tugasGraph;
import java.util.*;

public class DFSIterative {
    private Map<String, List<String>> graph = new HashMap<>();

    public void addEdge(String node, List<String> neighbors) {
        graph.put(node, neighbors);
    }

    public void dfs(String start) {
        Set<String> visited = new HashSet<>();
        Stack<String> stack = new Stack<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            String vertex = stack.pop();
            if (!visited.contains(vertex)) {
                System.out.print(vertex + " ");
                visited.add(vertex);
                for (String neighbor : graph.get(vertex)) {
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        DFSIterative dfs = new DFSIterative();
        dfs.addEdge("A", Arrays.asList("B", "C"));
        dfs.addEdge("B", Arrays.asList("D", "E"));
        dfs.addEdge("C", Arrays.asList("F"));
        dfs.addEdge("D", new ArrayList<>());
        dfs.addEdge("E", Arrays.asList("F"));
        dfs.addEdge("F", new ArrayList<>());

        System.out.println("\nDFS Traversal (Iterative):");
        dfs.dfs("A");
    }
}