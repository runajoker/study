import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String ret = "";
		int[] val = new int[input.length()];
		boolean tf = true;
		for(int i =0; i<val.length;i++) {
			val[i] = input.charAt(i)-48;
		}

		if(val.length % 2 == 0) {
			for(int i=0,j=val.length-1;i<val.length/2;i++,j--) {
				if(val[i] != val[j]) {
					tf = false;

				}
			}
		} else {
			for(int i=0,j=val.length-1;i<val.length/2+1;i++,j--) {
				if(i == j) {
				}
				if(val[i] != val[j]) {
					tf = false;
				}
			}
		}
		if(tf) System.out.println("TRUE");
		else System.out.println("FALSE");
	}
}
