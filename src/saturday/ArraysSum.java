package saturday;

import java.util.Scanner;

public class ArraysSum {

	public static void main(String[] args) {
		ArraysSum aryS = new ArraysSum();
		aryS.arraysSum();
	}

	public void arraysSum() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		boolean result = false;
		String c = sc.nextLine();
		int count = Integer.parseInt(c);
		for (int index = 0; index < count; index++) {
			String si = sc.nextLine();
			int size = Integer.parseInt(si);
			
			String inputArray = sc.nextLine();

			String[] array = inputArray.split(" ");
			int[] arrays = new int[size];
			for (int i = 0; i < size; i++) {
				arrays[i] = Integer.parseInt(array[i].trim());
			}
			int sumCheck1 = 0;
			int sumCheck2 = 0;

			for (int idx = 1; idx < arrays.length; idx++) {
				sumCheck1 += arrays[idx];
			}
			if (sumCheck1 == 0) {
				result = true;
				sumCheck1 = 0;
			} else {
				sumCheck1 = 0;
			}
			for (int idx = arrays.length - 2; idx >= 0; idx--) {
				sumCheck1 += arrays[idx];
			}
			if (sumCheck1 == 0) {
				result = true;
				sumCheck1 = 0;
			} else {
				sumCheck1 = 0;
			}

			for (int i = 0; i < arrays.length; i++) {

				for (int l = 0; l < i; l++) {
					sumCheck1 += arrays[l];
				}
				for (int m = arrays.length - 1; m > i; m--) {
					sumCheck2 += arrays[m];
				}
				System.out.println(sumCheck1 + "//" + sumCheck2);
				if (sumCheck1 == sumCheck2) {
					result = true;
				}
				sumCheck2 = 0;
				sumCheck1 = 0;
			}
			if(result) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}
}
