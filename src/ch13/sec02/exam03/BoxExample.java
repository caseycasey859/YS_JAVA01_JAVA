package ch13.sec02.exam03;

public class BoxExample {
	
	//제네릭 메소드
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<>();
		box.setT(t);
		return box;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box<Integer> box1 = boxing(100);
		int intValue = box1.getT();
		System.out.println(intValue);

		Box<String> box2 = boxing("홍길동");
		String strValue = box2.getT();
		System.out.println(strValue);
	}

}