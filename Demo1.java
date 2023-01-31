package com.ust.app;

public class Demo1 {
	
	static String s="My name is Ananda";
	
	static String[] splited=s.split(" ");
	static String finalString="";
	public static void main(String args[]) {
	 for (String s:splited) {
		 finalString=finalString+" "+reverse(s);
		 
	 }
	 System.out.println(finalString.trim());
	}
	
	/*public static void main(String args[]) {
		String rev=
			reverse("Ananda");
		System.out.println(rev);
		
	}*/
	
	public static String reverse(String s1) {
		char[] chArr=s1.toCharArray();
		String rev="";
		for (int i=chArr.length-1;i>=0;i--) {
			rev=rev+chArr[i];
		
		}
		return rev;
	}

}
