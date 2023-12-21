package kida.programmers;

import java.util.Scanner;

public class Programmers_12919 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] seoul = new String[2];
		for(int i = 0; i < 2; i++) {
			seoul[i] = sc.next();
		}
		
		String answer = "";
		for(int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				answer = "김서방은 " + i + "에 있다";
				break;
			}
		}
		
//		
//		return answer;
		
	}
}
