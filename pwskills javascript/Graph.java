import java.util.*;
public class Graph
{
    public static void dfs(int node,ArrayList<Integer> adj[],boolean vis[]) {
        vis[node] = true;
        
        for(int x : adj[node]) {
            if(vis[x] == false) {
                System.out.println(node + " -> "+ x);
                dfs(x,adj,vis);
            }
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("total number of node : ");
		int node = sc.nextInt();
// 		ArrayList<Integer> arr;
// 		arr = new ArrayList<>();
		ArrayList<Integer> adj[] = new ArrayList[node+1];
		for(int i = 0; i<=node; i++) {
		    adj[i] = new ArrayList<>();
		}
		System.out.println("total edges : ");
		int edges = sc.nextInt();
		for(int i =0; i<edges; i++) {
		    int u = sc.nextInt();
		    int v = sc.nextInt();
		    adj[u].add(v);
		    adj[v].add(u);
		}
		for(int i = 0; i<=node; i++) {
		    System.out.print(i+" -> ");
		    for(int j: adj[i]) {
		        System.out.print(j+ " ");
		    }
		    System.out.println();
		}
		System.out.println("dfs calling ");
		boolean vis[] = new boolean[node+1];
		for(int i = 0; i<= node; i++) {
		    vis[i] = false;
		}
		dfs(5,adj,vis);
		System.out.println();
		for(int i= 0; i<=node; i++) {
		    if(vis[i] == true) {
		        System.out.println(i+ " visited");
		    }
		    else {
		        System.out.println(i+" not visited ");
		    }
		}
	}
}