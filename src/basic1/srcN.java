package basic1;

// # 기본 API 클래스
// # java.lang 패키지
// => 자바 프로그램의 기본적인 클래스를 담고 있는 패키지
//    그래서 java.lang 패키지에 있는 클래스와 인터페이스는 import없이 사용할 수 있다.
//    그동안 사용한 String과 System 클래스도 java.lang 패키지에 포함되어 있기 때문에 import하지 않고 사용했다.
// 1. Object 클래스 => 자바 클래스의 최상위 클래스
// 2. System 클래스 => 표준 입력,출력
// 3. Class 클래스 => 클래스를 메모리로 로딩할 때 사용
// 4. String 클래스 => 문자열을 저장하고 여러가지 정보를 얻을때
// 5. Wrapper 클래스 => 기본 타입의 데이터를 갖는 객체를 만들때 사용
// 6. Math 클래스 => 수학 함수를 이용할 때 사용

// API는 라이브러리 라고 부르기도 하는데, 프로그램 개발에 자주 사용되는 클래스 및 인터페이스의 모음을 말하는 것

// equals() 메소드의 매개 타입은 Object인데, 이것은 모든 객체가 매값으로 대입될 수 있음을 말하낟
// 왜냐하면 모든 객체는 Object 타입으로 자동 타입 변환될 수 있기 때문이다.
// 자바에서는 두 객체를 동등 비교할때 equals() 메소드를 흔히 사용한다.
// equals() 메소드는 두 객체를 비교해서 논리적으로 동등하면 true를 리턴하고, 그렇지 않으면 false를 리턴한다.
// 논리적으로 동등하다는 것은 같은 객체이건 다른 객체이건 상관없이 객체가 저장하고 있는 데이터가 동일함을 뜻한다.

// 일반적으로 Object의 equals() 메소드는 직접 사용되지 않고 하위 클래스에서 재정의하여 논리적으로 동등 비교할때 이용된다.

class Member
{
	public String id;
	
	Member(String id)
	{
		this.id=id;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Member)
		{
			Member member=(Member)obj;
			if(id.equals(member.id))
				return true;
		}
		
		return false;
	}
}

public class srcN {

	public static void main(String[] args) {
		Member obj1=new Member("blue");
		Member obj2=new Member("blue");
		Member obj3=new Member("red");
		
		if(obj1.equals(obj2))
		{
			System.out.println("obj1과 obj2는 동등하다");
		}
		else
		{
			System.out.println("obj1과 obj2는 동등하지 않다.");
		}
		
		if(obj1.equals(obj3))
		{
			System.out.println("obj1과 obj3는 동등하다");
		}
		else
		{
			System.out.println("obj1과 obj3는 동등하지 않다");
		}
	}

}
 