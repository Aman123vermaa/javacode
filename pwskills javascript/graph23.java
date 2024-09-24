import java.util.*;
public class graph23 {
    

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
		System.out.println("bfs start ");
		boolean vis[] = new boolean[node+1];
		for(int i = 0; i<= node; i++) {
		    vis[i] = false;
		}
		Queue<Integer> q = new LinkedList<>();
		q.add(3);
		while(q.isEmpty() == false) {
		    int temp = q.remove();
		    if(vis[temp] == true) {
		        continue;
		    }
		    System.out.print(temp+ " -> ");
		    vis[temp] = true;
		    for(int x : adj[temp]) {
		        q.add(x);
		    }
		}
		
		
    }	
}