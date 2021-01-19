package com.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo5 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		list.add("JAVA");
		list.add("J2EE");
		list.add("JSP");
		list.add("J2EE");
		list.add("spring");
		System.out.println(list);
		list.removeFirstOccurrence("J2EE");
		System.out.println(list);
		list.removeLastOccurrence("J2EE");
		System.out.println(list);
		//use linkedlist as stack Lifo
		LinkedList<Integer> stack=new LinkedList<>();
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println(stack);
		//Poping out the elements from the stack
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.clear();
		System.out.println(stack);
		//To clone the linkedlist
		LinkedList<Integer> list1=new LinkedList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		System.out.println(list1);
		LinkedList<Integer> list2=new LinkedList<>();
		list2= (LinkedList<Integer>)list1.clone();
		System.out.println(list2);
		//to find last index indexof() method is use.
		System.out.println(list2.lastIndexOf(50));
		
		
		
		
		

	}

}
