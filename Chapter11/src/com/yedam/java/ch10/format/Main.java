package com.yedam.java.ch10.format;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date now = new Date(); //현재 시점의 날짜와 시간을 받아옴.
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		System.out.println(now.toString());
		
		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println(sdf.format(now));
	
		System.out.println();
		String id = "java";
		String name = "신용권";
		String tel = "010-123-4567";
		//회원 id : java\n 회원 이름 : 신용권 \n 회원 전화 : 010-123-4567
		String text = " 회원 id : {0}\n 회원 이름 : {1}\n 회원 전화 : {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
		System.out.println();
		
		String sql = "insert into member values({0},{1},{2})";
		String result2 = MessageFormat.format(sql, id, name, tel);
		System.out.println(result2);
		System.out.println();
		
	}
}
