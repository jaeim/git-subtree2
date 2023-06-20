package programmers;
/*
 * 큰 수 만들기 - 개어렵네..
 * https://school.programmers.co.kr/learn/courses/30/lessons/42883
 */
import java.util.*;

public class MakingMax {
	public static void main(String[] args) {
		
		String number = "4177252841";
		int k = 4;
		
		String answer = "";
		
		String[] str = number.split("");
		
		int cnt = 0;
		for(int i = 0; i < str.length; i++) {
			int pivot = Integer.parseInt(str[i]);
			int peek_idx = 0;
			for(int j = 0; j < str.length; j++) {
				// 음수이면 이미 삭제된 원소라는 뜻
				if (Integer.parseInt(str[j]) < 0) continue;
				if (pivot > Integer.parseInt(str[j])) {
					str[j] = "-1";
					cnt++;
					break;
				}
			}
			if (cnt == k) break;
		}
		
		// cnt < k
		System.out.println(answer);
	}
}
