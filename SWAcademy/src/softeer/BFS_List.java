package softeer;
/* 예제
 * 
 * input:
5 5 3
5 4
5 2
1 2
3 4
3 1
 * 
 * 
 * output:
3 1 2 5 4 // dfs
3 1 4 2 5 // bfs
 *
 */

import java.util.*;

public class BFS_List {
	public static void main(String[] args) {
//    1. bfs 인접리스트로 구현하기
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt(); // 정점 갯수
      int m = sc.nextInt(); // 간선 갯수
      int v = sc.nextInt(); // 시작 정점

      boolean[] visited = new boolean[n + 1]; // 방문여부 검사 배열

      LinkedList<Integer>[] list = new LinkedList[n + 1];
      
      for (int i = 0; i < n + 1; i++) {
    	  list[i] = new LinkedList<Integer>();
      }
      
      for (int i = 0; i < m; i++) {
    	  int v1 = sc.nextInt();
          int v2 = sc.nextInt();
          list[v1].add(v2);
          list[v2].add(v1);
      }
      
      for (int i = 0; i < n + 1; i++) {
    	  Collections.sort(list[i]);
      }
      
      System.out.println("BFS - 인접리스트 사용");
      bfs_list(v, list, visited);
	}

	private static void bfs_list(int v, LinkedList<Integer>[] list, boolean[] visited) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(v);
		visited[v] = true;
		
		while(!q.isEmpty()) {
			int t = q.poll();
			System.out.print(t + " ");
			Iterator<Integer> iter = list[t].iterator();
			
			while(iter.hasNext()) {
				int k = iter.next();
				if (!visited[k]) {
					visited[k] = true;
					q.add(k);
				}
			}
		}
		
	}
}
