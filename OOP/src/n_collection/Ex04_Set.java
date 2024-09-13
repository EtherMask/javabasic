package n_collection;

import java.util.*;

public class Ex04_Set {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Zebra");
		set.add("cat");
		set.add("dog");
		set.add("ant");
		set.add("dog");
		set.add("dog");
		
		System.out.println(set);
	}

}
