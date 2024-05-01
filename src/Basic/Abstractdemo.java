package Basic;

 abstract class Child {
	Child(){
		System.out.println("this is abstract class");
	}
	public abstract void testAbstract();
	

}

class Abstractdemo extends Child{

	@Override
	public void testAbstract() {
		// TODO Auto-generated method stub
		System.out.println("Method");
	}
	public static void main(String[] args) {
		Abstractdemo c = new Abstractdemo();
		c.testAbstract();

	}
	
}
