package kida.programmers;

import java.io.BufferedReader;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Programmers_12940 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		int[] answer = new int[2];
		// n * m = L * G
		int mini = 0;
		int maxi = 0;
		for(int i = 1; i <= Math.min(n,m); i++) {
			if(n % i == 0 && m % i == 0) {
				maxi = i;
			}
		}
		for(int i = n * m; i >= Math.min(n, m); i--) {
			if(i % n == 0 && i % m == 0) {
				mini = i;
			}
		}
		answer[0] = maxi;
		answer[1] = mini;
		System.out.print("answer : " + Arrays.toString(answer));
		

	}
}
