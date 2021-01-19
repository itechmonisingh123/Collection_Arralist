package com.ArrayList;


import java.util.ArrayList;

public class ArrayListDemo5 {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(111);
		list1.add(222);
		list1.add(333);
		System.out.println(list1);
		ArrayList<Integer>  list2=new ArrayList<>();
		list2.add(444);
		list2.add(555);
		list2.add(666);
		System.out.println(list2);
		//Adding of two list we use listAll()
		list1.addAll(list2);
		System.out.println(list1);
		
		//Inserting all elements of list2 at index 2 of list1
		list1.addAll(2, list2);
		System.out.println(list1);
	}

}
