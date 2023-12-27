package kida.programmers;

import java.util.Scanner;

public class Programmers_77884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int left = sc.nextInt();
		int right = sc.nextInt();
		int answer = 0;
		int size = right - left + 1;
		int[] sample = new int[size];
		
		for(int i = 0; i < size; i++) {
			sample[i] = left++;
			int cnt = 0;
			for(int j = 1; j <= (int)Math.sqrt(sample[i]); j++) {
				if(sample[i] % j == 0) {
					cnt++;
					if(sample[i] / j != j) cnt++;
				}
			}
			answer += (cnt % 2 == 0) ? sample[i] : -1 * sample[i];
		}
		
		System.out.print("answer: " + answer);
	}
}
