package basic1;

// # 중첩 인터페이스
// 클래스의 멤버로 선언된 인터페이스
// 인터페이스를 클래스 내부에 선언하는 이유는 해당 클래스와 긴밀한 관계를 맺는 구현 클래스를 만들기 위해서이다.
// 중첩 인터페이스는 인스턴스 멤버 인터페이스와 정적 멤버 인터페이스 모두 가능하다

// 인스턴스 멤버 인터페이스는 바깥 클래스의 객체가 있어야 사용 가능하며,
// 정적 멤버 인터페이스는 바깥 클래스의 객체 없이 바깥 클래스만으로 바로 접근할 수 있다.
// 주로 정적 멤버 인터페이스를 많이 사용하는데 UI 프로그래밍에서 이벤트를 처리할 목적으로 많이 활용된다.

// ex) Button을 클릭했을 때 이벤트를 처리하는 객체를 받고 싶다면
//     아무 객체나 받으면 안되고, Button 내부에 선언된 중첩 인터페이스를 구현한 객체만 받아야 한다면
//     다음과 같이 Button 클래스를 선언하면 된다

class Button
{
	OnClickListener listener;	// 인터페이스 타입 필드
	
	void setOnClickListener(OnClickListener listener)	// 매개변수의 다형성
	{
		this.listener=listener;
	}
	
	void touch()
	{
		listener.onClick();		//	구현 객체의 onClick() 메소드 호출
	}
	
	static interface OnClickListener
	{
		void onClick();
	}
}

class CallListener implements Button.OnClickListener
{
	@Override
	public void onClick()
	{
		System.out.println("전화를 겁니다");
	}
}

class MessageListener implements Button.OnClickListener
{
	@Override
	public void onClick()
	{
		System.out.println("메시지를 보냅니다");
	}
}

public class srcI {

	public static void main(String[] args) {
		Button btn=new Button();
		
		btn.setOnClickListener(new CallListener());	
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}

}
