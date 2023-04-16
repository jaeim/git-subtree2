package softeer;

import java.util.Scanner;
import java.util.Stack;
//#백준 1260
//첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 
//간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V가 주어진다. 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다. 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다.
//입력으로 주어지는 간선은 양방향이다.
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
public class DFS_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt();

		boolean[] visited = new boolean[n + 1];

		int[][] adjArray = new int[n + 1][n + 1];
		for (int i = 0; i < m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			adjArray[v1][v2] = 1;
			adjArray[v2][v1] = 1;
		}

//		System.out.println("dfs - 인접행렬/재귀");
//		dfs_array_recursion(v, adjArray, visited);
		System.out.println("dfs - 인접행렬/스택");
		dfs_array_stack(v, adjArray, visited, true);
	}

	private static void dfs_array_stack(int v, int[][] adjArray, boolean[] visited, boolean flag) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<Integer>();
		s.push(v);
		visited[v] = true;
		System.out.print(v + " ");

		while(s.size() > 0) {
			// stack은 후입선출이다..아직 pop하긴 이르다...
			int t = s.peek();
			flag = false; // false : 아직 자식노드가 있는 정점을 찾지 못했다!
			
			for (int i = 1; i < adjArray[t].length; i++) {
				if (adjArray[t][i] == 1 && !visited[i]) {
					visited[i] = true;
					s.push(i);
					flag = true; // true: 자식노드를 갖고 있는 정점을 찾았으니 반복문을 나가자!
					System.out.print(i + " ");
					break;
				}
			}
			if (!flag) { // 자식노드가 있는 정점을 발견하지 못했으니 해당 정점은 삭제..
				s.pop();
			}		
		}
		
	}

	private static void dfs_array_recursion(int v, int[][] adjArray, boolean[] visited) {
		// TODO Auto-generated method stub
		System.out.print(v + " ");
		visited[v] = true;
		for(int i = 0; i < adjArray[v].length; i++) {
			if (adjArray[v][i] == 1 && !visited[i]) {
//				visited[i] = true;
				dfs_array_recursion(i, adjArray, visited);
			}
		}
		
	}
}
