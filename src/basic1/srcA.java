package basic1;

// # 강제 타입 변환
// => 부모 타입을 자식 타입으로 변환하는 것
//    그렇다고 해서 모든 부모 타입을 자식 타입으로 강제 변환할 수 있는 것은 아니다.
//    자식 타입이 부모 타입으로 자동 타입 변환한 후 다시 자식 타입으로 변환할때 강제 타입 변환을 사용한다
// ex) 자식타입 변수 = (자식타입) 부모타입;
// Parent parent = new Child();
// Child child = (Child)parent;

// 자식 타입이 부모 타입으로 자동 타입 변환하면, 부모에 선언된 필드와 메소드만 사용 가능하다는 제약 사항이 따른다
// 만약 자식에 선언된 필드와 메소드를 꼭 사용해야 한다면 강제 타입 변환을 해서 다시 자식 타입으로 변환한 다음
// 자식의 필드와 메소드를 사용하면 된다.

// # 객체 타입 확인
// 부모 변수가 참조하는 객체가 부모 객체인지 자식 객체인지 확인하는 방법
// => instanceof 연산자

class Parent{}
class Child extends Parent
{
	public void method(Parent parent)
	{
		if(parent instanceof Child)
		{
			Child child=(Child)parent;
		}
	}
}

public class srcA {

	public static void main(String[] args) {

	}

}
