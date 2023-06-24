package programmers;

/*
 * 소수 만들기 - lv1
 * https://school.programmers.co.kr/learn/courses/30/lessons/12977
 */
public class MakingDecimal {
	public static void main(String[] args) {
		solution(new int[] {1, 2, 3, 4});
	}
	public static int solution(int[] nums) {
		int answer = 0;
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					int sum = nums[i] + nums[j] + nums[k];
					boolean isPrime = findPrime(sum);
					if (isPrime) answer++;
				}
			}
		}



		return answer;
	}
	public static boolean findPrime(int n) {
		for(int i = 2; i <= (int)Math.sqrt(n); i++) {
			if (n % i == 0) return false;
		} return true;
	}
}
