package com.polymorphism.overloading;

public class Sample {
	public void add(byte x, byte y) {
		System.out.println("add bytes");
	}
	public void add(short x, short y) {
		System.out.println("add bytes");
	}
	public void add(int  x, short y) {
		System.out.println("add intgs and shorts");
	}
	
	public void add(int x, int y) {
		System.out.println("add intgs");
	}

	
}
