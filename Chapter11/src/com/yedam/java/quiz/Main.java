package com.yedam.java.quiz;

public class Main {

	/*
	 * 문자열 s의 길이가 4 또는 6이고, 숫자로만 구성되어 있는지 확인해주는 함수, solution을 작성하세요
	 */

	public static void main(String[] args) {

		String s = "a1234";

		boolean result;
		result = solution(s);
		System.out.println(result);

	}

	public static boolean solution(String s) {

		int length = s.length();

		if ((length == 4) || (length == 6)) {
			for (int i = 0; i < length; i++) {
				if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
					;
				return true;
			}
		}
		return false;
	}
}
