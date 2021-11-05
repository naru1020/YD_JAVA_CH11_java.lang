package com.yedam.java.ch08.wrapper;

public class Main {
	public static void main(String[] args) {
		// 박싱 : 기본 타입의 값을 포장객체로 만드는 과정
		// Integer obj = new Integer(100);
		// Integer obj = new Integer("200");

		// string은 참조타입임에도 new 연산자를 사용하지 않듯이... Integer 또한 기본 타입에 해당하는 값을 넣으면 자동으로 박싱된다.
		// (자동박싱)
		Integer obj3 = 100;
		Integer obj4 = Integer.valueOf("200");
		// obj5 = 100;

		// 언박싱 : 포장 객체에서 기본 타입의 값을 얻어내는 과정
		int value3 = obj3.intValue();

		//자동 언박싱 . . . Integer와 value는 함께 간다??
		int value4 = obj4;
		
		//연산시에도 일어남
		int result = obj3 + 100;
		
		System.out.println(result);
		
		//문자열을 기본 타입으로 변환하는 parse 메소드
		int val1 = Integer.parseInt("10");
		double val2 = Double.parseDouble("3.14");
		boolean val3 = Boolean.parseBoolean("true");
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		
		//포장 객체 비교
		Integer obj7 = 300;
		Integer obj8 = 300;
		System.out.println(obj7==obj8); //false가 나옴. 객체가 다르기 때문에.
		System.out.println(obj7.intValue() == obj8.intValue()); //언박싱 후의 값 비교
		System.out.println(obj7.equals(obj8)); //equals를 통한 값 비교
		
		System.out.println();
		
		Integer obj9 = 10;
		Integer obj10 = 10;
		System.out.println(obj9==obj10); //false가 나옴. 객체가 다르기 때문에.
		System.out.println(obj9.intValue() == obj10.intValue()); //언박싱 후의 값 비교
		System.out.println(obj9.equals(obj10)); //equals를 통한 값 비교
	}
}
