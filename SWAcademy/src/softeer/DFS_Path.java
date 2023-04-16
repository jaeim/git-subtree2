package softeer;

import java.util.*;

/* 
 * https://minhamina.tistory.com/60 // dfs를 이용하여 모든 경로 출력
 * input: 
4 5 1 3
1 2
1 3
1 4
2 4
3 4

 * output:
1 2 4 3 
1 3 
1 4 3 
 */

public class DFS_Path {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 정점의 개수
		int m = sc.nextInt(); // 간선의 개수
		int v = sc.nextInt(); // 탐색을 시작할 정점의 번호 (출발지)
		int end = sc.nextInt(); // 탐색을 끝낼 정점의 번호 (목적지)

		Stack<Integer> stack = new Stack<>(); // 경로를 받기 위한 스택

		boolean visited[] = new boolean[n + 1];
		int[][] adjArray = new int[n + 1][n + 1];

		for (int i = 0; i < m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();

			adjArray[v1][v2] = 1;
			adjArray[v2][v1] = 1;
		}

		dfs_allPath(v, end, stack, adjArray, visited);
	}

	private static void dfs_allPath(int v, int end, Stack<Integer> stack, int[][] adjArray, boolean[] visited) {
		// TODO Auto-generated method stub
		visited[v] = true;
		stack.push(v);

		if (v == end) {
			for (int i = 0; i < stack.size(); i++) {
				System.out.print(stack.elementAt(i) + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < adjArray[v].length; i++) {
			if (adjArray[v][i] == 1 && !visited[i]) {
				dfs_allPath(i, end, stack, adjArray, visited);
				// 3. dfs 후에 방문 노드를 false로 만들어주어 해당 노드를 방문하지 않은 것으로 해줌
				// -> 모든 경로를 구하기 위함
				visited[i] = false;
			}
		}
		stack.pop();

	}
}
