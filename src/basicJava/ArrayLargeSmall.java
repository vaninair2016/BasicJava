package basicJava;

public class ArrayLargeSmall {

	public static void main(String[] args) {
		int a[]= {31,7,91,94,5,2,42,8,9,8};
		int largest=a[0];
		int small= a[0];
		
		for (int i=0;i<a.length;i++) {
			if (a[i]>largest) {
				largest=a[i];
			}
			else if(a[i]<small) {
				small=a[i];
			}
		}
		System.out.println(largest);
		System.out.println(small);
				

	}

}
