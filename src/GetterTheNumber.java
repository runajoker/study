import java.util.LinkedHashMap;

class GetterTheNumbers {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		String alpha[] = new String[1000];
		String[] a = new String[1000];
		for (int i = 0; i < 1000; i++) {
			alpha[i] = Integer.toString(i);
		}

		for (int i = 0; i < 1000; i++) {
			if (alpha[i].length() > 1) {
				System.out.println("True");
			}
		}

	}
}
