package ch05.sec05;

public class charAtExample {

	public static void main(String[] args) {
	      String today="20240812";
	      String JuminNum = "011222-3051454";
	      char sex = JuminNum.charAt(7);
	      System.out.println(sex);
	      
	      
	      char[] juminArr = {'0','1','1','2','2','2','-','3','0','5','1','4','5','4' };  
	      char sex2 = juminArr[7];
	      System.out.println(sex2);
	      
	      //미성년자인지? 경노우대사항인지 (만18세 미만 500원, 만60세이상 0원, 일반인 1,000원)
	      //지하철요금 과금

	}

}
