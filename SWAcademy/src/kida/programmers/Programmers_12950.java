package kida.programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Programmers_12950 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 2;
		int size2 = 2;
		int[][] arr1 = new int[size][size2];
		int[][] arr2 = new int[size][size2];
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size2; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size2; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		int[][] answer = new int[arr1.length][arr1[0].length];
		for(int i = 0; i < answer.length; i++) {
			for(int j = 0; j < answer[0].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		for(int[] a : answer) {
			System.out.print(Arrays.toString(a));
		}
		
		
		
		
	}
}
