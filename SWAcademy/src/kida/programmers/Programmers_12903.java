package kida.programmers;

import java.util.Scanner;

public class Programmers_12903 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String answer = "";
		int size = s.length();
		if(size % 2 == 0) {
			answer = s.substring((size - 1) / 2, ((size - 1) / 2) + 2);
		} else {
			// 단어의 길이가 홀수이면 가운데 글자 반환
			answer = String.valueOf(s.charAt(size / 2));
		}
		System.out.print("answer : " + answer);
	}
}
