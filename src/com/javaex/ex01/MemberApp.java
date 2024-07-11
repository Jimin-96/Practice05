package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member mem1 = new Member();
		mem1.setId("jws");
		mem1.setName("정우성");
		mem1.setPoint(50000);
		
		Member mem2 = new Member();
		mem2.setId("yjs");
		mem2.setName("유재석");
		mem2.setPoint(30000);
		
		Member mem3 = new Member();
		mem3.setId("lhr");
		mem3.setName("이효리");
		mem3.setPoint(40000);
		
		mem1.showInfo();
		mem2.showInfo();
		mem3.showInfo();
	}

}
