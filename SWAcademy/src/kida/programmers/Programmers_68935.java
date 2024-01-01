package kida.programmers;

import java.util.Scanner;

public class Programmers_68935 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String tmp = "";
		while(n > 0) {
			tmp += String.valueOf(n % 3);
			n /= 3;
		}
		int answer = Integer.parseInt(tmp, 3);
		System.out.print(answer);
	}
}
