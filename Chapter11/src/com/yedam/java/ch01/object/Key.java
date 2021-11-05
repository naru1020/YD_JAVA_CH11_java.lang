package com.yedam.java.ch01.object;

public class Key {
	public int number;
	public String id;
	
	public Key(int number) {
		this.number = number;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key)obj;
			if(compareKey.number == this.number) {
				return true;
			}
		}
		return false;
	}
}
