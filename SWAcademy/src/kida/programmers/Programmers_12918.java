package kida.programmers;


public class Programmers_12918 {
	public static void main(String[] args) {
		String s = "1234";
		boolean answer = true;
		/*
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		char[] tmp = s.toCharArray();
		if (s.length() == 4 || s.length() == 6) {
			for(int i = 0; i < tmp.length; i++) {
				boolean subFlag = false;
				for(int j = 0; j < arr.length; j++) {
					if(String.valueOf(tmp[i]).equals(String.valueOf(arr[j]))) {
						subFlag = true;
						break;
					}
						
				}
				if (subFlag == false) {
					answer = false;
					break;
				}
			}
		} else {
			answer = false;
		}
		
		*/
		
		// ///////////////////////////
		
		if(s.length() == 4 || s.length() == 6) {
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) < '0' || s.charAt(i) > '9') {
					answer = false;
					break;
				}
			}
		} else {
			answer = false;
		}
		
		System.out.println("answer is " + answer);
	}
}
