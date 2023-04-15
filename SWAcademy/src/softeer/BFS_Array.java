package softeer;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// #백준 1260
// 첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 
// 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V가 주어진다. 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다. 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다.
// 입력으로 주어지는 간선은 양방향이다.
/* 예제
 * 
 * input:
4 5 1
1 2
1 3
1 4
2 4
3 4
 * 
 * 
 * output:
 * 1 2 4 3 // dfs
 * 1 2 3 4 // bfs
 *
 */

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
public class BFS_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 정점 갯수
		int m = sc.nextInt(); // 간선 갯수
		int v = sc.nextInt(); // 시작 정점

		boolean[] visited = new boolean[n + 1];

		int[][] adArray = new int[n + 1][n + 1];

		// 두 점 사이에 간선
		// 주어지는 간선은 양방향이다.
		for (int i = 0; i < m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			adArray[v1][v2] = 1;
			adArray[v2][v1] = 1;
		}

		System.out.println("BFS - 인접행렬");
		bfs_array(v, adArray, visited);

	}

	private static void bfs_array(int v, int[][] adArray, boolean[] visited) {
		// v: 시작점
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(v);
		visited[v] = true;
		while(!q.isEmpty()) {
			int t = q.poll();
			System.out.print(t);
			for (int i = 1; i < adArray.length; i++) {
				if (adArray[t][i] == 1 && visited[i] != true) {
					q.add(i);
					visited[i] = true;				
				}
			}
		} System.out.println();
		
	}
}
