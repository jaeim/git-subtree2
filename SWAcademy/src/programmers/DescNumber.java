package programmers;

import java.util.Arrays;
import java.util.Comparator;

/*
 * 정수 내림차순으로 배치하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12933
 */
public class DescNumber {
	public long solution(long n) {
		long answer = 0; 
		String[] str_arr = String.valueOf(n).split("");
		Arrays.sort(str_arr, (o1, o2) -> Integer.parseInt(o2) - Integer.parseInt(o1));
		/*
		Arrays.sort(str_arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if (Integer.parseInt(o1) < Integer.parseInt(o2)) return 1;
				else if (Integer.parseInt(o1) > Integer.parseInt(o2)) return -1;
				else return 0;
			}
		}); 
		*/
		
		String tmp = "";
		for (String s : str_arr) {
			tmp += s;
		}
		answer = Long.parseLong(tmp);

		return answer;
	}
}
