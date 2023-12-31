package kida;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS_BFS2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt();
		
		LinkedList<Integer>[] list = new LinkedList[n + 1];
		for(int i = 0; i < list.length; i++) {
			list[i] = new LinkedList<Integer>();
		}
		
		for(int i = 0; i < m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			list[v1].add(v2);
			list[v2].add(v1);
		}
		
		for(int i = 0; i < list.length; i++) {
			Collections.sort(list[i]);
		}
		
		boolean[] checked = new boolean[n + 1];
		boolean[] checked2 = new boolean[n + 1];
		
		dfs(v, list, checked);
		System.out.println();
		bfs(v, list, checked2);
	}
	
	public static void dfs(int v, LinkedList<Integer>[] list, boolean[] checked) {
		checked[v] = true;
		System.out.print(v + " ");
		for(int i = 0; i < list[v].size(); i++) {
			if(checked[list[v].get(i)] == false) {
				dfs(list[v].get(i), list, checked);
			}
		}
	}
	
	public static void bfs(int v, LinkedList<Integer>[] list, boolean[] checked) {
		Queue<Integer> queue = new LinkedList<Integer>();
		checked[v] = true;
		queue.add(v);
		while(!queue.isEmpty()) {
			int visited = queue.poll();
			System.out.print(visited + " ");
			for(int i = 0; i < list[visited].size(); i++) {
				if (checked[list[visited].get(i)] == false) {
					checked[list[visited].get(i)] = true;
					queue.add(list[visited].get(i));
				}
			}
		}
		
	}
}
