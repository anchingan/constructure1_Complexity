/*
 * Space complexity:					Time complexity:
 * 		line 20-22: O(1)					line 20-22: O(1)
 * 		line 24-34: O(1)					line 24-30: O(1)
 * 		line 	35: O(n)	(recursive)		line 	31: O(n)
 * 					 					line 32-33: O(1)
 * 					 					line 	34: O(n)
 * 					 					line 	35: O(n^2)
 * 					 					
 * 			Total : O(n)						 Total: O(n^2)
 */
package constructure1_complexity;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		int n;
		long[] inputs;
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			inputs = new long[10];
			System.out.println("Input number of inputs(1-10, -1 quit):");
			n = scanner.nextInt();
			if (n == -1)
				break;
			System.out.println("Inputs(1-10^16):");
			for (int i = 0; i < n; i++)
				inputs[i] = scanner.nextLong();
			System.out.println("Results:");
			for (int i = 0; i < n; i++)
//				System.out.println(modResult(sumRecur(inputs[i])));
				System.out.println(mod(sum(inputs[i])));
		}
		
		scanner.close();

	}
	
	
	public static long sumRecur(long n) {
		if (n == 1) {
			return 1;
		}
		else {
			return (n * 2 - 1 + sumRecur(n - 1));
		}
	}
	
	public static long modResult(long n) {
		long l =  (n % (long)(Math.pow(10, 9) + 7));
		return l;
	}
	
	public static long sum(long n) {
		return (n * n);
	}
	
	public static long mod(long n) {
		long q = (long)(Math.pow(10, 9) + 7), r;
		r = ((n % q) * (n % q)) % q;
		return r;
	}
	
}
