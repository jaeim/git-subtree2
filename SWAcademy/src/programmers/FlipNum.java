package programmers;
/*
 * 자연수 뒤집어 배열로 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12932
 */

public class FlipNum {
	public int[] solution(long n) {
		/*
		String str = String.valueOf(n);
		int[] answer = new int[str.length()];
		int idx = 0;
		for(int i = str.length() - 1; i >= 0; i--) {
			answer[idx++] = Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		return answer;
		*/
		
		int size = String.valueOf(n).length();
		int[] answer = new int[size];
		int idx = 0;
		while(n > 0) {
			answer[idx++] = (int) (n % 10);
			n /= 10;
		}
		
		return answer;
	}
}
