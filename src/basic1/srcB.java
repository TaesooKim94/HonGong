package basic1;

// # 추상 클래스
// => 객체를 직접 생성할 수 있는 클래스를 실체 클래스라고 한다면,
//    이 클래스들의 공통적인 특성을 추출해서 선언한 클래스를 추상 클래스라고 한다.
//    추상 클래스와 실체 클래스는 상속의 관계를 가지고 있다.
// 추상클래스가 부모, 실체클래스가 자식

// # 추상 클래스의 용도
// 1. 공통된 필드와 메소드의 이름을 통일할 목적
// 2. 실체 클래스를 작성할 때 시간 절약

// ex) 타이어 규격 => 타이어의 추상 클래스
//     한국타이어,금호타이어 => 추상 클래스를 상속하는 타이어의 실체 클래스

// abstract를 붙이면 new연산자를 이용해서 객체를 만들지 못하고, 상속을 통해 자식 클래스만 만들 수 있다.

// 추상 클래스도 일반 클래스와 마찬가지로 필드,생성자,메소드 선언을 할 수 있다.
// new 연산자로 직접 생성자를 호출할 수는 없지만 자식 객체가 생성될때 super()를 호출해서 추상 클래스 객체를 생성하므로
// 추상 클래스도 생성자가 반드시 있어야 한다.

// 추상 클래스는 실체 클래스가 공통적으로 가져야 할 필드와 메소드들을 정의해놓은 추상적인 클래스로,
// 실체 클래스의 멤버(필드,메소드)를 통일하는데 목적이 있다.
// 모든 실체들이 가지고 있는 메소드의 실행 내용이 동일하다면 추상 클래스에 메소드를 작성하는 것이 좋다

// 추상 메소드는 abstract 키워드와 함께 메소드의 선언부만 있고 메소드 실행 내용인 중괄호{}가 없는 메소드이다.
// 추상 클래스 설계시 하위 클래스가 반드시 실행 내용을 채우도록 강제하고 싶은 메소드가 있을 경우 해당 메소드를 추상 메소드로 선언한다.
// 자식 클래스는 반드시 추상 메소드를 재정의해서 실행 내용을 작성해야 한다.

abstract class Animal
{
	String kind;
	
	public abstract void sound();
	
	public void breathe()
	{
		System.out.println("숨을 쉽니다");
	}
}

public class srcB {

	public static void main(String[] args) {
		
	}

}
