import java.util.Scanner;

public class SumOfTwoArrays {
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

		int[] sum = new int[n1 > n2 ? n1 : n2];
		int i = n1 - 1;
		int j = n2 - 1;
		int k = sum.length - 1;
		int carry = 0;
		int digit;

		while (k >= 0) {
			digit = carry;
			if (i >= 0) {
				digit += a[i];
			}
			if (j >= 0) {
				digit += b[j];
			}
			carry = digit / 10;
			digit = digit % 10;
			sum[k] = digit;
			i--;
			k--;
			j--;
		}
		if(carry > 0) {
			System.out.println(carry);
		}
      
		for(int d: sum) {
			System.out.println(d);
		}
	}

}
