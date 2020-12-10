package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {
	public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        //포문안에 입력값이 저장이됨
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");

        //친구정보 3명 입력 로직 --> 반복문 사용
            for (int i = 0; i < friendArray.length; i++) {
				System.out.print("친구: ");
				String name=sc.nextLine();
				System.out.print("핸드폰: ");
				String phon=sc.nextLine();
				System.out.print("학교: ");
				String school=sc.nextLine();
				System.out.println("------------------------");
				  // Friend 인스턴스 생성하여 데이터 넣기
	            Friend fr= new Friend();
	            //매번 새로운 주소가 생기고 그안에 값을 저장
	            fr.setName(name);
	        	fr.setHp(phon);
	        	fr.setSchool(school);
	        	//반복적으로 사용을 하여고 반복문 안에 넣어둠
	        	//괄호 안에서 빠져나가면 사라
	            // 인스턴스 주소를 배열에 대입
	            friendArray[i]=fr;
	            //입력값을 빠져나가 사라지기전에 배열에 넣어둠
	            //3번을 돌릴예정이라 i를 넣음

			} 
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        	friendArray[i].showInfo();
        }

        sc.close();
    }

}
