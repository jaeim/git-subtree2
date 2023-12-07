package kida.programmers;

import java.util.Scanner;

public class Programmers_12943 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int answer = 0;
		int cnt = 0;
		if(num == 1) {
			answer = 0;
		} else {
			while (num != 1 && cnt < 500) {
				if (num % 2 == 0) {
					num /= 2;
				} else if(num % 2 == 1) {
					num = (num * 3) + 1;
				} cnt++;
			}
			if (num != 1) answer = -1; 
			else answer= cnt;
		}
		
		 System.out.println(answer);
		
	}
}
