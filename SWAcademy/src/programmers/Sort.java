package programmers;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
//		Integer[] arr = {1, 10, 4, 17, 9, 25, 3};
//		Arrays.sort(arr, (o1, o2) -> o2 - o1);
//		System.out.println(Arrays.toString(arr));
		
		int[] arr = {1, 10, 4, 17, 9, 25, 3};
		int max = arr[0];
		for (int i = 0; i <arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		System.out.println(max);
	}
}
