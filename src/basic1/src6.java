package basic1;

// # 싱글톤(Singleton)
// => 전체 프로그램에서 단 하나의 객체만 만들도록 보장해야하는 경우
//    1. 싱글톤을 만들려면 클래스 외부에서 new 연산자로 생성자를 호출할 수 없도록 막아야한다.
//    생성자를 외부에서 호출할 수 없도록 하려면 생성자 앞에서 private 접근 제한자를 붙여주면 된다.
//    2. 자신의 타입인 정적 필드를 하나 선언하고 자신의 객체를 생성해 초기화한다.
//    정적 필드도 private 접근 제한자를 붙여 외부에서 필드값을 변경하지 못하도록 막는다.
//    3. 대신 외부에서 호출할 수 있는 정적 메소드인 getInstance()를 선언하고 정적 필드에서
//	     참조하고 있는 자신의 객체를 리턴해준다.

// 외부에서 객체를 얻는 유일한 방법은 getInstance() 메소드를 호출하는 방법이다.
class Singleton
{
	private static Singleton singleton=new Singleton();
	
	private Singleton() {}
	
	static public Singleton getInstance()
	{
		return singleton;
	}
}

public class src6 {

	public static void main(String[] args) {

	}

}
