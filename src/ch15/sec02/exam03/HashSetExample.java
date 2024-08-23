package ch15.sec02.exam03;

import java.util.Set;
import java.util.HashSet;

public class HashSetExample {
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java");  //중복불가
		set.add("Spring");
		
		System.out.println("총 객체수:"+ set.size));
	}

}
