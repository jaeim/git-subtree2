package kida.programmers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class DoubleIntegerArray {
	public static void main(String[] args) throws IOException {
		int size_1 = 4;
		int size_2 = 2;
		int[][] example = new int[size_1][size_2];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i <size_1; i++) {
			for(int j = 0; j < size_2; j++) {
				example[i][j] = sc.nextInt();
			}

		}
		Arrays.sort(example, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o2[0] == o1[0]) {
					return o2[1] - o1[1];
				}
				return o2[0] - o1[0];
			}
		});
		
		String filePath = "C:/Users/thdwo/Downloads";
		String fileName = "answer2.txt";
		
		File file = new File(filePath, fileName);
		if(!file.exists()) {
			file.createNewFile();
		}
		BufferedWriter brWriter = new BufferedWriter(new FileWriter(file));
		brWriter.write("정답입니다.\n");
		for(int i = 0; i <size_1; i++) {
			for(int j = 0; j < size_2; j++) {
				brWriter.write(example[i][j] + " ");
			} brWriter.newLine();
		}
		brWriter.flush();
		brWriter.close();

	}
}
