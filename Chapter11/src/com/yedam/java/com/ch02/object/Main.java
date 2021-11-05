package com.yedam.java.com.ch02.object;

import java.util.Objects;

public class Main {

	public static void main(String[] args) {
		// Object.compare(객체1, 객체2, interface Comparator--비교 방법 정의)
		Student s1 = new Student(1);
		Student s2 = new Student(2);
		Student s3 = new Student(3);

		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);
		result = Objects.compare(s1, s3, new StudentComparator());
		System.out.println(result);
		System.out.println();

		// Objects.equals(객체1,객체2);

		Integer o1 = 1000;
		Integer o2 = 1000;
		System.out.println(o1 == o2);
		System.out.println(Objects.equals(o1, o2));
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, null));
		System.out.println(Objects.equals(o2, null));
		System.out.println(Objects.deepEquals(o1, o2));

		System.out.println();

		Integer[] arr1 = { 1, 2 };
		Integer[] arr2 = { 1, 2 };
		System.out.println(arr1 == arr2);
		System.out.println(Objects.equals(arr1, arr2));
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Objects.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, arr2));
		System.out.println(Objects.deepEquals(null, null));

		System.out.println();

		// 해시코드 생성 : hash(), hashCode()
		// - hashCode() : 객체의 해시코드 확인
		// - Objects.hashCode(객체) : 객체.hashCode();
		// - Objects.hash(필드1, 필드2,...) : 주어진 매개값들로 배열 생성 Array.hashCode(Object[])로 호출.

		Student s4 = new Student(1, "홍길동");
		Student s5 = new Student(1, "홍길동");
		System.out.println(s4 == s5);
		System.out.println(s4.hashCode());
		System.out.println(Objects.hashCode(s5)); // s5.hashCode();

		System.out.println();

		// 객체의 null 여부를 조사하는 메소드 : isNull, nonNull, requireNonNull
		String str1 = "홍길동";
		String str2 = null;

		System.out.println(Objects.isNull(str1));
		System.out.println(Objects.nonNull(str2));
		System.out.println(Objects.requireNonNull(str1));

		try {
			String strResult = Objects.requireNonNull(str2, "이름이 없습니다.");
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		
		//Objects.toString(객체)
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2, "이름이 없습니다."));
	}
}
