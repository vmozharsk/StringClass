package app;

import java.math.BigInteger;

public class E341BigInteger {

	public static void main(String[] args) {
       getLong();
       getBigInt();
	}

	public static void getLong(){
		int count = 25;
		long factorial = 1;
		for (int n = 1; n <= count; n++){
			factorial *= n;
			System.out.println("n = " + n +";    factorial = " + factorial);
		}
	}
	
	public static void getBigInt() {
		int count = 25;
		BigInteger factorial = new BigInteger("1");
		BigInteger n = new BigInteger("1");
		for (int i = 1; i <= count; i++){
			factorial = factorial.multiply(n);
			System.out.println("n = " + n + ";    factorial = " + factorial);
			n = n.add(BigInteger.ONE);
		}
		
	}
}
