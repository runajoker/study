public class GetNumber {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		String alpha[] = new String[1000];
		
		int one = 0, two =0, three=0, four=0, five=0, six=0, seven=0, eight=0, nine=0, zero = 0;
		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = Integer.toString(i+1);
		}

		for (int i = 0; i < alpha.length; i++) {
			if (alpha[i].length() > 1) {
				for(int j=0;j<alpha[i].length();j++) {
					sb.append(alpha[i].substring(j, j+1)+" ");
				}
			} else {
				sb.append(alpha[i]+" ");
			}
		}
		String[] f = sb.toString().split(" ");
		for(int i=0; i< f.length;i++) {
			if(f[i].equals("1")) {
				one++;
			} else if(f[i].equals("2")) {
				two++;
			}else if(f[i].equals("3")) {
				three++;
			}else if(f[i].equals("4")) {
				four++;
			}else if(f[i].equals("5")) {
				five++;
			}else if(f[i].equals("6")) {
				six++;
			}else if(f[i].equals("7")) {
				seven++;
			}else if(f[i].equals("8")) {
				eight++;
			}else if(f[i].equals("9")) {
				nine++;
			}else if(f[i].equals("0")) {
				zero++;
			}
		}
		
		System.out.println("1 : " + one);
		System.out.println("2 : " + two);
		System.out.println("3 : " + three);
		System.out.println("4 : " + four);
		System.out.println("5 : " + five);
		System.out.println("6 : " + six);
		System.out.println("7 : " + seven);
		System.out.println("8 : " + eight);
		System.out.println("9 : " + nine);
		System.out.println("0 : " + zero);
	}
}
