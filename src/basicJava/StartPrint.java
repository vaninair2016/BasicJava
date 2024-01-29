package basicJava;

import java.util.Collections;

public class StartPrint {

	public static void main(String[] args) {
		
		int height=5;
		int width=5;
		StringBuilder result = new StringBuilder();
		for(int i=1;i<height;i++) {
			result.append(" ");

			for (int j=i;j<width;j++) {
				result.append("*");
			}
			result.append(System.lineSeparator());
		}
 String r=result.toString();
 System.out.println(r);
	}

}
