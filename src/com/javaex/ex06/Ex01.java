package com.javaex.ex06;

public class Ex01 {

	public static void main(String[]args) {
		
		Integer i01 = new Integer(10); // 기본자료형 int를 쓰지 않고 Integer 클래스를 사용하여 변수 선언
		Integer i02 = new Integer(7);
		
		
		//int result = 10 + 7;
		//nteger result = i01 + i02;
		Integer result = new Integer(10) + new Integer(7);
		
		System.out.println(result);
		
		/*   ==박싱==
		int i10 = 7;
		Integer i11 = 10; // Integer i11 = new Integer(10); --> 간략히 사용 가능 new Integer가 생략된 것
		
		Integer i100 = 15;
		     ==언박싱==
		int i101 = i100; // --> i101 은 int(정수형) 인데 주소값인 i100이 들어갈 수 있는 이유는 i101에 들어가는 값이 언박싱 과정을 거친 i100의 값이 들어가기 때문이다.
		System.out.println(i101);
		*/
		
		int i10 = 7;
		i01.intValue(); //메소드 사용할 수 있다.
		
		System.out.println("= 문자열 --> 정수 ================================");
		
		Integer i999 = new Integer(999); // -->999를 사용하지 않음 static으로 값이 미리 올라감 효율 x 
		int num = i999.parseInt("12345"); // "12345" --> 12345
		System.out.println(num);
		
		//"12345" --> 12345 실제사용
		
		int num2 = Integer.parseInt("12345"); // 문자열을 정수형 Integer클래스를 사용하여 변환
		System.out.println(num2);
		
		// 정수 --> 문자열
		String str = new String("hi"); //마찬가지로 쓸모없는 hi를 선언 할 필요 없음 효율 x
		String strResult = str.valueOf(123456); //123456 --> "123456"
		System.out.println(strResult);
		
		// 정수 --> 문자열 실제사용
		String strResult2 = String.valueOf(123456); // 정수형을 문자열형 String클래스를 사용하여 변환
		System.out.println(strResult2);
		
		// 정수 --> 문자열 많이 사용하는 방법
		String strResult3 = "" + 9876;// 9876 --> "9876" (문자열형과 정수형의 합연산의 결과를 이용한 변환방법) 문자열형 + 정수형 = 문자열형
		System.out.println(strResult3);
		
		String yn = "y"; // 사용자가 입력한 값
		//String yn = new String("y");
		
		//yn = null; 
		
		
		//널포인트 상황이 발생할 수 있다.
		if(yn.equals("y")) {
			System.out.println("게임 다시 시작");
		}
		
		//equals() 사용팁 --> nullpointer 상황 방지
		if("y".equals(yn)) {
			System.out.println("게임 다시 시작");
		}
		
		//다른 기본 자료형
		Byte b = new Byte((byte)1); // --> int 형이 아닌 byte임을 알려주어야 한다.
		Short s = new Short((short)1);
		
		
	}
	
}
