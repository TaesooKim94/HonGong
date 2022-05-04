package basic1;

// # 예외 떠넘기기
// 메소드 내부에서 예외를 처리할 수 있지만, 경우에 따라서는 메소드를 호출한 곳으로 예외를 떠넘길 수도 있다.
// 이때 사용하는 키워드가 throws이다.
// throws 키워드는 메소드 선언부 끝에 작성되어 메소드에서 처리하지 않은 예외를 호출한 곳으로 떠넘기는 역할을 한다
// throws 키워드 뒤에는 떠넘길 예외 클래스를 쉼표로 구분해서 나열해주면 된다.

// throws 키워드가 붙어 있는 메소드는 반드시 try 블록 내에서 호출되어야 한다.
// 그리고 catch 블록에서 떠넘겨 받은 예외를 처리해야 한다.

// 자바 API 도큐먼트를 보면 클래스 생성자와 메소드 선언부에 throws 키워드가 붙어 있는 것을 흔히 볼 수 있다.
// 이러한 생성자와 메소드를 사용하고 싶다면, 반드시 try-catch 블록으로 예외 처리를 해야 한다.
// 아니면 throws를 다시 사용해서 예외를 호출한 곳으로 떠넘겨야 한다.
// 그렇지 않으면 컴파일 에러가 발생한다.

void method1()
{
	try
	{
		method2();
	}
	catch(ClassNotFoundException e)
	{
		System.out.println("클래스가 존재하지 않습니다");
	}
}

void method2() throws ClassNotFoundException
{
	Class clazz=Class.forName("java.lang.String2");
}

public class srcM {

	public static void main(String[] args) {

	}

}
