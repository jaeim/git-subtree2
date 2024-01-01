package kida.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Programmers_12930 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

//		char[] arr = s.toCharArray();
//		String answer = "";
//		int idx = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] == ' ') {
//				idx = 0;
//			} else {
//				arr[i] = (idx % 2 == 0) ? Character.toUpperCase(arr[i]) : Character.toLowerCase(arr[i]);
//				idx++;
//			}
//		}
//		answer = String.valueOf(arr);
		String answer = "";
		String[] arr = s.split("");
		int idx = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(" ")) {
				idx = 0;
			} else {
				arr[i] = idx++ % 2 == 0 ? arr[i].toUpperCase() : arr[i].toLowerCase();
			}
			answer += arr[i];
		}


	}
}
