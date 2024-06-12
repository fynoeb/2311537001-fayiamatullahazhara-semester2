package tugasGraph;

import java.util.*;
public class BFS {
	
	    private Map<String, List<String>> graph = new HashMap<>();

	    public void addEdge(String node, List<String> neighbors) {
	        graph.put(node, neighbors);
	    }

	    public void bfs(String start) {
	        Set<String> visited = new HashSet<>();
	        Queue<String> queue = new LinkedList<>();
	        visited.add(start);
	        queue.add(start);

	        while (!queue.isEmpty()) {
	            String vertex = queue.poll();
	            System.out.print(vertex + " ");

	            for (String neighbor : graph.get(vertex)) {
	                if (!visited.contains(neighbor)) {
	                    visited.add(neighbor);
	                    queue.add(neighbor);
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        BFS bfs = new BFS();
	        bfs.addEdge("A", Arrays.asList("B", "C"));
	        bfs.addEdge("B", Arrays.asList("D", "E"));
	        bfs.addEdge("C", Arrays.asList("F"));
	        bfs.addEdge("D", new ArrayList<>());
	        bfs.addEdge("E", Arrays.asList("F"));
	        bfs.addEdge("F", new ArrayList<>());

	        System.out.println("BFS Traversal:");
	        bfs.bfs("A");
	    }
	}