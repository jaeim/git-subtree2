package programmers;

public class XIntervalN {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		// n은 자연수니까 answer[0]은 무조건 존재한다..
		answer[0] = x;
		for (int i = 1; i < n; i++) {
			answer[i] = (long) answer[i - 1] + x;
		}
		return answer;
	}
}
