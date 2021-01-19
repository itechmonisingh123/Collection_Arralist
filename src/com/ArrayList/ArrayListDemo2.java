package com.ArrayList;


import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		/**use of ensure capacity() to increase current capacity of ArrayList.**/

		ArrayList<String> list=new ArrayList<String>();
		//default capacity will be 10 now to increase
		
		list.ensureCapacity(20); //increase upto 20 capacity
		
		/**trimToSize() method use to minimize the size **/
		list.add("one");
		list.add("two");
		list.add("three");
	    list.add("four");
		System.out.println(list);
		int a=10;
		/**size() method returns number of elements present in an ArrayList.**/
		System.out.println("the size of ArrayList:"+list.size());
		list.trimToSize();
		System.out.println("reduce size:"+list.size());
		/**isEmpty() is use to check the list is empty or not**/
		System.out.println(list.isEmpty());
		
	}

}
