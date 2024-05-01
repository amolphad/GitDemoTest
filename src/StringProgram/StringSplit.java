package StringProgram;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java1234@#$";
		StringBuffer alpha = new StringBuffer();
		StringBuffer num = new StringBuffer();
		StringBuffer spchar = new StringBuffer();
		
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))) {
				num.append(s.charAt(i));
			}
			else if(Character.isAlphabetic(s.charAt(i))) {
				alpha.append(s.charAt(i));
			}
			else {
				spchar.append(s.charAt(i));
			}
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(spchar);
		

	}

}
