import java.util.Scanner;

public class DifferenceOfArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of elements of first array");
		int n1 = sc.nextInt();
		System.out.println("Print elements");
		int[] a = new int[n1];
		for (int i = 0; i < n1; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter number of elements of second array");
		int n2 = sc.nextInt();
		System.out.println("Print elements");
		int[] b = new int[n1];
		for (int i = 0; i < n2; i++) {
			b[i] = sc.nextInt();
		}
		
		int[] diff = new int[n1 > n2 ? n1 : n2];
		int i = n1 - 1;
		int j = n2 - 1;
		int k = diff.length - 1;
		int rem = 0;
		int digit = 0;
	

	 while(k>=0) {
		 if(i>=0) {
			 digit = a[i];
		 }
		 if(j>=0 && i>=0)  {
			 if(b[j]>a[i]) {
				 digit = 10+a[i] - b[j];		 
			 }else {
				 digit = a[i] - b[j];
			 }
		 }
		 else if(j>=0 && i <0) {
			 digit = b[j];
			 rem = -1;
		 }
		 diff[k] = digit;
		 i--;
		 j--;
		 k--;
	 }
	 if(rem<0) {
		 System.out.println("-1");
	 }
	 for(int d : diff) {
		 System.out.println(d);
	 }
}}
