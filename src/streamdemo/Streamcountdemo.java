package streamdemo;

import java.util.ArrayList;

public class Streamcountdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Amol");
		arr.add("Rahul");
		arr.add("Anuj");
		arr.add("sunita");
		arr.add("Arjun");
		 long num = arr.stream().filter(s->s.startsWith("A")).count();
		 System.out.println(num);

	}

}
