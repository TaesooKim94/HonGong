package basic1;

// # ���� ���ѱ��
// �޼ҵ� ���ο��� ���ܸ� ó���� �� ������, ��쿡 ���󼭴� �޼ҵ带 ȣ���� ������ ���ܸ� ���ѱ� ���� �ִ�.
// �̶� ����ϴ� Ű���尡 throws�̴�.
// throws Ű����� �޼ҵ� ����� ���� �ۼ��Ǿ� �޼ҵ忡�� ó������ ���� ���ܸ� ȣ���� ������ ���ѱ�� ������ �Ѵ�
// throws Ű���� �ڿ��� ���ѱ� ���� Ŭ������ ��ǥ�� �����ؼ� �������ָ� �ȴ�.

// throws Ű���尡 �پ� �ִ� �޼ҵ�� �ݵ�� try ��� ������ ȣ��Ǿ�� �Ѵ�.
// �׸��� catch ��Ͽ��� ���Ѱ� ���� ���ܸ� ó���ؾ� �Ѵ�.

// �ڹ� API ��ť��Ʈ�� ���� Ŭ���� �����ڿ� �޼ҵ� ����ο� throws Ű���尡 �پ� �ִ� ���� ���� �� �� �ִ�.
// �̷��� �����ڿ� �޼ҵ带 ����ϰ� �ʹٸ�, �ݵ�� try-catch ������� ���� ó���� �ؾ� �Ѵ�.
// �ƴϸ� throws�� �ٽ� ����ؼ� ���ܸ� ȣ���� ������ ���Ѱܾ� �Ѵ�.
// �׷��� ������ ������ ������ �߻��Ѵ�.

void method1()
{
	try
	{
		method2();
	}
	catch(ClassNotFoundException e)
	{
		System.out.println("Ŭ������ �������� �ʽ��ϴ�");
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
