package ch08.sec01;

public class MainExaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rct = new TV();
		rct.turnOn();
		rct.turnOff();
		System.out.printf("TV의 최대볼륨:%d, 최소볼륨:%d\n", 
				RemoteControl.MAX_VOLUME, RemoteControl.MIN_VOLUME);
		
		rct.setVolume(6);
		TV tv = (TV)rct;
		tv.printVolume();

		rct.setMute(true);
		tv.printVolume();
		rct.setMute(false);
		tv.printVolume();
		

		System.out.println("-----------------------");
		
		rct = new Radio();
		rct.turnOn();
		rct.turnOff();
		System.out.printf("라디오의 최대볼륨:%d, 최소볼륨:%d\n", 
				RemoteControl.MAX_VOLUME, RemoteControl.MIN_VOLUME);
		
		rct.setVolume(50);
		Radio rdo = (Radio)rct;
		rdo.printVolume();
	}

}
