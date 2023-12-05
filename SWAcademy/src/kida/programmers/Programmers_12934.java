package kida.programmers;

import java.util.Scanner;

public class Programmers_12934 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long answer = 0;
//		double tmp = Math.sqrt(n); 
//		if(tmp % 1 == 0) {
//			answer = ((long)tmp + 1) * ((long)tmp + 1);
//		} else {
//			answer = -1;
//		}
		if ((Math.pow((long)Math.sqrt(n),2)) == n) {
			answer = (long)Math.pow(Math.sqrt(n) + 1, 2);
		} else {
			answer = -1;
		}
		
		System.out.print(answer);
	}
}
