package saturday;

import java.util.Scanner;

public class Pairs {

	public static void main(String[] args) {
		Pairs pairs = new Pairs();
		pairs.PairsCheck();
	}

	public void PairsCheck() {

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		String input2 = sc.nextLine();
		String[] inputArray = input.split(" ");
		String[] inputArray2 = input2.split(" ");
		int theNumberOfinput = Integer.parseInt(inputArray[0]);
		int subtraction = Integer.parseInt(inputArray[1]);
		int inputNumbers = inputArray2.length;
		int[] numbersArray = new int[inputNumbers];
		for (int index = 0; index < inputNumbers; index++) {
			numbersArray[index] = Integer.parseInt(inputArray2[index]);
		}

		// desc Sort
		for (int index = 0; index < numbersArray.length; index++) {
			for (int index2 = 0; index2 < numbersArray.length - 1; index2++) {
				if (numbersArray[index2] < numbersArray[index2 + 1]) {
					numbersArray[index2] ^= numbersArray[index2 + 1];
					numbersArray[index2 + 1] ^= numbersArray[index2];
					numbersArray[index2] ^= numbersArray[index2 + 1];

				}
			}
		}

		int cnt = 0;
		for (int index = 0; index < numbersArray.length; index++) {
			for (int index2 = 0; index2 < numbersArray.length - 1; index2++) {
				if (numbersArray[index] - numbersArray[index2 + 1] == subtraction) {
					cnt++;
				}
			}
		}
		System.out.println("cnt:" + cnt);

	}
}
