package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		Member jws= new Member();
		Member yjs= new Member();
		Member lhr= new Member();
		
		jws.setName("정우성");
		jws.getName();
		jws.setId("jws");
		jws.getId();
		jws.setPoint(50000);
		jws.getPoint();
		jws.showinfo();
		
		yjs.setName("유재석");
		yjs.getName();
		yjs.setId("yjs");
		yjs.getId();
		yjs.setPoint(30000);
		yjs.getPoint();
		yjs.showinfo();
		
		lhr.setName("이효리");
		lhr.getName();
		lhr.setId("lhr");
		lhr.getId();
		lhr.setPoint(40000);
		lhr.getPoint();
		lhr.showinfo();
	}

}
