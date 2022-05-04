package basic1;

// # 인터페이스
// => 객체의 사용방법을 정의한 타입
//    인터페이스를 통해 다양한 객체를 동일한 사용방법으로 이용할 수 있다.
// 인터페이스는 개발코드와 객체가 서로 통신하는 접점역할을 한다.
// 개발코드가 인터페이스의 메소드를 호출하면 인터페이스는 객체의 메소드를 호출시킨다.
// 그렇기 때문에 개발코드는 객체의 내부구조를 알 필요가 없고 인터페이스의 메소드만 알고 있으면 된다.

// 여기서 개발 코드가 직접 객체의 메소드를 호출하면 간단한데 왜 중간에 인터페이스를 두는지 의문점이 생긴다
// 그 이유는 개발 코드를 수정하지 않고 사용하는 객체를 변경할 수 있도록 하기 위해서이다.
// 인터페이스는 하나의 객체가 아니라 여러 객체들과 사용이 가능하므로 어떤 객체를 사용하느냐에 따라서
// 실행 내용과 리턴값이 다를 수 있다.
// 따라서 개발 코드 측면에서는 코드 변경없이 실행 내용과 리턴값을 다양화할 수 있다는 장점을 가진다.

// 인터페이스 이름은 첫글자를 대문자로 하고, 나머지는 소문자로 작성하는 것이 관례이다.

// 인터페이스는 상수 필드와 추상 메소드만을 구성멤버로 가진다.
// 인터페이스는 객체로 생성할 수 없기 때문에 생성자를 가질 수 없다.

// # 추상 메소드 선언
// 인터페이스를 통해 호출된 메소드는 최종적으로 객체에서 실행된다.
// 인터페이스에 선언된 추상 메소드는 모두 public abstract의 특성을 갖기 때문에
// public abstract를 생략하더라도 컴파일 과정에서 자동으로 붙게 된다.

interface RemoteControl
{
	public int MAX_VOLUME=10;
	public int MIN_VOLUME=0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}

// 주의!!!!) # public 접근 제한
// 구현 클래스에서 인터페이스의 추상 메소드에 대한 실체 메소드를 작성할 때 주의할 점은 인터페이스의 모든 메소드는
// 기본적으로 public 접근 제한을 갖기 때문에 public 보다 더 낮은 접근 제한으로 작성할 수 없다
// public을 생략하면 'Cannot reduce the visibility of the inherited method'라는 컴파일 에러를 만나게 된다.

class Television implements RemoteControl
{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>MAX_VOLUME)
			volume=MAX_VOLUME;
		else if(volume<MIN_VOLUME)
			volume=MIN_VOLUME;
		else
			this.volume=volume;
		
		System.out.println("현재 TV 볼륨 :"+this.volume);
	}
}

class Audio implements RemoteControl
{

	@Override
	public void turnOn() {
		
	}

	@Override
	public void turnOff() {
		
	}

	@Override
	public void setVolume(int volume) {
		
	}
}

public class srcC {

	public static void main(String[] args) {
		RemoteControl rc;
		
		rc=new Television();
		
		rc=new Audio();
	}

}
;