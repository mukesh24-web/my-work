package array_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
	
	// ArrayList = A resizeable array that stores objects (autoboxing)
	//             Array are fixed in size,but ArrayLists can change.
	// you can't use primitive
	public static void main(String[] args) {//  | we don't want to mention datatype
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Double > list1 = new ArrayList<>();
		ArrayList<String> fruits = new ArrayList<>();

		list.add(3);
		list.add(2);
		list.add(1);
		list1.add(3.14);
		list1.add(54.12);
		fruits.add("Apple");
		fruits.add("orange");
		fruits.add("banana");
		fruits.add("guva");
		
/*	fruits.remove(0);
		fruits.set(0, "Pineapple");
		
		System.out.println(list); //element inside the list
		System.out.println(list1);
		System.out.println(fruits);
		System.out.println(fruits.get(0));
		System.out.println(fruits.size());
		*/
		Collections.sort(fruits); // to sort acending
		System.out.println(fruits);
		
		for(String fruit:fruits) { // print fruits value line by line using enhanced for loop
			System.out.println(fruit);
		}
	}
 
}
