import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZeroBack {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		List<Integer> list = new ArrayList<Integer>();
		int[] a = new int[input.length()];
		
		for(int i = 0; i< a.length;i++) {
			a[i] = input.charAt(i)-48;
		}
		
		for(int i= 0; i< a.length; i++) {
			if(a[i] == 0) {
				count++;
			} else {
				list.add(a[i]);
			}
			
		}
		
		for(int i=0; i< count; i++) {
			list.add(0);
		}
		
		for(int c:list) {
			System.out.print(c);
		}
	}
}
