package programmers;

/*
 * 하샤드 수 - lv1
 * https://school.programmers.co.kr/learn/courses/30/lessons/12947
 */
public class HarshadNum {
	public boolean solution(int x) {
		int tmp = x;
		int sum = 0;
		while(tmp > 0) {
			sum += tmp % 10;
			tmp /= 10;
		}
		return x % sum == 0 ? true : false;
	}
}
