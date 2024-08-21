package ch11.sec03.exam03;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		String[] array = {"100", "100"};
		
	     for (int i = 0; i<=array.length; i++) {
	    	 try {
	    		 int value = Integer.parseInt(array[i]);
	    		 System.out.printf("array[%d] = %d\n", i, value);
	    	 } catch(ArrayIndexOutOfBoundsException e) {
	    		 System.out.println("배열인덱스오류: "+ e.getMessage());
	    	 } catch(Exception e) {
	    		 System.out.println("실행에 문제가 있습니다.");
	    	 }
	     }
	}

}
