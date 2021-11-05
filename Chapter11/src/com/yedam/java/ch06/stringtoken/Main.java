package com.yedam.java.ch06.stringtoken;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// -String.split() : 정규표현식
		// StringTokenizer : 문자
		// 010-2613-2345 : -, 010/2613/2345 -> 문자열 3개로 분리

		String text1 = "홍길동&이수홍, 박연수, 김자바 - 최영호";
		String[] names = text1.split("&|,|-"); // -> & or , or - 에 도달할 때마다 하나의 스트링으로 잘라내라
		for (String name : names) {
			System.out.println(name);
		}

		String text2 = "홍길동/이수홍/박연수";

		StringTokenizer st = new StringTokenizer(text2, "/");
		// st : 문자열을 담고 있는 스택
		int countTokens = st.countTokens();
		System.out.println("현재 토근 수 : " + countTokens);
		for (int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token + ", " + st.countTokens());
		}

		st = new StringTokenizer(text2, "/");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}

		System.out.println();

		// StringBuilder : 새로운 문자열을 생성하지 않고 문자열을 변경하는 경우 사용하며 내부 버퍼를 별도로 가지고 그 안에 문자열을
		// 저장해두고 추가 수정 삭제 작업을 할 수 있음.

		StringBuilder sb = new StringBuilder();

		// 문자열을 추가 -> 기존의 값 뒤에 추가되면서 문자열 결합이 아루어짐.
		sb.append("java");
		sb.append("program Study");
		System.out.println(sb.toString());

		// 네 번째 순서 뒤에 2를 삽입.
		sb.insert(4, "2");
		System.out.println(sb.toString());

		// 네 번째 순서에 문자 6 변경
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());

		// index6부터 index13전까지를 "book"이라는 문자열로 대체
		sb.replace(6, 13, "book");
		System.out.println(sb.toString());

		// index4부터 index5 전까지 삭제
		sb.delete(4, 5);
		System.out.println(sb.toString());

		int length = sb.length();
		System.out.println("총 문자수 : " + length);

		String result = sb.toString();
		System.out.println(result);

		// Pattern : 정규표현식으로 문자열 검증

		String regExp = "(053|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";

		boolean resultData = Pattern.matches(regExp, data);
		if (resultData) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@navercom";
				
		resultData = Pattern.matches(regExp, data);
		if (resultData) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
	}
}
