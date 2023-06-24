package programmers;

/*
 * 최대공약수와 최소공배수 - LV1
 * 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환
 * https://school.programmers.co.kr/learn/courses/30/lessons/12940
 */
public class FindGAndL {
	public static void main(String[] args) {
		solution(1000000, 100);
	}

	public static int[] solution(int n, int m) {

		int[] answer = new int[2];
		int min = Math.min(n, m); // 최대공약수 구할 때 쓰이는 범위
		int max = Math.max(n, m);
		int G = 1; // 최대공약수
		int L = 1; // 최소공배수
		// 최대공약수를 구하는거니까..뒤에서 부터 구한다..
		for (int i = min; i >= 2; i--) {
			if (n % i == 0 && m % i == 0) {
				G = i;
				break;
			}
		}

		answer[0] = G;
		// 유클리드 호제법: n * m / 최대공약수 = 최소공배수
		answer[1] = (n * m) / G;

		return answer;

	}

	// 좀 더 깔끔하게 정리해보자
	public int[] solution2(int n, int m) {
		int[] answer = new int[2];
		int G = 1; // 최대공약수
		int L = 1; // 최소공배수

		for (int i = Math.min(n, m); i >= i; i--) {
			if (n % i == 0 && m % i == 0) {
				G = i;
				break;
			}
		}
		for (int i = Math.max(n, m); i <= n * m; i++) {
			if (i % n == 0 && i % m == 0) {
				L = i;
				break;
			}
		}
		answer[0] = G;
		answer[1] = L;

		return answer;
	}
}
