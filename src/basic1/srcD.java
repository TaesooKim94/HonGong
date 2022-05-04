package basic1;

// 중요!!!!)
// 인터페이스 A와 인터페이스 B가 객체의 메소드를 호출할 수 있으려면 객체는 이 두 인터페이스를
// 모두 구현해야 한다
// public class 구현클래스이름 implements 인터페이스A, 인터페이스B{}

interface Searchable
{
	// 매개값으로 인터넷 웹사이트 주소(URL)를 받는다
	void search(String url);
}

class SmartTelevision implements RemoteControl, Searchable
{

	private int volume;

	@Override
	public void turnOn() {
		
	}

	@Override
	public void turnOff() {
		
	}

	@Override
	public void setVolume(int volume) {
		
	}
	
	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다");
	}
}

class MyClass
{
	RemoteControl rc=new Television();
	
	MyClass(){}
	
	MyClass(RemoteControl rc)
	{
		this.rc=rc;
	}
	
	void methodA(RemoteControl rc)
	{
		
	}
}

// 중요!!!!)===========================================================================================
// 인터페이스(RemoteControl)는 개발코드(MyClass)와 구현객체(Television,Audio) 사이에서 접점역할을 담당한다
// 개발코드는 인터페이스에 선언된 추상메소드(turnOn())를 호출하고 인터페이스는 구현객체의 재정의 메소드(turnOn())를 호출한다
// ===================================================================================================


public class srcD {

	public static void main(String[] args) {
		SmartTelevision tv=new SmartTelevision();
		
		RemoteControl rc=tv;
		Searchable searchable=tv;
		
		MyClass myClass=new MyClass();	
		myClass.rc.turnOn();	// Television의 turnOn()이 실행
		myClass.rc.turnOff();	// Television의 turnOff()가 실행 
	}

}
