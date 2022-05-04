package basic1;

public class Car
{
	String company="현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(){}
	
	Car(String model)
	{
		this(model,"은색",250);
	}
	
	Car(String model, String color)
	{
		this(model,color,250);
	}
	
	// 필드 초기화 내용은 한 생성자에만 집중적으로 한다.
	Car(String model, String color, int maxSpeed)
	{
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
}
public class src3 {

	public static void main(String[] args) {
		// 객체들 사이의 상호작용 수단은 메소드이다.
		// 이때 객체가 다른 객체의 기능을 이용하는 것이 바로 메소드 호출이다.
		
		// 1)상속관계 => 기계와 자동차
		// 2)사용관계 => 사람과 자동차
		// 3)집합관계 => 부품과 자동차
		
		// 2개 이상의 클래스가 선언된 소스 파일을 컴파일하면 바이트 코드 파일(.class)은 클래스를 선언한 개수만큼 생긴다
		
		// public 접근 제한자는 파일 이름과 동일한 이름의 클래스 선언에만 붙일 수 있다.
		// 가급적이면 소스 파일 하나당 동일한 이름의 클래스 하나를 선언하는 것이 좋다.
		
		// new 연산자로 생성된 객체는 메모리 힙(heap) 영역에 생성된다.
		// new 연산자는 힙 영역에 객체를 생성시킨 후 객체의 번지를 리턴하도록 되어 있다.
		// 이 주소를 참조 타입인 클래스 변수에 저장해두면 변수를 토애 객체를 사용할 수 있다.
		
		// 클래스는 2가지 용도가 있다.
		// 하나는 라이브러리(API)용이고 다른 하나는 실해용이다.
		// 라이브러리 클래스는 다른 클래스에서 이용할 목적으로 설계된다.
		// 실행 클래스는 프로그램의 실행 진입점인 main() 메소드를 제공하는 역할을 한다.
		
		// 클래스의 필드 초기값은 필드 선언시 주어질 수도 있고 생략될 수도 있다.
		// 초기값이 지정되지 않은 필드는 생성시 자동으로 기본 초기값으로 설정된다.
		// 참조 타입은 객체를 참조하고 있지 않은 상태인 null로 초기화된다.
		
		// 도트(.) 연산자는 객체 접근 연산자로 객체가 가지고 있는 필드나 메소드를 사용하고자 할때 사용된다.
		
		// 클래스가 public class로 선언되면 기본 생성자에서도 public이 붙지만,
		// 클래스가 public 없이 class로만 선언되면 기본 생성자에도 public이 붙지 않는다.
		
		// # 다른 생성자 호출: this()
		// => 생성자 오버로딩이 많아질 경우 생성자 간의 중복된 코드가 발생할 수 있다.
	}

}
