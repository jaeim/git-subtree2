package kida.programmers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CreateFile {
	public static void main(String[] args) throws Exception {
		String filePath = "C:/Users/thdwo/Downloads";
//		Scanner sc = new Scanner(System.in);
//		String filePath = sc.next();
		String fileName = "sample.txt";

		File file = new File(filePath ,fileName);
		if (file.exists()) {
				BufferedReader br = new BufferedReader(new FileReader(file));
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				ArrayList<Integer> array = new ArrayList<Integer>();
				while(st.hasMoreTokens()) {
					array.add(Integer.parseInt(st.nextToken()));
				}
				Collections.sort(array, new Comparator<Integer>() {
					@Override
					public int compare(Integer o1, Integer o2) {
						return o2.compareTo(o1);
					}
				});
				
				String newFileName = "answer.txt";
				File newFile = new File(filePath, newFileName);
				if (!newFile.exists()) {
					newFile.createNewFile();
				}
				BufferedWriter brWriter = new BufferedWriter(new FileWriter(newFile, false));
				brWriter.write("정답입니다.");
				brWriter.newLine();
				Iterator<Integer> iterator = array.iterator();
				while(iterator.hasNext()) {
					brWriter.write(iterator.next() + " ");
				}
				brWriter.flush();
				brWriter.close();
		}
	}
}
