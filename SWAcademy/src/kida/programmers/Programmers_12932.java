package kida.programmers;

import java.util.Random;
import java.util.Scanner;

public class Programmers_12932 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
//		String[] str = String.valueOf(n).split("");
//		int answer[] = new int[str.length];
//		for(int i = 0; i < answer.length; i++) {
//			answer[i] = Integer.valueOf(str[answer.length - 1 -i]);
//		}

		StringBuilder sb = new StringBuilder(String.valueOf(n));
		String s = sb.reverse().toString();
		int[] answer = new int[sb.length()];
//		System.out.println(s.charAt(0));
		for(int i = 0; i < sb.length(); i++) {
			answer[i] = Integer.valueOf(String.valueOf(s.charAt(i)));
		}
		for(int i : answer) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
