package kida.programmers;

import java.util.Scanner;

public class Programmers_12931 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
//		String[] tmp = String.valueOf(n).split("");
//		for (String t : tmp) {
//			answer += Integer.parseInt(t);
//		}
		while (n > 0) {
			answer += n % 10;
			n /= 10;
		}
		System.out.println(answer);
	}
}
