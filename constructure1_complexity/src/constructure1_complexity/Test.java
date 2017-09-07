package constructure1_complexity;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		int n;
		long[] inputs;
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			inputs = new long[10];
			System.out.println("Input number of inputs(-1 quit):");
			n = scanner.nextInt();
			if (n == -1)
				break;
			System.out.println("Inputs:");
			for (int i = 0; i < n; i++)
				inputs[i] = scanner.nextLong();
			System.out.println("Results:");
			for (int i = 0; i < n; i++)
				System.out.println(modResult(sumRecur(inputs[i])));
		}

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
	
}
