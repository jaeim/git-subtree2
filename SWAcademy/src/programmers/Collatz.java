package programmers;

/*
 * 콜라츠 추측 lv1
 * num을 long 타입으로 변환하는 것을 놓치지말자..
 * => 연산 도중에 등장하는 숫자들을 출력해보시면 숫자가 커서 int 범위 밖의 숫자의 등장 가능성도 고려해야 합니다.
	3을 곱하는 부분이 있기 때문에 int의 최대치인 2, 147, 483, 647를 대입해야 하는 경우를 생각해보시면 될 것 같습니다.
 * https://school.programmers.co.kr/learn/courses/30/lessons/12943
 */
public class Collatz {
	public int solution(int num) {
		int answer = 0;
		long n = (int) num;
		if (n == 1) return 0;
		
		while(answer < 500) {
			n = (n % 2 == 0) ? n / 2 : n * 3  + 1;
			answer++;
			if (n == 1)	return answer;
		}
		
		return -1;
	}
}
