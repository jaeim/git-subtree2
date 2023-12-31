package kida.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Meeting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] arr = new int[size][2];
		for(int i = 0; i < size; i++) {
			int[] tmp = new int[2];
			for(int j = 0; j < tmp.length; j++) {
				tmp[j] = sc.nextInt();
			}
			arr[i] = tmp;
		}
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1])
					return o1[0] - o2[0]; 
				return o1[1] - o2[1];
			}
		});
		
		int cnt = 0;
		int endTime = 0;
		for(int i = 0; i < arr.length; i++) {
			if(endTime <= arr[i][0]) {
				endTime = arr[i][1];
				cnt++;
			}
		}
		System.out.print(cnt);
		
	}
}
