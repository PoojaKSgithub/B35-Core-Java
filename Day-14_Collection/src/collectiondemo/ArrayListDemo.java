package collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Character>obj=new ArrayList<>(3);
		obj.add('g');//0
		obj.add('i');//1st index
		obj.add('r');//2nd
		obj.add('i');//3rd index
		obj.add('s');
		List<Character>obj1=new ArrayList<>(3);
		System.out.println(obj1.isEmpty());
		System.out.println(obj.isEmpty());
		System.out.println(obj.contains('O'));


		System.out.println("The Collection elements are: "+obj);
		//size of the list
		System.out.println("The total  elements are: "+obj.size());
		System.out.println("The index of given element are: "+obj.indexOf('S'));
		System.out.println("The last index is: "+obj.lastIndexOf('S'));
		
		System.out.println("The Collection elements are: "+obj.get(2));
		

		




		
	}
}