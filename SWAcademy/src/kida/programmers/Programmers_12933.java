package kida.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Programmers_12933 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long answer = 0;
//		String tmp = String.valueOf(n);
//		String[] arr_tmp = tmp.split("");
//		Arrays.sort(arr_tmp, (o1, o2) -> Integer.valueOf(o2) - Integer.valueOf(o1));
//		StringBuilder sb = new StringBuilder();
//		for(String s: arr_tmp) {
//			sb.append(s);
//		}
//		answer = Long.parseLong(sb.toString());
		
		String tmp = String.valueOf(n);
		String[] arr_tmp = tmp.split("");
		Arrays.sort(arr_tmp);

		StringBuilder sb = new StringBuilder();
		for(String s: arr_tmp) {
			sb.append(s);
		}
		answer = Long.parseLong(sb.reverse().toString());
		
		System.out.println(answer);
		
	}
}
