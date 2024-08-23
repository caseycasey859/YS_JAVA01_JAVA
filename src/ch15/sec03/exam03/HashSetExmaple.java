package ch15.sec03.exam03;

import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.List;

public class HashSetExmaple {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Spring"); 
	  
		//객체를 하나씩 가져와서 처리
       Iterator<String> iterator = set.iterator();
       
       While(iterator.hasNext()){
    	   //객체를 하나 가져오기
    	   String element = iterator.next();
    	   System.out.println(element);
    	   if(element.equals("JSP")) {
    		 iterator.remove();
           }
       }
       System.out.println("------------");
       set.remove("Spring");
        for(String element:set) {
        	System.out.println(element);
        }
     )
	}

}
