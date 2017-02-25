import java.util.Scanner;

public class StringZip {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		sb.append("test");
		String input = sc.nextLine();
		char[] split = new char[input.length()];
		String[] strSplit = new String[input.length()];
		for (int index = 0; index < split.length; index++) {
			split[index] = input.charAt(index);
		}
		for (int index = 0; index < split.length; index++) {
			strSplit[index] = Character.toString(split[index]);
		}
		int count = 1;
		for (int index = 0; index < split.length; index++) {
			if (index < split.length - 1) {
				if (strSplit[index].compareTo(strSplit[index + 1]) == 0) {
					count++;

				} else {
					sb.append(strSplit[index] + count);
					count = 1;
				}
			} else {
				sb.append(strSplit[index] + count);
			}
		}
		System.out.println(sb);
	}
}
