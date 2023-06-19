package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ToBinaryString {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
//		// 10진수 -> 2진수
//		int num = sc.nextInt();
//		System.out.println(num + "을 2진수로 바꾸면? " + Integer.toBinaryString(num));
//
//		// 2진수 -> 10진수
//		String str = sc.next();
//		System.out.println(str + "을 10진수로 바꾸면? " + Integer.parseInt(str, 2));
		
		int num = 3;
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		for (int i = 0; i < num; i++) {
//			System.out.println(Integer.parseInt(st.nextToken()));
//		}
		
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		for (int s: arr) {
			System.out.println(s);
		}
		
	}
}
