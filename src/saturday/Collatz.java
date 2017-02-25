package saturday;

import java.util.Scanner;

public class Collatz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int input = sc.nextInt();

		do {
			if (count >= 500) {
				count = -1;
				break;
			}
			if (input == 1) {
				count = 1;
				break;

			}
			if (input % 2 == 0) {
				input /= 2;
			} else {
				input *= 3;
				input++;
			}
			count++;

		} while (input != 1);
		System.out.println(count);
	}
}
