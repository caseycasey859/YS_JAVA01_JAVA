package ch03.sec01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.printf("연산전 x:%d, y:%d\n", x,y);

		System.out.println(++x); //증가후 출력
		System.out.println(y++); //출력후 출력

		System.out.printf("최종 x:%d, y:%d\n", x,y);
		

		x = 10; y=10;
		System.out.printf("연산전 x:%d, y:%d\n", x,y);

		System.out.println(--x); //감소후 출력
		System.out.println(y--); //출력후 감소

		System.out.printf("최종 x:%d, y:%d\n", x,y);

	}

}
