package programmers;

/* 큰 수 만들기 - 개어렵네..
 * https://school.programmers.co.kr/learn/courses/30/lessons/42883
 */
import java.util.*;

public class MakingMax {
	public static void main(String[] args) {
		String number = "4177252841";
		int k = 4;
		String answer = "";

		// 스택에 number를 차례대로 삽입한다.
		Stack<String> stack = new Stack<String>();
		String[] arr = number.split("(?!^)");

		int pop_cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			int now = Integer.parseInt(arr[i]);
			while (!stack.empty()) {
				int cmp = Integer.parseInt(stack.peek());
				if (now > cmp && pop_cnt < k) {
					stack.pop();
					pop_cnt++;
				} else
					break;
			}
			stack.push(arr[i]);
		}
		// pop을 한 횟수가 k에 도달하지 못했다? => 앞에 있는 놈들이 큰 수들이다 => 오른쪽에서부터 하나씩 지워라
		while (pop_cnt < k && !stack.empty()) {
			stack.pop();
		}

		System.out.println(answer);
	}

	public String solution(String number, int k) {
		String answer = "";

		// 스택에 number를 차례대로 삽입한다.
		Stack<String> stack = new Stack<String>();
		String[] arr = number.split("(?!^)");

		int pop_cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			int now = Integer.parseInt(arr[i]);
			while (!stack.empty()) {
				int cmp = Integer.parseInt(stack.peek());
				if (now > cmp && pop_cnt < k) {
					stack.pop();
					pop_cnt++;
				} else
					break;
			}
			stack.push(arr[i]);
		}
		// pop을 한 횟수가 k에 도달하지 못했다? => 앞에 있는 놈들이 큰 수들이다 => 오른쪽에서부터 하나씩 지워라
		while (pop_cnt < k && !stack.empty()) {
			stack.pop();
			pop_cnt++;
		}

		String[] ans_arr = new String[arr.length - k];
		Iterator<String> itr = stack.iterator();
		int idx = 0;
		while(itr.hasNext()) {
			ans_arr[idx++] = itr.next();
		}
		StringBuffer buffer = new StringBuffer();
		for (String s : ans_arr) {
			buffer.append(s);
		}
		answer = buffer.toString();
		return answer;
	}
}
