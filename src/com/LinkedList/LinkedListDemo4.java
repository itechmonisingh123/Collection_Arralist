package com.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo4 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("six");
		list.add("seven");
		System.out.println(list);
		//Replacing an element at index 2 with "ZERO"
		list.set(2, "ZERO");
		System.out.println(list);
		//Retrieving and removing an element at index 2 of the list
		System.out.println(list.remove(2));
		//print the size of the list
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(2));
		//Retrieving the elements from the head
		System.out.println(list.element());
		System.out.println(list.getFirst());
		System.out.println(list.peek());
		System.out.println(list.peekFirst());
		//Retrieving the elements from the tail
		System.out.println(list.peekLast());
		System.out.println(list.getLast());
		//Removing the element from the head of the list
		list.poll();
		list.pollFirst();
		list.remove();
		list.removeLast();
		System.out.println(list);
		//Removing elements from the end of the LinkedList
		list.pollFirst();
		list.removeLast();
		//printig the list
		System.out.println(list);
		

	}

}
