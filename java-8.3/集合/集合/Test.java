package 集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import javax.sound.midi.SysexMessage;

public class Test {

	public static void main(String[] args) {
		ArrayList array=new ArrayList(5);
		array.add(12);
		array.add("a");
		array.add("1");
		array.add(1.0);
		array.add(new Stu(1,"stu"));
		printArrayList(array);
		System.out.println("***************************");
		array.add(1, new Stu(3,"stu"));
		printArrayList(array);
		System.out.println("***************************");
		array.remove(2);
		printArrayList(array);
		System.out.println("***************************");
		System.out.println(array.size());
		System.out.println(array.contains(1.0));
		
		System.out.println("***************************");
		Iterator iter=array.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("***************************");
		ListIterator it= array.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("***************************");
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		System.out.println("***************************");
		System.out.println(array.get(3));
		
		
		
	}
	public static void printArrayList(ArrayList array) {
		for (Object object : array) {
			System.out.println(object);
		}
	}

}
