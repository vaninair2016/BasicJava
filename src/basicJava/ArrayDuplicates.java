package basicJava;

public class ArrayDuplicates {

	public static void main(String[] args) {
		int a[]= {3,7,9,9,5,2,2,8,9,8};
		int d[];
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if (a[i]==a[j]) {
					//int d[]=a[j];
					System.out.println(a[j]);
				}
			}
		}

	}

}
