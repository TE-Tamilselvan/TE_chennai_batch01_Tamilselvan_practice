package com.access.in;

import java.util.LinkedList;

public class RetrieveFirstElement {

	public static void main(String[] args) {

		LinkedList<Integer> ref = new LinkedList();

		ref.add(11);
		ref.add(12);
		ref.add(10);
		ref.add(12);
		ref.add(57);

		Integer s1 = ref.peekFirst();

		System.out.println(ref);
		System.out.println("==========after retrieving============");
		System.out.println(s1);
	}

}
