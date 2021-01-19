package com.ArrayList;


import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo4 {
	
		public static void main(String[] args) {
	
			ArrayList<Integer> list=new ArrayList<>();
			list.add(111);
			list.add(222);
			list.add(333);
			list.add(444);
			list.add(555);
			list.add(666);
			System.out.println(list);
			/**subList() method returns a view of 
			 a portion of an ArrayList in the given range.**/
			
			List<Integer> subList=list.subList(1, 4);
			System.out.println(subList);
			//modify the list
			list.set(2, 00);
			//change will be reflected in sublist
			System.out.println(subList);
			//modify the sublist
			subList.set(2,00);
			//changes will be reflected in the list
			System.out.println(list);
			
		}
	
	
	
}
