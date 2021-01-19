package com.ArrayList;


import java.util.ArrayList;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		/** indexOf() and lastIndexOf() methods to find out 
			the position of a given element in an ArrayList.**/
		ArrayList<String> list=new ArrayList<>();
		list.add("JAVA");
		list.add("PHP");
		list.add("PYTHON");
		list.add("C");
		list.add("JAVA");
		list.add("SPRING");
		list.add("HIBERNATE");
		System.out.println(list);
		System.out.println(list.indexOf("JAVA"));      //---->0 position
		System.out.println(list.lastIndexOf("JAVA"));  //---->4th position
		
		/**toArray() method returns an array 
		 containing all elements of the ArrayList.**/
		//getting an array containing all elements of the list.
		Object[] array=list.toArray();
		//Printing the elements of the returned array.
		for(Object obj:array)
		{
			System.out.println(obj);
		}
		/**get() method returns an element from a 
		 specified position of an ArrayList.**/
		System.out.println("");
		System.out.println(list.get(3));
		System.out.println(list.get(5));
		/**set() method replaces a particular element in 
		 an Arraylist with the given element.**/
		list.set(3, "HTML");
		list.set(4, "JAVASCRIPT");
		System.out.println(list);
		/**add() method to insert element in particular position **/
		list.add(5,"REST");
		System.out.println(list);
		/**remove() method remove element in particular position**/
		list.remove(4);
		System.out.println(list);
		/**clear() method is use to remove all element of the  list**/
		list.clear();
		System.out.println(list);
		
		

	}

}
