package StringProgram;

public class StringNumber {

	public static void main(String[] args) {
		
		
		  String s = "123AM256CD"; 
		  String st1=s.replaceAll("[^A-Za-z]", ""); 
		  String st2=s.replaceAll("[^0-9]", "");
		  //String str3 = s.replaceAll("[^\w\s]", "");
		  System.out.println("String b = "+st1);
		  System.out.println("Int c = "+st2);
		 
			/*
			 * String s = "123AM256CDfgh"; String ch = ""; String num = ""; for(int
			 * i=0;i<s.length();i++) { char c = s.charAt(i); if(c>='0' && c<='9') {
			 * num=num+c; } if(c>='A' && c<='Z') { ch=ch+c; } if(c>='a' && c<='z') {
			 * ch=ch+c; } } System.out.println(ch); System.out.println(num);
			 */	}

}
