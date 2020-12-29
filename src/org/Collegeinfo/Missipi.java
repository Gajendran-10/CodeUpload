package org.Collegeinfo;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Missipi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "missipiipi";
		int mcount = 0, icount = 0, scount = 0, pcount = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'm' || str.charAt(i) == 'M') {
				mcount = mcount + 1;
			} else if (str.charAt(i) == 'i' || str.charAt(i) == 'I')

			{
				icount = icount + 1;

			} else if (str.charAt(i) == 's' || str.charAt(i) == 'S')

			{
				scount = scount + 1;

			} else if (str.charAt(i) == 'p' || str.charAt(i) == 'P')

			{
				pcount = pcount + 1;

			}
		}

		Map<String, Integer> m1 = new TreeMap<String, Integer>();
		m1.put("m", mcount);
		m1.put("i", icount);
		m1.put("s", scount);
		m1.put("p", pcount);
		Set<java.util.Map.Entry<String, Integer>> enter = m1.entrySet();
		for (java.util.Map.Entry<String, Integer> e : enter) {
			System.out.println(e.getKey() + "- " + e.getValue());
		}

	}

}
