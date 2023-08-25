package basic;

public class ArrayConcept {

	public static void main(String[] args) {
		
		int a[] = new int[5]; // declaration & size instantiation
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
//		a[5] = 60;  // ArrayIndexOutOfBoundsException:
		
//		System.out.println(a[4]);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		int b[] = {100,200,300,400};
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		double d[] = new double[6];
		d[1] = 33.33;
		

	}

}
