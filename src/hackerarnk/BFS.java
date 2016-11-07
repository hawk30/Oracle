package hackerarnk;

import java.util.*;

/**
 * Created by oracle on 6/11/16.
 */
public class BFS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int queries = scanner.nextInt();
        for (int t = 0; t < queries; t++) {
            // Create a graph of size n where each edge weight is 6:
            Graph graph = new Graph(scanner.nextInt());
            int m = scanner.nextInt();
            // read and set edges
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt() - 1;
                int v = scanner.nextInt() - 1;
                // add each edge to the graph
                graph.addEdge(u, v);
            }
            // Find shortest reach from node s
            int startId = scanner.nextInt() - 1;
            int[] distances = graph.shortestReach(startId);
            for (int i = 0; i < distances.length; i++) {
                if (i != startId) {
                    System.out.print(distances[i]);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }

    public static class Graph {
        int size;
        LinkedList<Integer> adj[];

        public Graph(int size) {
            this.size = size;
            adj = new LinkedList[size];
            for (int i = 0; i < size; i++)
                adj[i] = new LinkedList<>();
        }

        public void addEdge(int first, int second) {
            adj[first].add(second);
            adj[second].add(first);
        }

        public int[] shortestReach(int startId) { // 0 indexed
            int[] distance = new int[size];
            Arrays.fill(distance, -1);
            boolean[] visited = new boolean[size];
            Queue<Integer> queue = new LinkedList<>();
            queue.add(startId);
            distance[startId] = 0;
            visited[startId] = true;
            while (!queue.isEmpty()) {
                startId = queue.poll();
                Iterator<Integer> i = adj[startId].listIterator();
                while (i.hasNext()) {
                    int n = i.next();
                    if (!visited[n]) {
                        visited[n] = true;
                        queue.add(n);
                        distance[n] = distance[startId] + 6;
                    }
                }
            }
            return distance;

        }

    }
}
