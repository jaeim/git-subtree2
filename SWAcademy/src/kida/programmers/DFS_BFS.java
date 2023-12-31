package kida.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class DFS_BFS {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = 0;
		int m = 0;
		int start = 0;
		int ii = st.countTokens();
		for(int i = 0; i < ii; i++) {
			if(i == 0) n = Integer.parseInt(st.nextToken());
			else if(i == 1) m = Integer.parseInt(st.nextToken());
			else start = Integer.parseInt(st.nextToken());
		}
	
		boolean[] checked = new boolean[n + 1];
		boolean[] checked2 = new boolean[n + 1];
		
		// 인접리스트 구현
		LinkedList<Integer>[] linkedLists = new LinkedList[n + 1];
		for(int i = 0; i < n + 1; i++) {
			linkedLists[i] = new LinkedList<Integer>();
		}
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int idx = Integer.parseInt(st.nextToken());
			int node = Integer.parseInt(st.nextToken());
			linkedLists[idx].add(node);
			linkedLists[node].add(idx);
		}
		
		dfs(start, linkedLists, checked);
		System.out.println();
		bfs(start, linkedLists, checked2);
	}
	
	public static void dfs(int start, LinkedList<Integer>[] linkedLists, boolean[] checked) {
		checked[start] = true;
		System.out.print(start + " ");
		for(int i = 0; i < linkedLists[start].size(); i++) {
			if(checked[linkedLists[start].get(i)] == false) {
				dfs(linkedLists[start].get(i), linkedLists, checked);	
			}
		}
	}
	
	public static void bfs(int start, LinkedList<Integer>[] linkedLists, boolean[] checked) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);
		checked[start] = true;
		while(!queue.isEmpty()) {
			int visited = queue.poll();
			System.out.print(visited + " ");
			for(int i = 0; i < linkedLists[visited].size(); i++) {
				if(checked[linkedLists[visited].get(i)] == false) {
					queue.add(linkedLists[visited].get(i));
					checked[linkedLists[visited].get(i)] = true;
				}
			}
		}
	}
}
