package kida.programmers;

import java.util.Scanner;

public class Programmers_12947 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		boolean answer = true;
		String[] str = String.valueOf(x).split("");
		int sum = 0;
		for(String s: str) {
			sum += Integer.valueOf(s);
		}
		if (x % sum == 0) answer = true;
		else answer = false;
		
		System.out.print(answer);
	}
}
