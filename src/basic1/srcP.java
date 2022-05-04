package basic1;

import java.util.Date;

// # 객체 문자 정보(toString())
// Object 클래스의 toString() 메소드는 객체의 문자 정보를 리턴한다
// 객체의 문자 정보란 객체를 문자열로 표현한 값이다.
// 기본적으로  Object 클래스의 toString() 메소드는 '클래스이름@16진수해시코드'로 구성된 문자 정보를 리턴한다.

// Object의 toString() 메소드의 리턴값은 별 값어치가 없는 정보이므로
// Object 하위 클래스는 toString() 메소드를 재정의(오버라이딩)하여 간결하고 유익한 정보를 리턴하도록 되어 있다.
// ex) java.util 패키지의 Date 클래스는 toString() 메소드를 재정의하여 현재 시스템의 날짜와 시간 정보를 리턴한다.
//     그리고 
//     String 클래스는 toString() 메소드를 재정의해서 저장하고 있는 문자열을 리턴한다.

class Member
{
	String id;
	
	Member(String id)
	{
		this.id=id;
	}

	// id가 동일한 문자열인 경우 같은 해시 코드를 리턴
	@Override
	public int hashCode() {
		// id 필드값이 같을 경우 같은 해시코드를 리턴하도록 하기 위해 String의 hashCode() 메소드의 리턴값을 활용한다.
		// String의 hashCode()는 같은 문자열일 경우 동일한 해시코드를 리턴한다.
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member)
		{
			Member member=(Member)obj;
			
			if(this.id.equals(member.id))
				return true;
		}
		
		return false;
	}
}
public class srcP {

	public static void main(String[] args) {
		Object obj1=new Object();
		Date obj2=new Date();
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj2);
	}

}
