package basic1;

// # ��ø Ŭ������ ��ø �������̽� 
// => Ŭ������ ���� Ŭ������ ���踦 �δ� ��쿡�� ���������� �����ϴ� ���� ������
//    Ư�� Ŭ������ ���踦 ���� ��쿡�� Ŭ���� ���ο� �����ϴ� ���� ����.

// # ��ø Ŭ����
// => Ŭ���� ���ο� ������ Ŭ����
//    ��ø Ŭ������ ����ϸ� �� Ŭ������ ������� ���� ���� ������ �� �ְ�, 
//    �ܺο��� ���ʿ��� ���� Ŭ������ �������ν� �ڵ��� ���⼺�� ���� �� �ִ�
// 1. ��� Ŭ���� => Ŭ������ ����μ� ����Ǵ� ��ø Ŭ����
// 2. ���� Ŭ���� => ������ �Ǵ� �޼ҵ� ���ο��� ����Ǵ� ��ø Ŭ����
// ��� Ŭ������ Ŭ������ ��ü�� ��� ���̶�� �������� ������ ����������,
// ���� Ŭ������ �޼ҵ带 ������ ���� ���ǰ� �޼ҵ尡 ����Ǹ� ��������.

// ��ø Ŭ������ �ϳ��� Ŭ�����̱� ������ �������ϸ� ����Ʈ �ڵ� ����(.class)�� ������ �����ȴ�.
// ��� Ŭ������ ��� ����Ʈ �ڵ������� �̸��� A$B.class (A=�ٱ�Ŭ����, B=���Ŭ����)
// ���� Ŭ������ ���                    A$1B.class (A=�ٱ�Ŭ����, B=����Ŭ����)

class ClassName
{
	class NestedClassName
	{
		
	}
}

// �������̽��� Ŭ���� ���ο� ������ �� �ִµ�, �̷� �������̽��� ��ø �������̽��� �Ѵ�.
// => �������̽��� Ŭ���� ���ο� �����ϴ� ������ �ش� Ŭ������ ����� ���踦 �δ� ���� Ŭ������ ����� ���ؼ��̴�.

class ClassName2
{
	interface NestedInterfaceName
	{
		
	}
}

// 1.�ν��Ͻ� ��� Ŭ����
//=> static Ű���� ���� ��ø ����� Ŭ����
// �ν��Ͻ� ��� Ŭ������ �ν��Ͻ� �ʵ�� �޼ҵ常 ������ �����ϰ�, ���� �ʵ�� �޼ҵ�� ������ �� ����.

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

// AŬ���� �ܺο��� B��ü�� �����Ϸ��� ���� A ��ü�� �����ϰ� B ��ü�� �����ؾ� �Ѵ�.
// AŬ���� ������ ������ �� �ν��Ͻ� �޼ҵ�� �Ϲ� Ŭ����ó�� B��ü�� ������ �� �ִ�.

// �Ϲ������� A Ŭ���� �ܺο��� B ��ü�� �����ϴ� ���� ���� ����.
// ��κ� A Ŭ���� ���ο��� B ��ü�� �����ؼ� ����Ѵ�.

// 2. ���� ��� Ŭ����
class AA{
	static class BB{
		BB(){}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	// 3. ���� Ŭ����
	// ���� Ŭ������ ����������(public,private) �� static�� ���� �� ����.
	// ���� Ŭ������ �޼ҵ� ���ο����� ���ǹǷ� ������ ������ �ʿ䰡 ���� �����̴�.
	// ���� Ŭ���� ���ο��� �ν��Ͻ� �ʵ�� �޼ҵ常 ������ �� �ְ� ���� �ʵ�� �޼ҵ�� ������ �� ����.
	// ���� Ŭ������ �޼ҵ尡 ����� �� �޼ҵ� ������ ��ü�� �����ϰ� ����ؾ� �Ѵ�.
	// �ַ� �񵿱� ó���� ���� ������ ��ü�� ���鶧 ����Ѵ�.
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
		// 1.�ν��Ͻ� ��� Ŭ����
		A a=new A();
		A.B b=a.new B();
		b.field1=3;
		b.method1();
		
		AA aa=new AA();
		// 2. ���� ��� Ŭ����
		AA.BB bb=new AA.BB();
		bb.field1=3;
		bb.method1();	
		AA.BB.field2=3;	// ���� �ʵ� ���
		AA.BB.method2(); // ���� �޼ҵ� ȣ��
		
		// 3. ���� Ŭ����
		aa.method();
	}

}