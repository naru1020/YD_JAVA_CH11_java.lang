package com.yedam.java.com.ch02.object;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student a, Student b) {
		// 일반적으로 o1가 o2보다 작을 경우 음수, 같으면 0, 크면 양수를 리턴하도록 클래스 구현
		/*
		if(a.sno < b.sno) return -1;
		else if(a.sno == b.sno) return 0;
		else return 1;
		*/
		return Integer.compare(a.sno, b.sno);
	}

}
