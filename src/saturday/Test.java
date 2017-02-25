package saturday;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean result = false;
		String inputArray = sc.nextLine();
		int sumCheck1 = 0;
		int sumCheck2 = 0;
		String[] arrays = inputArray.split(" ");
		System.out.println(arrays.length);
		int[] array = new int[arrays.length];
		for (int i = 0; i < arrays.length; i++) {
			array[i] = Integer.parseInt(arrays[i]);
		}

		for (int idx = 1; idx < array.length; idx++) {
			sumCheck1 += array[idx];
		}
		if (sumCheck1 == 0) {
			result = true;
			sumCheck1 = 0;
		} else {
			sumCheck1 = 0;
		}
		for (int idx = array.length - 2; idx >= 0; idx--) {
			sumCheck1 += array[idx];
		}
		if (sumCheck1 == 0) {
			result = true;
			sumCheck1 = 0;
		} else {
			sumCheck1 = 0;
		}

		for (int i = 0; i < arrays.length; i++) {

			for (int l = 0; l < i; l++) {
				sumCheck1 += array[l];
			}
			for (int m = arrays.length - 1; m > i; m--) {
				sumCheck2 += array[m];
			}
			System.out.println(sumCheck1 + "//" + sumCheck2);
			if (sumCheck1 == sumCheck2) {
				result = true;
			}
			sumCheck2 = 0;
			sumCheck1 = 0;
		}
		System.out.println(result);
	}
}
