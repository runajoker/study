import java.util.Scanner;

public class Diamond {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		for (int i = 0; i <= a/2; i++) {

			for (int j = 0; j < a/2 - i; j++)
				System.out.print(" ");
			for (int j = i; j >= 0; j--)
				System.out.print("*");
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
		for (int i = a/2-1; i >=0; i--) {
			
			for (int j = a/2 - i; j > 0; j--)
				System.out.print(" ");
			for (int j = i; j >= 0; j--)
				System.out.print("*");
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
		
	}
}
