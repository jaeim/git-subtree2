package kida.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;



public class Programmers_12935 {
	public static void main(String[] args) throws IOException {
		int size = 4;
		int[] arr = new int[size];
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < size; i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}
		
		
		int[] answer = {};
		if(arr.length == 1) {
			answer = new int[1];
			answer[0] = -1;
		}
		else {
//			int min = arr[0];
//			for(int i = 1; i < arr.length; i++) {
//				min = Math.min(min, arr[i]);
//			}
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			for(int i : arr) {
				arrayList.add(i);
			} 
			arrayList.remove(arrayList.indexOf(Collections.min(arrayList)));
			answer = new int[arrayList.size()];
			for(int i = 0; i < arrayList.size(); i++) {
				answer[i] = arrayList.get(i);
			}
			
		}
		
		
	}
}
