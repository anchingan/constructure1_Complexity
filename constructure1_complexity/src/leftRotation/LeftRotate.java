package leftRotation;

import java.util.Scanner;

public class LeftRotate {

	public static void main(String[] args) {
//		int[] intArr = {1, 2, 3, 4, 5, 6, 7, 10};
		Scanner scanner = new Scanner(System.in);
		int[] intArr;
		int n, d;
		System.out.println("Number and displacement:");
		n = scanner.nextInt();
		d = scanner.nextInt();
		intArr = new int[n];
		for (int i = 0; i < n; i++)
			intArr[i] = scanner.nextInt();
		
		leftRotation(intArr, d);
		for (int i = 0; i < n; i++)
			System.out.print(intArr[i]+" ");
		
		System.out.println("\nProgram terminate.");

	}
	
	public static void leftRotation(int[] arr, int d) {
		int count = arr.length, tmp = arr[count - d];
		int oldInd = 0, newInd = count - d;
		
		for (int i = 0; i < count - 1; i++) {
			arr[newInd] = arr[oldInd];
			newInd = oldInd;
			if (oldInd + d < count)
				oldInd += d;
			else
				oldInd = oldInd + d - count;
		}
		arr[newInd] = tmp;
	}

}
