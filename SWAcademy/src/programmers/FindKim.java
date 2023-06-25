package programmers;

import java.util.Arrays;

/*
 * 서울에서 김서방 찾기 lv1
 * https://school.programmers.co.kr/learn/courses/30/lessons/12919
 */
public class FindKim {
	public String solution(String[] seoul) {
		/*
		String answer = "";
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				answer = "김서방은 " + i + "에 있다";
				break;
			}
		}
		*/
		int idx = Arrays.asList(seoul).indexOf("Kim");
		return "김서방은 " + idx + "에 있다";
	}
}
