package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/42748
 * K번째 수 - 정렬
 * Arrays.copyOfRange 사용합시다
 */
public class NumberOfK {
	public int[] solution(int[] array, int[][] commands) {
		int length = commands.length;
		int[] answer = new int[length];
		
		
		for (int i = 0; i < length; i++) {
			int start = commands[i][0] - 1;
			int end = commands[i][1] - 1;
			int target = commands[i][2] - 1;
			
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for(int k = start; k <= end; k++) {
				arr.add(array[k]);
			}
			Collections.sort(arr);
			answer[i] = arr.get(target);
		}
		
		return answer;
	}
}
