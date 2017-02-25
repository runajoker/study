package saturday;
import java.util.Scanner;
public class StrLength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] spl = input.split(" ");
		
		for(String a:spl) {
			System.out.print(a.trim().length()+" ");
		}
		
	}
}
