package com.te.localrepository;

public class Assign2a {
	public static void main(String[] args) {

		byte b = 22;
		int x = (int) b;// Explicit casting
		int y = b; // implicit casting

		char ch = 'a';
		int z = (int) ch;// Explicit casting
		int a = ch;// implicit casting

		int c = 22;
		double d = c;// implicit casting
		double d1 = 22.093;
		int i = (int) d1;

		System.out.println("x value=" + x);
		System.out.println("y value=" + y);
		System.out.println("z value=" + z);
		System.out.println("a value=" + a);
		System.out.println("d value=" + d);
		System.out.println("d1 value=" + d1);
		System.out.println("i value=" + i);

	}

}
