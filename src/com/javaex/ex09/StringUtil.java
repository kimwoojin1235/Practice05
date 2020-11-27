package com.javaex.ex09;

public class StringUtil {
    
	 public static String concatString(String[] stringArray){
	    	
	        //메소드 내용작성
	    	String re ="";
	    	
	    	for(int i=0; i<stringArray.length; i++) {
	    		re += stringArray[i]; 
	    	}
	    	
	        return re;
    }

}
