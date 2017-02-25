package saturday;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Confined {
	public static void main(String[] args) {
		Confined cf = new Confined();
		cf.searchConfined();
	}

	public void searchConfined() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] inputNumber = input.split(" ");
		int row = Integer.parseInt(inputNumber[0]);
		int column = Integer.parseInt(inputNumber[1]);
		List<String> list = new ArrayList<String>();

		int[][] table = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				table[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (i == 0 || i == row - 1 || j == 0 || j == column - 1) {
					continue;
				} else {
					if (table[i][j] == 1) {
						if (table[i - 1][j] == 0 && table[i + 1][j] == 0 && table[i][j - 1] == 0 && table[i][j + 1] == 0
								&& table[i - 1][j - 1] == 0 && table[i - 1][j + 1] == 0 && table[i + 1][j - 1] == 0
								&& table[i + 1][j + 1] == 0) {
							int tmp1 = i + 1;
							int tmp2 = j + 1;
							list.add(tmp1 + "," + tmp2);
						}
					}
				}
			}
		}
		if (list.isEmpty()) {
			System.out.println("We are all OK");
		} else {
			for (String a : list) {
				System.out.println(a);
			}
		}
	}

}
