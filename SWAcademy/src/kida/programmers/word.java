package kida.programmers;

import java.util.Scanner;
import java.util.StringTokenizer;

public class word {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringTokenizer st = new StringTokenizer(str, " ");
		int max = -1;
		String max_str = "";
		while (st.hasMoreTokens()) {
			String tmp = st.nextToken();
			if (max < tmp.length()) {
				max = tmp.length();
				max_str = tmp;
			}

		}
		System.out.println("가장 긴 단어는 " + max_str + " 입니다.");
	}
}