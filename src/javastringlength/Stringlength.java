package javastringlength;

public class Stringlength {

	public static void main(String[] args) {
		String s= "welcome";
		int i= s.length();
		System .out.println(i);
//		concat
		String s1= "java";
		String s2= "automation";
		String s3= "automation1";
		System .out.println(s1+s2);
//		or
		System .out.println(s1.concat(s2). concat(s3));
		
//		Trim()
		String t =   "   Welcome   ";
		t.trim();
	
		System .out.println(t.trim().length());
		
//		Charter extracting
		
		
		String a= "welcome";
		a.charAt(3);

		System .out.println (a.charAt(3));
		
		
//		contains()
		
				String s4="Welcome";
		     s4.contains("welcome");
		     System .out.println (s4.contains("Welcome"));
	}

}
