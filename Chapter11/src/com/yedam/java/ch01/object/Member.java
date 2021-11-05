package com.yedam.java.ch01.object;

public class Member implements Cloneable{

	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;

	public Member(String id) {
		this.id = id;
	}
	
	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member)clone();
		}catch(CloneNotSupportedException e) {
			System.out.println("복제가 허용되지 않은 클래스입니다.");
		}
		return cloned;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;

	}

	@Override
	public int hashCode() {

		return id.hashCode();
	}
}
