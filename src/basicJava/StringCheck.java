package basicJava;

public class StringCheck {

	public static void main(String[] args) {
//		String s= "vani S";
//		String s1="setu d";
//		System.out.println("char at :" +s.charAt(2));
//		System.out.println("length :" +s.length());
//		//System.out.println("split :" +s.split(s1));
//		System.out.println("compare :" +s.equals(s1));
		
		StringBuilder s = new StringBuilder("setubaby");
		StringBuilder v = new StringBuilder("vanimol");
		StringBuilder sv= s.append(v);
		System.out.println(sv.toString());

	}

}
