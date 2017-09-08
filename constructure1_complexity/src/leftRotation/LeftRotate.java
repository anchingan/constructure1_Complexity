package leftRotation;

import java.util.Scanner;

public class LeftRotate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] intArr;
		int n, d;
//		System.out.println("Number and displacement:");
//		n = scanner.nextInt();
//		d = scanner.nextInt();
		n = 12;
		d = 4;
		intArr = new int[n];
//		System.out.println("Input:");
		for (int i = 0; i < n; i++)
//			intArr[i] = scanner.nextInt();
			intArr[i] = i + 1;
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
				while (start % d == 0 && start / d > 0) {
					start++;
					}
				nextInd = start;
				nextVal = arr[start];
				i += 2;
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
	}
	
//	public static void leftRotation(int[] arr, int d) {
//		int count = arr.length, tmp = arr[count - d];
//		int fromInd = 0, toInd = count - d;
//		int i = 0, start = 0;
//		
//		while (i < count - 1) {
//			arr[toInd] = arr[fromInd];
//			toInd = fromInd;
//			if (fromInd + d == count + start - d ) {
//				arr[toInd] = tmp;
//				fromInd = (++start);
//				toInd = fromInd + d;
//				tmp = arr[toInd];
//				i += 2;
//			}
//			else if (fromInd + d < count) {
//				fromInd += d;
//				i++;
//			}
//			else {
//				fromInd = fromInd + d - count;
//				i++;
//			}
//		}
//		arr[toInd] = tmp;
//	}

}
