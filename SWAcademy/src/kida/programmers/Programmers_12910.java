package kida.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Programmers_12910 {
	public static void main(String[] args) throws IOException {
		ArrayList<Integer> list = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		while (st.hasMoreTokens()) {
			list.add(Integer.valueOf(st.nextToken()));
		}
		int size = list.size();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = list.get(i);
		}
		int divisor = Integer.valueOf(br.readLine());
		/////////////////
		int[] answer = {};
		ArrayList<Integer> answerArrayList = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				answerArrayList.add(arr[i]);
			}
		}
		
		if (answerArrayList.size() == 0) {
			answerArrayList.add(-1);
		}
		Collections.sort(answerArrayList, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		answer = new int[answerArrayList.size()];
		for (int i = 0; i < answerArrayList.size(); i++) {
			answer[i] = answerArrayList.get(i);
		}
		for (int i : answer) {
			System.out.print(i + " ");
		}

	}
}
