package basic1;

// 다형성을 구현하기 위해서는 메소드 재정의와 타입변환이 필요하다
// 인터페이스 역시 이 2가지 기능이 제공되므로 상속과 더불어 다형성을 구현하는데 많이 사용된다.

// 1. 상속 => 같은 종류의 하위 클래스를 만드는 기술
// 2. 인터페이스 => 사용방법이 동일한 클래스를 만드는 기술
// 둘다 다형성을 구현하는 방법은 비슷하다.

// 프로그램을 개발할 때 인터페이스를 사용해서 메소드를 호출하도록 코딩했다면, 구현 객체를
// 매우 손쉽고 빠르게 교체할 수 있다.
// 프로그램 소스코드는 변함이 없는데, 구현 객체를 교체함으로써 프로그램의 실행결과가 다양해진다.
// 이것이 인터페이스의 다형성이다.

// 인터페이스 구현 클래스를 상속해서 자식 클래스를 만들었다면 자식 객체 역시
// 인터페이스 타입으로 자동 타입 변환할 수 있다.

// # 매개변수의 다형성
// 자동 타입 변환은 필드의 값을 대입할 때에도 발생하지만, 주로 메소드를 호출할 때
// 많이 발생한다.
// 매개값을 다양화하기 위해서 상속에서는 매개 변수를 부모 타입으로 선언하고 호출할때에는 자식 객체를 대입한다

// 매개 변수의 타입이 인터페이스일 경우 어떠한 구현 객체도 매개값으로 사용할 수 있고,
// 어떤 구현 객체가 제공되느냐에 따라 메소드의 실행결과는 다양해질 수 있다.
// 이것이 인터페이스 매개 변수의 다형성이다.

// 인터페이스는 메소드의 매개변수로 많이 등장한다
// 인터페이스 타입으로 매개 변수를 선언하면 메소드 호출 시 매개값으로 여러 가지 종류의 구현 객체를 줄 수 
// 있기 때문에 메소드 실행결과가 다양하게 나온다.
interface Tire
{
	void roll();
}

class HankookTire implements Tire
{

	@Override
	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다");
	}
}

class KumhoTire implements Tire
{

	@Override
	public void roll() {
		System.out.println("금호 타이어가 굴러갑니다");
	}
	
}

class Car
{
	Tire frontLeftTire=new HankookTire();
	Tire frontRightTire=new HankookTire();
	Tire backLeftTire=new HankookTire();
	Tire backRightTire=new HankookTire();
	
	void run()
	{
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}

public class srcE {

	public static void main(String[] args) {
		Car myCar=new Car();
		myCar.run();
		
		myCar.frontLeftTire=new KumhoTire();
		myCar.frontRightTire=new KumhoTire();
		
		myCar.run();
	}

}
