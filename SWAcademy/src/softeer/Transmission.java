package softeer;

import java.util.*;
import java.io.*;

public class Transmission {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = 8;
		// int[] speeds = new int[n];
		boolean[] results = { true, true, true }; // 0: asc 1: dsc 2: mixed
		for (int i = 0; i < n; i++) {
			int speed = Integer.parseInt(st.nextToken());
			if (i + 1 != speed) {
				results[0] = false;
			}
			if (i + speed != n) {
				results[1] = false;
			}
		}
		if (results[0]) {
			System.out.println("ascending");
		} else if (results[1]) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");

		}
	}
}
