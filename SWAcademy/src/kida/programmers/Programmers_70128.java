package kida.programmers;

import java.util.Scanner;

public class Programmers_70128 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 4;
		int[] a = new int[size];
		int[] b = new int[size];
		for(int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < size; i++) {
			b[i] = sc.nextInt();
		}
		int answer = 0;
		for(int i = 0; i < a.length; i++) {
			answer += a[i] * b[i];
		}
		
		System.out.println("answer : " + answer);
		
	}
}
