package com.ust.app;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="my name is ananda";
		
       char[] chArr=s.toCharArray();
     
      
    	   while(chArr.length>0) {
    		   String countString=findCount(chArr,chArr[0]);
    		   String s2=""+chArr[0];
    		   s=s.replaceAll(s2, "");
    		   chArr=s.toCharArray();
    		   System.out.println(countString);
    	   
    	   
    	   }
       }
	
	public static String findCount(char[] charArr,char character) {
 	   int count=1;
 	   for (int j=1;j<charArr.length;j++) {
 		   if (character==charArr[j]) {
 			   
 			   count++;
 		   }
 		 
 	   }
 	  return "Character :: "+character+"  count::"+count+"";
 
	}


}
