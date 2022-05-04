package basic1;

// # 다형성
// => 사용법은 동일하지만 다양한 객체를 이용해서 다양한 실행결과가 나오도록 하는 성질
// ex) 자동차가 타이어를 사용하는 방법은 동일하지만 어떤 타이어를 사용(장착)하느냐에 따라 주생 성능이 달라질 수 있다.

// # 자동 타입 변환
// 클래스의 변환은 상속 관계에 있는 클래스 사이에서 발생한다
// 자식은 부모 타입으로 자동 타입 변환이 가능하다
// ex) 부모타입 변수 = 자식타입;
// 자동 타입 변환의 개념은 자식은 부모의 특징과 기능을 상속받기 때문에 부모와 동일하게 취급될 수 있다는 것이다.

// # 필드의 다형성
// => 자동 타입 변환은 다형성을 구현하기 위한 것이다.
//    필드의 타입을 부모 타입으로 선언하면 다향한 자식 객체들이 저장될 수 있기 때문이다.

// 부모 클래스를 상속하는 자식 클래스는 부모가 가지고 있는 필드와 메소드를 가지고 있으니
// 사용 방법이 동일할 것이다. 자식 클래스는 부모의 메소드를 재정의해서 메소드의 실행 내용을 변경함으로써
// 더 우수한 실행결과가 나오게 할 수도 있다.

// # 매개변수의 다형성
// => 메소드를 호출할 때에는 매개 변수의 타입과 동일한 매개값을 지정하는 것이 정석이지만,
//    매개값을 다양화하기 위해 매개 변수에 자식 객체를 지정할 수도 있다


class Animal
{
	
}

class Cat extends Animal
{
	
}

//------------------------------------------------------------------------------

class Tire{}

class HankookTire extends Tire{}
class KumhoTire extends Tire{}

class Car{
	Tire frontLeftTire=new Tire();
	Tire frontRightTire=new Tire();
	Tire backLeftTire=new Tire();
	Tire backRightTire=new Tire();
}

//-----------------------------------------------------------------------------------------

class Vehicle{
	void run() {}
}

class Bus extends Vehicle
{
	void run() {}
}

class Driver
{
	void drive(Vehicle vehicle)
	{
		vehicle.run();
	}
}

public class src9 {

	public static void main(String[] args) {
		Cat cat=new Cat();
		Animal animal=cat;
		
		Animal animal2=new Cat();
		
		// 바로 위의 부모가 아니더라도 상속 계층에서 상위 타입이라면 자동 타입 변환이 일어날 수 있다.
		
		// 부모 타입으로 자동 타입 변환된 이후에는 부모 클래스에 선언된 필드와 메소드만 접근이 가능하다.
		// 메소드가 자식 클래스에서 재정의되었다면 자식 클래스의 메소드가 대신 호출된다.
		
		// # 필드의 다형성
		Car myCar=new Car();
		myCar.frontRightTire=new HankookTire();
		myCar.backLeftTire=new KumhoTire();
		
		// # 매개변수의 다형성
		Driver driver=new Driver();
		driver.drive(new Bus());
	}

}
