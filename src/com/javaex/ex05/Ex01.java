package com.javaex.ex05;

public class Ex01 {

	public static void main(String[]args) {
		
		String s01 = new String("hi");
		String s02 = new String("hi");
		
		System.out.println(s01 == s02); // 주소값을 같은지 비교하는것 당연히 false
		System.out.println(s01.equals(s02)); // 주소값 내부의 String 형 변수의 값 비교한 것
		//////////////////////////////////////////////
		
		
		
		String s03 = "hello"; //new String("hello"); String 의 약식으로 썼을때 작동 원리가 달라진다.
		String s04 = "hello"; //new String("hello"); String 의 특성상 먼저 선언한 sr03의 주소값을 따라간다.
		
		System.out.println(s03 == s04); //주소값이 같으므로 true가 출력된다.
		System.out.println(s03.equals(s04));
		
		System.out.println(s03);
		System.out.println(s04);
		System.out.println("=============================");
		
		s03 = "hello!!!!!";
		System.out.println(s03);
		System.out.println(s04);
		
		System.out.println(s03 == s04);
		
		
		String s05 = "장재영";
		
		
		
	}
	
}
