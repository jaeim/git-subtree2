package kida.programmers;

import java.util.Scanner;

public class Programmers_12937 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String answer = "";
		answer = (num % 2 == 0) ? "Even" : "Odd";
		System.out.print(answer);
	}
}
