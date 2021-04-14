package Araaylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class Arraylist {
	
	public static void main(String[] args) {
		 ArrayList<Integer> list= new  ArrayList<Integer>();
		 list.add(435);
		 list.add(89);
		 list.add(65);
		 list.add(4867);
		 System.out.println("before reversing:->\n"+list+"\n");
		 
		 System.out.println("After reversing using ListIterator:->");
		 ListIterator<Integer> li= list.listIterator(list.size());
		 while(li.hasPrevious()) {
			 System.out.println(li.previous());
		 }
		
		
	}
	

}
