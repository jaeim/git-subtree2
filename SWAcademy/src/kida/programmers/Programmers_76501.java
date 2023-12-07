package kida.programmers;

public class Programmers_76501 {
	public static void main(String[] args) {
		int[] absolutes = {1, 2, 3};
		boolean[] signs = {false, false, true};
		int answer = 0;
		for(int i = 0; i < signs.length; i++) {
			answer += (signs[i] == true) ? absolutes[i] : (absolutes[i] * -1);
		}
		System.out.println(answer);
	}
}
