import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TreeOfTrustedServer {
    static List<List<Integer>> adj;
    static int[] keys;
    static int k;
    static int trustedServersCount = 0;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        k = sc.nextInt();
        keys = new int[N + 1];
        for (int i = 1; i<=N; i++){
            keys[i]= sc.nextInt();
        }
        adj = new ArrayList<>();
        for (int i = 0; i<=N; i++){
            adj.add(new ArrayList<>());
        }
        for (int i=0; i<N-1; i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        dfs(1,0,0);

       
        System.out.println(trustedServersCount);
    }

    public static void dfs(int u, int parent, int currentPathXor) {
        int pathXorAtU = currentPathXor ^ keys[u];
        if (pathXorAtU >= k){
            trustedServersCount++;
        }
        for (int v : adj.get(u)){
            if (v !=parent){
                dfs(v,u,pathXorAtU);
            }
        }
        sc.close();
    }
}
