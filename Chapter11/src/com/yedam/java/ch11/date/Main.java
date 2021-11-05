package com.yedam.java.ch11.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// date 클래스
		long time = System.currentTimeMillis();
		Date now = new Date(time);
		System.out.println(now.toString());

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow = sdf.format(now);
		System.out.println(strNow);
		System.out.println();

		// calendar 클래스
		Calendar now2 = Calendar.getInstance();//싱글톤의 성격을 갖고 있어 getinstance 사용.
		System.out.println(now2.toString());

		int year = now2.get(Calendar.YEAR);
		int month = now2.get(Calendar.MONTH) + 1; // 0에서 11까지의 값을 리턴. 그래서 +1 을 해줘야 함.
		int day = now2.get(Calendar.DAY_OF_MONTH);
		int week = now2.get(Calendar.DAY_OF_WEEK);
		String strweek = null;
		switch (week) {
		case Calendar.MONDAY:
			strweek = "월";
			break;
		case Calendar.TUESDAY:
			strweek = "화";
			break;
		case Calendar.WEDNESDAY:
			strweek = "수";
			break;
		case Calendar.THURSDAY:
			strweek = "목";
			break;
		case Calendar.FRIDAY:
			strweek = "금";
			break;
		case Calendar.SATURDAY:
			strweek = "토";
			break;
		case Calendar.SUNDAY:
			strweek = "일";
			break;
		}

		int amPm = now2.get(Calendar.AM_PM);
		String strAmPm = null;
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}

		int hour = now2.get(Calendar.HOUR);
		int minute = now2.get(Calendar.MINUTE);
		int second = now2.get(Calendar.SECOND);

		System.out.printf("%d년 %d월 %d일\n", year, month, day);
		System.out.printf("%s요일 %s\n", strweek, strAmPm);
		System.out.printf("%d시 %d분 %d초", hour, minute, second);
	}
}
