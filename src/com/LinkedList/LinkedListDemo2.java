package com.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		/**Addall() method use to add arraylist at the of linkedlist**/
		LinkedList<String> list=new LinkedList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println(list);
		ArrayList<String>  list1=new ArrayList<>();
		list1.add("six");
		list1.add("seven");
		list1.add("eight");
		list1.add("nine");
		System.out.println(list1);
		list.addAll(list1);
		System.out.println(list);

	}

}
