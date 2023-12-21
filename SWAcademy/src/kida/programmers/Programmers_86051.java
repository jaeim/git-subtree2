package kida.programmers;

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Programmers_86051 {
	public static void main(String[] args) throws IOException {
		int size = 7;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] numbers = new int[size];
		int idx = 0;
		while(st.hasMoreTokens()) {
			numbers[idx++] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0;
		int[] checked = new int[10]; //0-9
		for(int i = 0; i < numbers.length; i++) {
			checked[numbers[i]]++;
		}
		for(int i = 0; i < checked.length; i++) {
			if(checked[i] <= 0) answer += i;
		}
		
		System.out.print("answer : " + answer);
	}
}
