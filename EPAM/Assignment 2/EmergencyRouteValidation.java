import java.util.*;

public class EmergencyRouteValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();
        List<List<Integer>> adj = new ArrayList<>();
        for (int i=0; i<=N; i++){
            adj.add(new ArrayList<>());
        }
        for (int i=0;i<M; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int[] distances = new int[N+1];
        Arrays.fill(distances, -1);
        Queue<Integer> queue = new LinkedList<>();
        distances[1] = 0;
        queue.add(1);
        int efficientlyReachableCount = 0;
        while (!queue.isEmpty()){
            int u = queue.poll();

            if (distances[u] <= D){
                efficientlyReachableCount++;
            }
            for (int v : adj.get(u)){
                if (distances[v] == -1){
                    distances[v] = distances[u]+1;
                    queue.add(v);
                }
            }
        }
        System.out.println(efficientlyReachableCount);
    }
}
