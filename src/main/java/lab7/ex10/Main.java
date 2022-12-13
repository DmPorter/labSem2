//package lab7.ex10;
//
//import lab6.ex7.Pair;
//
//import java.util.*;
//
//public class Main {
//    static int COUNT = 5;
//    static int SOURCE = 0;
//
//    public static void main(String[] args) {
//        List<List<Neighbor>> adj = createGraph(COUNT);
//
//        int[] dist = dijkstra(adj, SOURCE);
//        for (int i = 0; i < dist.length; i++)
//            System.out.println(SOURCE + " -> " + i + " = " + dist[i]);
//    }
//
//    private static List<List<Neighbor>> createGraph(int count) {
//        List<List<Neighbor>> adj = initialize(count);
//        adj.get(0).add(new Neighbor("1", 9));
//        adj.get(0).add(new Neighbor("2", 6));
//        adj.get(0).add(new Neighbor("3", 5));
//        adj.get(0).add(new Neighbor("4", 3));
//        adj.get(2).add(new Neighbor("1", 2));
//        adj.get(2).add(new Neighbor("3", 4));
//        return adj;
//    }
//
//    private static List<List<Neighbor>> initialize(int count) {
//        List<List<Neighbor>> adj = new ArrayList<>();
//        for (int i = 0; i < count; i++) {
//            adj.add(new ArrayList<>());
//        }
//        return adj;
//    }
//
//    public static int[] dijkstra(List<List<Neighbor>> adj, String source) {
//        int count = adj.size();
//        ArrayList<Integer> dist = createArrayDist(count);
//        Set<Neighbor> passed = new HashSet<>();
//        PriorityQueue<Neighbor> queue = new PriorityQueue<>(count, new Neighbor());
//
//        queue.add(new Neighbor(source, 0));
//        dist[source] = 0;
//        while (!queue.isEmpty()) {
//            Neighbor curr = queue.remove();
//            List<Neighbor> neighbors = adj.get(curr.getName());
//            for (Neighbor neighbor : neighbors) {
//                if (!passed.contains(neighbor)) {
//                    int newDist = dist[curr.getName()] + neighbor.getCost();
//                    if (newDist < dist[neighbor.getName()]) {
//                        dist[neighbor.getName()] = newDist;
//                    }
//                    queue.add(new Neighbor(neighbor.getName(), dist[neighbor.getName()]));
//                }
//            }
//            passed.add(curr);
//        }
//        return dist;
//    }
//
//    private static int findIdByName(List<List<Neighbor>> list, String name){
//        for(var line: list){
//            for(Neighbor val: line){
//                if(val)
//            }
//        }
//    }
//    private static ArrayList<Integer> createArrayDist(int count) {
//        ArrayList<Integer> dist = new ArrayList<>(count);
//        for (int i = 0; i < count; i++) {
//            dist.add(Integer.MAX_VALUE);
//        }
//        return dist;
//    }
//}
