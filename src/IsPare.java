import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IsPare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IsPare is = new IsPare();
		System.out.println(is.isPare(sc.nextLine()));
	}

	public String isPare(String str) {
		List<String> strArray = new ArrayList<String>();
		for (int idx = 0; idx < str.length(); idx++) {
			strArray.add(str.substring(idx, idx + 1));
		}

		for (int i = 0; i < str.length(); i++) {
			if (strArray.get(i).equals("(")) {
				if (i == strArray.size() - 1) {
					str = "False";
				} else {
					for (int j = i + 1; j < strArray.size(); j++) {
						if (strArray.get(j).equals(")")) {

							str = "True";
							strArray.remove(j);
							break;
						}
						str = "False";
					}

				}
			} else if (strArray.get(i).equals(")")) {
				str = "False";
				break;
			}

		}

		return str;

	}
}
