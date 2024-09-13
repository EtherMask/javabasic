package n_collection;

import java.util.*;

public class Ex06_TreeSet {

	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		set.add("zebrafish");
		set.add("clownfish");
		set.add("orca");
		set.add("whale");
		set.add("seasnake");
		set.add("starfish");
		set.add("jellyfish");
		set.add("lionfish");
		set.add("rabster");
		//set.add("orca"); // 중복안됨
		
		System.out.println(set);
		System.out.println(set.subSet("a" , "t"));
		System.out.println(set.headSet("p"));
		System.out.println(set.tailSet("a"));
	}

}
