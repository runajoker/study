package saturday;

import java.util.Scanner;

public class LongStringFind {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int max = 0;
		int idx = -1;
		String[] spl = sc.nextLine().split(", ");
		
		for(int i=0; i<spl.length;i++) {
			if(spl[i].length() > max) {
				max = spl[i].length();
				idx = i;
			}
		}
		System.out.println(spl[idx]);
		
	}
}
