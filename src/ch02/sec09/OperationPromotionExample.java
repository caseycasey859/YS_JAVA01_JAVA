package ch02.sec09;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte byteResult = 10+20;
		System.out.println(byteResult);

		byte v1 = 10;
		byte v2 = 20;
		byteResult = (byte) (v1+v2);
		int intResult = v1+v2;
		System.out.println(byteResult);
		System.out.println(intResult);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		short shortResult = (short) (v3 + v4 + v5);
		long longResult = v3 + v4 + v5;
		System.out.println(longResult);
		
		
		char v6 = 'A';
		char v7 = 1;
		char charResult = (char) (v6 + v7);   //밑줄에러가 아니고 경고
		intResult = v6 + v7;

		int v8 =10;
		intResult = v8/4;
		System.out.println(intResult);

		int v9 =10;
		double doubleResult = v9 / 4.0;		
		System.out.println(doubleResult);
		
		int v10 = 1;
		int v11 = 2;
		doubleResult = (double)v10 / v11;
		System.out.println(doubleResult);
		
		
		
	}

}