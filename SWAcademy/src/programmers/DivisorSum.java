package programmers;
/*
 * 약수의 합
 * https://school.programmers.co.kr/learn/courses/30/lessons/12928
 */
public class DivisorSum {
	public int solution(int n) {
        int answer = 0;
        /*
        for (int i = 1; i <= n; i++) {
        	if (n % i == 0)	answer += i;
        }
        return answer;
        */
        
        // n이 아니라 n/2를 돌리면 for문이 돌아가는 수를 절반으로 줄일 수 있다.................
        for (int i = 1; i <= n / 2; i++) {
        	if (n % i == 0) answer += i;
        }
       return answer + n;
    }
}
