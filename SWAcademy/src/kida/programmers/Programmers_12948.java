package kida.programmers;

import java.util.Scanner;

public class Programmers_12948 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phone_number = sc.next();
		
//		String answer = "";
//		String[] str = phone_number.split("");
//		int size = str.length;
//		for(int i = 0; i < size - 4; i++) {
//			str[i] = "*";
//		} 
//		StringBuilder sb = new StringBuilder();
//		for(int i = 0; i < size; i++) {
//			sb.append(str[i]);
//		} 
//		answer = sb.toString();
//		System.out.println("answer : " + answer);
		
		
	// substring사용하기
//		String answer = "";
//		for(int i = 0; i < phone_number.length()- 4; i++) {
//			answer += "*";
//		}
//		answer += phone_number.substring(phone_number.length() - 4);
//		System.out.println("answer : " + answer);
		
		
		//toCharArray 사용하기
		String answer = "";
		char[] chArr = phone_number.toCharArray();
		for(int i = 0; i < chArr.length - 4; i++) {
			chArr[i] = '*';
		}
		answer = String.valueOf(chArr);
		System.out.println("answer : " + answer);
	}
}
