package kida.programmers;

import java.util.Scanner;

public class Programmers_12928 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		// 제곱근까지만 돌려도 된다 => 2가 100의 약수란 걸 알게된 순간 50이라는 약수도 구할수 있다.
		for (int i = 1; i <= (int)Math.sqrt(n); i++) {
			if (n % i == 0) {
				answer += i;
				if (n / i != i)
					answer += (n / i);
			}
		} 
		System.out.print(answer);
	}
}
