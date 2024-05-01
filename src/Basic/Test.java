package Basic;
class App{
	public int index = 1;
}


public class Test extends App {
	public Test(int index) {
		index=index;
		// TODO Auto-generated constructor stub
	}
	
	public static void main (String args[]) {
		Test t = new Test(10);
	}

}




