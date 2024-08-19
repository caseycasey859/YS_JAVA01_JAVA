package ch08.sec11.exam02;


public class Bus implements Vehicle {

	@Override
	public void run(String name) {
		System.out.println(name + "이 버스를 운전합니다.");
		
	}

}
