package programmers;
/*
 * 평균 구하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12944
 */

public class Average {
	public double solution(int[] arr) {
        double answer = 0;
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
        	total += (double)arr[i];
        }
        answer = total / arr.length;
        return answer;
    }
}
