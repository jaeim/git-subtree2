package softeer;

import java.util.*;
import java.io.*;

public class Class_Division {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<int[]> list = new ArrayList<>();

		StringTokenizer st = null;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			list.add(new int[] { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) });
		}

		Collections.sort(list, (o1, o2) -> o1[1] - o2[1]);// 종료시간순 오름차순
		
//		Collections.sort(list, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[1] - o2[1];
//            }
//        });// 종료시간순 오름차순

		int result = 0;
		Iterator<int[]> iter = list.iterator();
		int s = 0, e = 0;

		while (iter.hasNext()) {
			int[] cmpClass = iter.next();
			int cmpS = cmpClass[0];
			int cmpE = cmpClass[1];

			if (cmpS >= e) {
				result++;
				s = cmpS;
				e = cmpE;
			}
		}

		System.out.println(result);
	}
}
