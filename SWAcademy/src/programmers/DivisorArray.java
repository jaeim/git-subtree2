package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/*
 * 나누어 떨어지는 숫자 배열 lv1
 * Arrays.stream().filter().toArray()의 향연..
 * https://school.programmers.co.kr/learn/courses/30/lessons/12910
 * 
 */
public class DivisorArray {
	public int[] solution(int[] arr, int divisor) {
		/*
		LinkedList<Integer> list = new LinkedList<>();
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				list.add(arr[i]);
				cnt++;
			}
		}
		if (cnt == 0)	list.add(-1);
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 < o2) return -1;
				else if (o1 > o2) return 1;
				return 0;
			}

		});
		
		int[] answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		*/
		int[] answer = Arrays.stream(arr).filter(n -> n % divisor == 0).toArray();
		if (answer.length == 0)	answer = new int[] {-1};
		Arrays.sort(answer);
		
		return answer;
	}
}
