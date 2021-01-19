package com.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		LinkedList<Integer> queue=new LinkedList<Integer>();
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		System.out.println(queue);
		//removing the element from queue
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		//add the element head and tail on the list
		LinkedList<Integer> list=new LinkedList<>();
		list.add(10);
		list.addLast(20);
		list.offer(30);
		list.offerLast(40);
		//printing the element of the list
		System.out.println(list);
		//Adding the element  at the beginning of the list
		list.offerFirst(1);
		list.addFirst(2);
		//printing the element in the list
		System.out.println(list);
		//add element particular position of the list
		list.add(2,999);
		System.out.println(list);
		
		//creating another linked list
		LinkedList<Integer> list1=new LinkedList<>();
		//Adding the list 
		list1.addFirst(111);
		list1.addFirst(222);
		list1.addFirst(333);
		System.out.println(list1);
		//Adding all element list1 at index 3 of list
		list.addAll(3,list1);
		//printing the element of the list
		 System.out.println(list);  

	}

}
