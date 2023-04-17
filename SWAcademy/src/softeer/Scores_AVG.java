package softeer;

import java.util.*;
import java.io.*;

public class Scores_AVG {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] scores = new int[n];
		double[] avgs = new double[k];

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			scores[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int tmp = 0;
			for (int j = start; j <= end; j++) {
				tmp += scores[j - 1];
			}
			avgs[i] = (double) tmp / (end - start + 1);
		}
		for (int i = 0; i < avgs.length; i++) {
			System.out.println(String.format("%.2f", avgs[i]));
		}

	}
}
