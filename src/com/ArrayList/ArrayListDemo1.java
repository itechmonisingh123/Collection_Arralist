package com.ArrayList;


import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		/**Array has 3 Constructor..Below it is how to define**/
		
		ArrayList<Integer> list1= new ArrayList<Integer>();  //---method1
		ArrayList<String> list2=new ArrayList<String>(20);   //---method2
		ArrayList<Integer> list3=new  ArrayList<Integer>(list1); //---method3
		
		System.out.println(list1.isEmpty());//---return true
		
		/**contains() method use to check the element is present in the Arraylist or not**/
		ArrayList<Double> list=new ArrayList<Double>();
		list.add(1.1);
		list.add(11.11);
		list.add(111.111);
		list.add(1111.1111);
		//Checking whether list conatins '111.1111'
		System.out.println(list.contains(111.1111)); //---->false
		System.out.println(list.contains(11.11));    //----->True
		
		
	}
}
