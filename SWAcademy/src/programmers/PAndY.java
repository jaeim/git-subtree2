package programmers;
/*
 * 문자열 내 p와 y의 개수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12916
 */

import java.util.StringTokenizer;
/*
 * 문자열 내 p와 y의 갯수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12916
 * - cnt 변수를 하나만 써도 되는 구나..
 * - 대/소문자를 구분안하니까 toUpperCase or toLowerCase를 쓰면 되겠다.
 */
public class PAndY {
	boolean solution(String s) {
		/*
		boolean answer = true;
		String[] arr = s.split("");
		int pCnt = 0;
		int yCnt = 0;
		for(String st : arr) {
			if (st.equals("p") || st.equals("P")) pCnt++;
			if (st.equals("y") || st.equals("Y")) yCnt++;
		}
		if ((pCnt == 0 && yCnt == 0) || (pCnt == yCnt)) return true;
		else if (pCnt != yCnt) return false;
		
		return answer;
		*/
		s = s.toUpperCase();
		int cnt = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'P') cnt++;
			if (s.charAt(i) == 'Y') cnt--;
		}
		
		if (cnt != 0) return false;
		return true;
	}
}
