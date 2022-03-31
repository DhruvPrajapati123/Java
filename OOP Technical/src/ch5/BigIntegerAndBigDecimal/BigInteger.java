package ch5.BigIntegerAndBigDecimal;
import java.math.*;
//BigInteger and BigDecimal are the class that are use to represent the interger
//or decimal numbers od any size and any pridiction.

public class BigInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 9223372036854775807;
//		This number we can not store into int.Therefor we use biginteger class
		BigInteger x = new BigInteger();
		BigDecimal y = new BigDecimal("1.0");
		BigDecimal z = new BigDecimal("6.0");
		BigDecimal ans = y.divide(z,30,BigDecimal.ROUND_UP);
		System.out.println(ans);
		
	}

}
