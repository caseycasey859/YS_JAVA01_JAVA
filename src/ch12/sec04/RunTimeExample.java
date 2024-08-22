package ch12.sec04;

public class RunTimeExample {

	public static void main(String[] args) {
	    
		long begin = System.nanoTime();
		int sum = 0;
		for(int i = 1; i<100000; i++) {
			sum += i;
		}
		
		long end = System.nanoTime();
		System.out.println(end-begin + "나노초");
		

	}

}
