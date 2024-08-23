package ch15.sec02.exam03;

public class ListTestExample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i = 0; i<10000; i++) {
		endTime = System.nanoTime();
	  }
		endTime = System.nanoTime();
		
		System.out.printf("LinkedList:");
		
		startTime = System.nanoTime();
		endTime = System.nanoTime();
	}
}
