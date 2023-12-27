package kida.programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Programmers_12917 {
	public static void main(String[] args) {
		String s = "Zbcdefg";
		String answer = "";
//		char[] tmp = s.toCharArray();
//		Arrays.sort(tmp);
//		StringBuilder sb = new StringBuilder(String.valueOf(tmp));
//		answer = sb.reverse().toString();
		
		String[] array = s.split("");
		Arrays.sort(array, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});
		answer = Arrays.toString(array);

		System.out.println("answer : " + answer);
	}
}
