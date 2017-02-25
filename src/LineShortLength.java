
public class LineShortLength {

	public static void main(String[] args) {

		int[] s = { 1, 2, 5, 8, 13, 18, 20 };
		int minValue = 999;
		int minIndexLow = -1;
		int minIndexHigh = -1;
		for(int i=0;i<s.length-1;i++) {
			if(minValue > s[i+1]-s[i]) {
				minValue = s[i+1]-s[i];
				minIndexLow = i;
				minIndexHigh = i+1;
				
			}
		}
		System.out.println(minValue);
		System.out.print(s[minIndexLow]+",");
		System.out.println(s[minIndexHigh]);
	}
}
