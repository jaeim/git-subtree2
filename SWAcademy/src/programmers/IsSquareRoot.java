package programmers;

/*
 * 정수 제곱근 판별 - lv1
 * https://school.programmers.co.kr/learn/courses/30/lessons/12934
 */
public class IsSquareRoot {
	public long solution(long n) {
		/*
		long answer = 0;
		while (n >= (answer * answer)) {
			if (n == (answer * answer))	return (answer + 1) * (answer + 1);
			answer++;
		}
		return -1;
		*/
		
		// int로 타입캐스팅을 안하면 n이 3같은 애들이 와도 거를 수 없겠지
		if (Math.pow((int)Math.sqrt(n), 2) == n) {
			return (long) Math.pow(Math.sqrt(n) + 1, 2);
		}
		return -1;
	}
}
