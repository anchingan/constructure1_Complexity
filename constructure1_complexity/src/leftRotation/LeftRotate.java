package leftRotation;

import java.util.Scanner;

public class LeftRotate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] intArr;
		int n, d;
		System.out.println("Number and displacement:");
		n = scanner.nextInt();
		d = scanner.nextInt();
//		n = 50; //for test
//		d = 8;  //for test
		intArr = new int[n];
		System.out.println("Input:");
		for (int i = 0; i < n; i++)
			intArr[i] = scanner.nextInt();
//			intArr[i] = i + 1; //for test
		for (int i = 0; i < n; i++)
			System.out.print(intArr[i]+" ");
		System.out.println("");
		
		leftRotation(intArr, d);
		for (int i = 0; i < n; i++)
			System.out.print(intArr[i]+" ");
		
		System.out.println("\nProgram terminate.");

	}
	
	public static void leftRotation(int[] arr, int d) {
		int count = arr.length, curInd = 0, nextInd = count - d;
		int curVal = arr[curInd], nextVal = arr[nextInd], start = 0;
		int i = 0;
		while (i < count) {
			arr[nextInd] = curVal;
			curInd = nextInd;
			curVal = nextVal;
			if (nextInd - d == start) {
				arr[start] = curVal;
				start++;
				nextInd = start;
				nextVal = arr[start];
				i++;
			}
			else if (nextInd - d < 0) {
				nextInd = nextInd - d + count;
				nextVal = arr[nextInd];
				i++;
			}
			else {
				nextInd = nextInd - d;
				nextVal = arr[nextInd];
				i++;
			}
		}
		arr[start] = curVal;
	}
	
}
