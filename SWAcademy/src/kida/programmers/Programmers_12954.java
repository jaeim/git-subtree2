package kida.programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;



public class Programmers_12954 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		long[] arr = new long[n];
//		arr[0] = x;
		for (int i = 0; i < n; i++) {
			arr[i] = (i == 0) ? x : arr[i - 1] + x;
		}
		for(long a : arr) {
			System.out.println(a);			
		}
	}
}
