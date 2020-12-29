package org.Collegeinfo;

public class Splitstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Welcome to TCS";

String[] s2=str.split(" ");
String s3=str.substring(11).replace("CTS", "TCS");


System.out.println(s3);
for(String temp:s2) {
	System.out.println(temp);
}
System.out.println(s2[1]+" "+s2[2]);
	}

}
