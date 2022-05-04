package basic1;

// # �̱���(Singleton)
// => ��ü ���α׷����� �� �ϳ��� ��ü�� ���鵵�� �����ؾ��ϴ� ���
//    1. �̱����� ������� Ŭ���� �ܺο��� new �����ڷ� �����ڸ� ȣ���� �� ������ ���ƾ��Ѵ�.
//    �����ڸ� �ܺο��� ȣ���� �� ������ �Ϸ��� ������ �տ��� private ���� �����ڸ� �ٿ��ָ� �ȴ�.
//    2. �ڽ��� Ÿ���� ���� �ʵ带 �ϳ� �����ϰ� �ڽ��� ��ü�� ������ �ʱ�ȭ�Ѵ�.
//    ���� �ʵ嵵 private ���� �����ڸ� �ٿ� �ܺο��� �ʵ尪�� �������� ���ϵ��� ���´�.
//    3. ��� �ܺο��� ȣ���� �� �ִ� ���� �޼ҵ��� getInstance()�� �����ϰ� ���� �ʵ忡��
//	     �����ϰ� �ִ� �ڽ��� ��ü�� �������ش�.

// �ܺο��� ��ü�� ��� ������ ����� getInstance() �޼ҵ带 ȣ���ϴ� ����̴�.
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
