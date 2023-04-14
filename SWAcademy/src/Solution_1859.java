import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;



public class Solution_1859 {
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("res/input.txt"));
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int days = sc.nextInt();
            int[] arr = new int[days];

            for(int i = 0; i < days; i++) {
                arr[i] = sc.nextInt();
            }
            long income = 0; // 현재 잔고

            int p = arr[days - 1]; // 현재 최고가
            for (int i = days - 1; i > 0; i--) {
                if (p > arr[i - 1]) { // 물품 판매
                    income += p - arr[i - 1];
                }
                else if (p < arr[i - 1]) { // p 교체
                    p = arr[i - 1];
                }
            }

            System.out.println("#" + test_case + " " + income);
        }
		
	}
}
