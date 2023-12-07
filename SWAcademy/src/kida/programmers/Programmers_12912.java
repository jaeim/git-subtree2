package kida.programmers;

import java.util.Scanner;

public class Programmers_12912 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		long answer = 0;
		
		int start = Math.min(a, b);
		int end = Math.max(a, b);
		for(int i = start; i <= end; i++) {
			answer += i;
		}
		System.out.println(answer);
	}
}
