package programmers;

/*
 * 음양 더하기 lv1
 * https://school.programmers.co.kr/learn/courses/30/lessons/76501
 */
public class PlusMinusSum {
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		for (int i = 0; i < absolutes.length; i++) {
//			answer = signs[i] ? answer + absolutes[i] : answer - absolutes[i];
			answer += absolutes[i] * (signs[i] ? 1 : -1);
		}
		return answer;
	}
}
