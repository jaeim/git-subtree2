package kida.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Programmers_68644 {
	public static void main(String[] args) {
		int[] numbers = {5,0,2,7};
		
		
		ArrayList<Integer> numbersList = new ArrayList<Integer>();
		ArrayList<Integer> answerList = new ArrayList<Integer>();
		for(int i = 0; i < numbers.length; i++) {
			numbersList.add(numbers[i]);
		}
		for(int i = 0; i < numbersList.size() - 1; i++) {
			for(int j = i + 1; j < numbersList.size(); j++) {
				int tmp = numbersList.get(i) + numbersList.get(j);
				if (answerList.indexOf(tmp) == -1) {
					answerList.add(tmp);
				}
			}
		}
		Collections.sort(answerList);
		Iterator<Integer> iterator =answerList.iterator();
		int[] answer = new int[answerList.size()];
		int i = 0;
		while(iterator.hasNext()) {
			answer[i++] = iterator.next();
		}
		
//		System.out.println("answer is " + String.valueOf(answerList));
	}
}
