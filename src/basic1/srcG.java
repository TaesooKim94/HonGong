package basic1;

// # 중첩 클래스와 중첩 인터페이스 
// => 클래스가 여러 클래스와 관계를 맺는 경우에는 독립적으로 선언하는 것이 좋으나
//    특정 클래스와 관계를 맺을 경우에는 클래스 내부에 선언하는 것이 좋다.

// # 중첩 클래스
// => 클래스 내부에 선언한 클래스
//    중첩 클래스를 사용하면 두 클래스의 멤버들을 서로 쉽게 접근할 수 있고, 
//    외부에는 불필요한 관계 클래스를 감춤으로써 코드의 복잡성을 줄일 수 있다
// 1. 멤버 클래스 => 클래스의 멤버로서 선언되는 중첩 클래스
// 2. 로컬 클래스 => 생성자 또는 메소드 내부에서 선언되는 중첩 클래스
// 멤버 클래스는 클래스나 객체가 사용 중이라면 언제든지 재사용이 가능하지만,
// 로컬 클래스는 메소드를 실행할 때만 사용되고 메소드가 종료되면 없어진다.

// 중첩 클래스도 하나의 클래스이기 때문에 컴파일하면 바이트 코드 파일(.class)이 별도로 생성된다.
// 멤버 클래스일 경우 바이트 코드파일의 이름은 A$B.class (A=바깥클래스, B=멤버클래스)
// 로컬 클래스일 경우                    A$1B.class (A=바깥클래스, B=로컬클래스)

class ClassName
{
	class NestedClassName
	{
		
	}
}

// 인터페이스도 클래스 내부에 선언할 수 있는데, 이런 인터페이스를 중첩 인터페이스라 한다.
// => 인터페이스를 클래스 내부에 선언하는 이유는 해당 클래스와 긴밀한 관계를 맺는 구현 클래스를 만들기 위해서이다.

class ClassName2
{
	interface NestedInterfaceName
	{
		
	}
}

// 1.인스턴스 멤버 클래스
//=> static 키워드 없이 중첩 선언된 클래스
// 인스턴스 멤버 클래스는 인스턴스 필드와 메소드만 선언이 가능하고, 정적 필드와 메소드는 선언할 수 없다.

class A
{
	class B
	{
		B(){}
		int field1;
		// static int field2(){}
		void method1() {}
		// static void method2();{}
	}

	void methodA()
	{
		B b=new B();
		b.field1=3;
		b.method1();
	}
}

// A클래스 외부에서 B객체를 생성하려면 먼저 A 객체를 생성하고 B 객체를 생성해야 한다.
// A클래스 내부의 생성자 및 인스턴스 메소드는 일반 클래스처럼 B객체를 생성할 수 있다.

// 일반적으로 A 클래스 외부에서 B 객체를 생성하는 일은 거의 없다.
// 대부분 A 클래스 내부에서 B 객체를 생성해서 사용한다.

// 2. 정적 멤버 클래스
class AA{
	static class BB{
		BB(){}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	// 3. 로컬 클래스
	// 로컬 클래스는 접근제한자(public,private) 및 static을 붙일 수 없다.
	// 로컬 클래스는 메소드 내부에서만 사용되므로 접근을 제한할 필요가 없기 때문이다.
	// 로컬 클래스 내부에는 인스턴스 필드와 메소드만 선언할 수 있고 정적 필드와 메소드는 선언할 수 없다.
	// 로컬 클래스는 메소드가 실행될 때 메소드 내에서 객체를 생성하고 사용해야 한다.
	// 주로 비동기 처리를 위해 스레드 객체를 만들때 사용한다.
	//void method()
	//{
	//		class DownloadThread extends Thread{}
	//		DownloadThread thread=new DownloadThread();
	//		thread.start();
	//}
	void method()
	{
		class D
		{
			D(){}
			int field1;
			// static int field2;
			void method1() {}
			// static void method2(){}
		}
		
		D d=new D();
		d.field1=3;
		d.method1();
	}
}

public class srcG {

	public static void main(String[] args) {
		// 1.인스턴스 멤버 클래스
		A a=new A();
		A.B b=a.new B();
		b.field1=3;
		b.method1();
		
		AA aa=new AA();
		// 2. 정적 멤버 클래스
		AA.BB bb=new AA.BB();
		bb.field1=3;
		bb.method1();	
		AA.BB.field2=3;	// 정적 필드 사용
		AA.BB.method2(); // 정적 메소드 호출
		
		// 3. 로컬 클래스
		aa.method();
	}

}
