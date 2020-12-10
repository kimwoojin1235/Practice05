package com.javaex.ex09;

public class StringUtil {
    
	 public static String concatString(String[] stArray){
		 //stringArray는 이 곳의 이름임
		 // concatString는 App에서 불러올배열의 이름임
		 //한번만 쓰겠다는 뜻임
	    	
	        //메소드 내용작성
	    	String re="";
	    	//App에 있는 strArray의 문자열을 담는다.
	    	
	    	for(int i=0; i<stArray.length; i++) {
	    		re += stArray[i]; 
	    		//i가 늘어날때마다strArray에 있는 문자열을 저장한다.
	    	}
	    	
	        return re;
	        //일을 다한것을 리턴 한다.
    }

}
