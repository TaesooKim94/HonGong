package basic1;

// �߿�!!!!)
// �������̽� A�� �������̽� B�� ��ü�� �޼ҵ带 ȣ���� �� �������� ��ü�� �� �� �������̽���
// ��� �����ؾ� �Ѵ�
// public class ����Ŭ�����̸� implements �������̽�A, �������̽�B{}

interface Searchable
{
	// �Ű������� ���ͳ� ������Ʈ �ּ�(URL)�� �޴´�
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
		System.out.println(url+"�� �˻��մϴ�");
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

// �߿�!!!!)===========================================================================================
// �������̽�(RemoteControl)�� �����ڵ�(MyClass)�� ������ü(Television,Audio) ���̿��� ���������� ����Ѵ�
// �����ڵ�� �������̽��� ����� �߻�޼ҵ�(turnOn())�� ȣ���ϰ� �������̽��� ������ü�� ������ �޼ҵ�(turnOn())�� ȣ���Ѵ�
// ===================================================================================================


public class srcD {

	public static void main(String[] args) {
		SmartTelevision tv=new SmartTelevision();
		
		RemoteControl rc=tv;
		Searchable searchable=tv;
		
		MyClass myClass=new MyClass();	
		myClass.rc.turnOn();	// Television�� turnOn()�� ����
		myClass.rc.turnOff();	// Television�� turnOff()�� ���� 
	}

}
