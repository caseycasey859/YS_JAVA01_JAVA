package ch05.sec06;

public class LengthExample {

	public static void main(String[] args) {
	  String ssn = "123456789";
	  int len = ssn.length();
	  System.out.println("문자열길이:"+len);
	  String oldStr = "홍길동은 어려서 집을 나왔습니다. 그래서 홍길동은 어렵게 성장했습니다.";
	  System.out.println(oldStr);
	  //알고보니 홍길동은 홍씨 아니라 고씨였습니다. 이름은 몰라
	  String newStr = oldStr.replace("홍길동","고몰라");
	  System.out.println(newStr);
	  //문자열 잘라내기 (substring(시작) substring(시작,끝);
	  ssn = "881002-1234567";
	  String birthDay = ssn.substring(2,6);
	  System.out.println("생일:"+birthDay);
	  
	  //1988-01-02
	  char sex = ssn.charAt(7);
	  String date = (sex=='1' || sex=='2')? "19":"20";
	  
	  date += ssn.substring(0,2) +"-"+ssn.substring(2,4)+"-"+ssn.substring(4,6);
	  
	  System.out.println("생일:"+date);
	  
	  //문자열찾기(indexOf)---------------
	  
	  String subject = "자바 프로그래밍";
	  int location = subject.indexOf("프로그래밍");
	  System.out.println(location);
	  String substring = subject.substring(location);
	  System.out.println(substring);
	  
	  boolean bool =subject.contains("자바");
	  System.out.println(bool);
	  
	  //
	  String date1 = "2024년08월12일 18:45:23";
	  String date2 = "2024-08-12 pm 11:25:03";
	  String date3 = "2024-08-12 pm 06:25:13";
	  //8/12 오후 9시까지 몇시 몇분 몇초 남았는지 구하시오
	  //8/12일 오후 9시정각까지 XX시 XX분 XX초가 남았습니다.
	  
	  //기준시간
	  int stdHour = 20;
	  int stdMinute = 59;
	  int stdSec = 60;
	  
	  String strDate = date1;
	  int hour = 0;
	  int minute = 0;
	  int sec = 0;
	  if(strDate.contains("pm")) {
		  hour +=12;
	  }
	  
	  int hourIndex = strDate.substring(hourIndex, hourIndex+2);
	  hour + Integer.parseInt(strMinute);
	  
	  String strMinute = strDate.substring(hourIndex+3, hourIndex+5);
	  minute += Integer.parseInt(strHour);
	  System.out.println(hour);
	  
	  String strMinute = strDate.substring(hourIndex+3, hourIndex+5);
	  minute += Integer.parseInt(strSec);
	  System.out.println(minute);
	  
	  
	  

	}

}
