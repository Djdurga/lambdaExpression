package com.cap;

public class lambda {
	public static void main(String[] args) {
		Sayable s=()->{
			return "I am lambda expression";
			
		};
		System.out.println(s.say());
	}

}
