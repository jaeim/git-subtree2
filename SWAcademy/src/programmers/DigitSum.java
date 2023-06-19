package programmers;

import java.util.StringTokenizer;

/*
 * 자릿수 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12931
 */
public class DigitSum {
	public static void main(String[] args) {
		int n = 100;
		/* 
		int answer = 0;
		String[] str = String.valueOf(n).split("");
		
		for (String s: str) {
			answer += Integer.parseInt(s);
		}
		System.out.println(answer);
		*/
		
		// 타입변환 없이 해결하는 방법
		int answer = 0;
		while(n >= 10) {
			answer += n % 10;
			n /= 10;
		} answer += n;
		System.out.println(answer);
	}
}
