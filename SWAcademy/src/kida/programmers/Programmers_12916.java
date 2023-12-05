package kida.programmers;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Programmers_12916 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean answer = true;
		s = s.toLowerCase();
		int num = 0;
		if (!s.contains("p") && !s.contains("y"))
			answer = true;
		else {
			String[] str = s.split("");
			for (String t : str) {
				if (t.equals("p")) {
					num++;
				} else if (t.equals("y")) {
					num--;
				}
			}
		}
		if (num != 0) {
			answer = false;
		}
		System.out.println(answer);

	}
}
