package ch15.sec03.exam02;

import java.util.Set;

public class Member {
	public String name;
	public int age;
	
	public Member(String[] age) {
		Set<Member> set = new HashSet<Member>();
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		System.out.println("총 객체수:"+set.size());
	
	}

	@Override
	public int hashCode() {		
		return name.hashCode()+age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			return target.name.equals(this.name)&& target.age == this.age);
		}
		return false;
	}
	
}
