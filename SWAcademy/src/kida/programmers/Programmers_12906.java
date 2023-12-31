package kida.programmers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Programmers_12906 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int tmp = -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != tmp) {
				list.add(arr[i]);
				tmp = arr[i];
			}
		}
		int[] answer = new int[list.size();
		for(int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
	}
}
