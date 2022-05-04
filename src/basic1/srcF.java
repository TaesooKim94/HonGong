package basic1;

// # 강제 타입 변환
// 구현 객체가 인터페이스 타입으로 자동 타입 변환하면,
// 인터페이스에 선언된 메소드만 사용 가능하는 제약 사항이 따른다
// 이때 강제 타입 변환을 해서 다시 구현 클래스 타입으로 변환한 다음,
// 구현 클래스의 필드와 메소드를 사용할 수 있다
// 구현클래스 변수 = (구현클래스) 인터페이스변수;

// # 객체 타입 확인
// instanceof 연산자는 인터페이스 타입에서도 사용할 수 있다.

// # 인터페이스 상속
// 인터페이스도 다른 인터페이스를 상속할 수 있다.
// 인터페이스는 클래스와는 달리 다중 상속을 허용한다.
// public interface 하위인터페이스 extends 상위인터페이스1, 상위인터페이스2{ }
// 중요!!!) 구현 클래스로부터 객체를 생성한 후에 하위 및 상위 인터페이스 타입으로 변환이 가능하다
// 하위인터페이스 변수 = new 구현클래스();
// 상위인터페이스1 변수 = new 구현클래스();
// 상위인터페이스2 변수 = new 구현클래스();

public class srcF {

	public static void main(String[] args) {
		Vehicle vehicle=new Bus();
		vehicle.run();
		// vehicle.checkFare();		(X) Vehicle 인터페이스에는 checkFare()가 없음
		
		// 인터페이스 타입으로 자동 타입 변환된 매개값을 메소드 내에서 다시 구현한 클래스 타입으로 강제
		// 타입 변환해야 한다면 반드시 매개값이 어떤 객체인지 instanceof 연사낮로 확인하고 안전하게
		// 강제 타입 변환을 해야 한다
		if(vehicle instanceof Bus)
		{
			Bus bus=(Bus)vehicle;
			bus.run();
			bus.checkFare();	// Bus 클래스에는 checkFare()가 있음
		}
	}
}
