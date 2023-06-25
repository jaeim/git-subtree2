package programmers;
/*
 * 두 정수 사이의 합 -lv1
 * https://school.programmers.co.kr/learn/courses/30/lessons/12912
 */
public class BetweenSum {
	public long solution(int a, int b) {
		long answer = 0;
		if (a == b) return a;
		for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
			answer += i;
		}
		return answer;
	}
}
