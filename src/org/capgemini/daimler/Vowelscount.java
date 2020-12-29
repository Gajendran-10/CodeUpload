package org.capgemini.daimler;

public class Vowelscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome";
		int acount = 0, ecount = 0, icount = 0, ocount = 0, ucount = 0, count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
				acount++;
				count++;

			} else if (str.charAt(i) == 'e' || str.charAt(i) == 'E') {
				ecount++;
				count++;

			} else if (str.charAt(i) == 'i' || str.charAt(i) == 'I') {
				icount++;
				count++;

			} else if (str.charAt(i) == 'o' || str.charAt(i) == 'O') {
				ocount++;
				count++;

			} else if (str.charAt(i) == 'u' || str.charAt(i) == 'U') {
				ucount++;
				count++;

			}
		}
		System.out.println("Total nuber of vowels count: "+count);
		System.out.println("A count:"+acount);
		System.out.println("E count:"+ecount);
		System.out.println("I count:"+icount);
		System.out.println("O count:"+ocount);
		System.out.println("U count:"+ucount);
		
	}

}
