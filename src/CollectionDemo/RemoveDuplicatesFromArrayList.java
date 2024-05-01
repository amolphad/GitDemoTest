package CollectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(10,20,30,10,40,20,30,50,60,50,70));
		Set<Integer> s = new LinkedHashSet<Integer>(al);
		System.out.println(s);

	}

}
