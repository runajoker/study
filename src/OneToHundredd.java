import java.math.BigInteger;

public class OneToHundredd {

	public static void main(String[] args) {
		/*int sum = 0;
		for(int i=1;i<=100;i++) {
			sum += i;
		}
		System.out.println(sum);*/
		BigInteger big = new BigInteger("1"); 
		for(int i=1; i<=100;i++) {
			big = big.multiply(new BigInteger(Integer.toString(i)));
		}
		System.out.println(big);
	}
}
