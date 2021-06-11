package com.javaex.ex05;

public class Ec02 {

	public static void main(String[]args) {
		
		String a = new String(" abcd");
		String b = new String(",efg ");
		
		System.out.println(a.concat(b)); //가상으로 합치는 메서드
		System.out.println(a);
		System.out.println(b);
		
		a = a.concat(b); //가상으로 합친 값을 a변수에 대입
		
		System.out.println(a);
		
		a = a.trim(); // trim() --> 공백 없애는 메서드
		System.out.println(a);
		
		a = a.replace("ab", "12");
		System.out.println(a);
		
		System.out.println("===================");
		
		String[] sArray = a.split(","); // 파라미터의 값을 기준으로 문자열을 잘라주는 메서드 --> 파라미터의 값은 출력시 사라진다.
		for(int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		
		System.out.println("===================");
		
		String str = "Hello java!";
		
		System.out.println(str.charAt(4));
		
		String result = str.substring(3);
		System.out.println(result);
		
		String result2 = str.substring(3, 7);
		System.out.println(result2);
		
		
	}
	
	
}
