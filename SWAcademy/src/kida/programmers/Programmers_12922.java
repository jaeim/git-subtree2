package kida.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Programmers_12922 {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String answer = "";
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				answer += "수";
			} else {
				answer += "박";				
			}
		}
		System.out.print("answer : " + answer);
		
	}
}
