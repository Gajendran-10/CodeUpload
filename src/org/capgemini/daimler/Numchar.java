package org.capgemini.daimler;

//Number of character, Number & Special character
public class Numchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "input@1234";
		int alpha = 0, num = 0, spec = 0;
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
				alpha = alpha + 1;
			} else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				num = num + 1;
			} else {
				spec = spec + 1;
			}
		}
		System.out.println("Alphabets: " + alpha);
		System.out.println("Numbers: " + num);
		System.out.println("special characters: " + spec);
	}

}
