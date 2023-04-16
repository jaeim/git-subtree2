package softeer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
/*
 * [프로그래머스] 게임 맵 최단거리 (가중치가 0과 1인 경우) // 가중치가 숫자면 다익스트라 알고리즘
 * https://school.programmers.co.kr/learn/courses/30/lessons/1844
 * 
 */
public class BFS_Shortest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};
		int ans = solution(maps);
		
		System.out.print(ans);
	}

	public static int solution(int[][] maps) {
		int answer = 0;
		int n = maps.length;
		int m = maps[0].length;
		int[][] visited = new int[n][m];
		
		bfs(maps, visited, n, m);
		answer = visited[n - 1][m - 1];
		
		if (visited[n-1][m-1] == 0) answer = -1;
		
		return answer;
	}
	
	// 동, 남 방향부터 먼저 가도록 셋팅..
	static int[] dx = {0,1,0,-1}; 
	static int[] dy = {1,0,-1,0}; 
	
	public static void bfs(int[][] maps, int[][] visited, int n, int m) {
		ArrayList<Integer> a = new ArrayList<Integer>();

        Collections.sort(a, (o1, o2)->)
		// 목적지는 (n-1, m-1);
		int x = 0;
		int y = 0;
		visited[x][y] = 1;
		
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] {x, y});
		
		while(!q.isEmpty()) {
			int[] t = q.poll();
			for (int i = 0; i < dx.length; i++) {
				int tx = t[0] + dx[i];
				int ty = t[1] + dy[i];
				if (tx >= 0 && ty >= 0 && tx < n && ty < m) {
					if (maps[tx][ty] == 1 && visited[tx][ty] == 0) {
						visited[tx][ty] += visited[t[0]][t[1]] + 1;
						q.add(new int[] {tx, ty});
					}
				}
			}
		}
	}
}
