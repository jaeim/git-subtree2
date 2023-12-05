package kida.programmers;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Programmers_12944 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sarr = sc.next();
		String[] sarr2 = sarr.split(",");
		int[] arr = new int[sarr2.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(sarr2[i]);
		}
		
		double answer = 0;
		for (int i : arr) {
			answer += i;
		}
		answer = (double) answer / arr.length;
		System.out.println(answer);
	}
}
