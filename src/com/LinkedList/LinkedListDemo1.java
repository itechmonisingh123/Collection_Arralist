package com.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		list.add("JAVA");
		list.add("J2EE");
		list.add("JSP");
		list.add("SERVLET");
		list.add("JDBC");
		//Printing the elements of list
		System.out.println(list);
		String s="JSP";
		//checking whether list contain jsp
		boolean contains= list.contains(s);
		if(contains)
		{
			//If list contains "JSP", printing it's index
			
			System.out.println(list.indexOf(s));
		}
		s="STRUTS";
		boolean contains1=list.contains(s);
		if(contains1)
		{
			System.out.println(list.indexOf(s));
			
			
		}
		//traverse the element in reverse order
		Iterator<String> itr=list.descendingIterator();
		//printing the list in the iterator
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
