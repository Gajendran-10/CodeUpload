package org.capgemini.daimler;

public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "welcome to the class";
		String cou = "CTS@123";
		String rep = cou.replace("CTS", "TCS");

		int stco = 0, Numco = 0, specco = 0;

		for (int i = 0; i < cou.length(); i++) {
			if ((cou.charAt(i) >= 'a') && (cou.charAt(i) <= 'z') || (cou.charAt(i) >= 'A') && (cou.charAt(i) <= 'Z')) {
				stco = stco + 1;
			} else if ((cou.charAt(i) >= '0') && (cou.charAt(i) <= '9')) {
				Numco = Numco + 1;
			} else {
				specco = specco + 1;
			}
		}
		String sub = s.substring(8);
		String upper = sub.toUpperCase();

		int n = 123;
		int count = 0, rem, revcount = 0, Sum = 0;
		while (n != 0) {
			rem = n % 10;
			count = (count * 10) + rem;
			Sum = Sum + rem;
			n = n / 10;
			revcount++;

		}
		System.out.println(upper);
		System.out.println("Reverse:" + count);
		System.out.println("Number Count:" + Sum);
		System.out.println("Count" + revcount);

		System.out.println("Replace:" + rep);
		System.out.println("String count:" + stco);
		System.out.println("Number Count:" + Numco);
		System.out.println("Special char count:" + specco);
	}

}
