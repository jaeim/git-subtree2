package kida.programmers;

import java.util.Scanner;

public class Programmers_82612 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int money = sc.nextInt();
		int count = sc.nextInt();
		long answer = -1;
		
		long total = 0;
		for(int i = 1; i <= count; i++) {
			total += (i * price);
		}
		answer = (money - total) < 0 ? (money - total) * -1 : 0;
		System.out.println("answer is " + answer);
	}
}
