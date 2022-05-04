package basic1;

// �������� �����ϱ� ���ؼ��� �޼ҵ� �����ǿ� Ÿ�Ժ�ȯ�� �ʿ��ϴ�
// �������̽� ���� �� 2���� ����� �����ǹǷ� ��Ӱ� ���Ҿ� �������� �����ϴµ� ���� ���ȴ�.

// 1. ��� => ���� ������ ���� Ŭ������ ����� ���
// 2. �������̽� => ������� ������ Ŭ������ ����� ���
// �Ѵ� �������� �����ϴ� ����� ����ϴ�.

// ���α׷��� ������ �� �������̽��� ����ؼ� �޼ҵ带 ȣ���ϵ��� �ڵ��ߴٸ�, ���� ��ü��
// �ſ� �ս��� ������ ��ü�� �� �ִ�.
// ���α׷� �ҽ��ڵ�� ������ ���µ�, ���� ��ü�� ��ü�����ν� ���α׷��� �������� �پ�������.
// �̰��� �������̽��� �������̴�.

// �������̽� ���� Ŭ������ ����ؼ� �ڽ� Ŭ������ ������ٸ� �ڽ� ��ü ����
// �������̽� Ÿ������ �ڵ� Ÿ�� ��ȯ�� �� �ִ�.

// # �Ű������� ������
// �ڵ� Ÿ�� ��ȯ�� �ʵ��� ���� ������ ������ �߻�������, �ַ� �޼ҵ带 ȣ���� ��
// ���� �߻��Ѵ�.
// �Ű����� �پ�ȭ�ϱ� ���ؼ� ��ӿ����� �Ű� ������ �θ� Ÿ������ �����ϰ� ȣ���Ҷ����� �ڽ� ��ü�� �����Ѵ�

// �Ű� ������ Ÿ���� �������̽��� ��� ��� ���� ��ü�� �Ű������� ����� �� �ְ�,
// � ���� ��ü�� �����Ǵ��Ŀ� ���� �޼ҵ��� �������� �پ����� �� �ִ�.
// �̰��� �������̽� �Ű� ������ �������̴�.

// �������̽��� �޼ҵ��� �Ű������� ���� �����Ѵ�
// �������̽� Ÿ������ �Ű� ������ �����ϸ� �޼ҵ� ȣ�� �� �Ű������� ���� ���� ������ ���� ��ü�� �� �� 
// �ֱ� ������ �޼ҵ� �������� �پ��ϰ� ���´�.
interface Tire
{
	void roll();
}

class HankookTire implements Tire
{

	@Override
	public void roll() {
		System.out.println("�ѱ� Ÿ�̾ �������ϴ�");
	}
}

class KumhoTire implements Tire
{

	@Override
	public void roll() {
		System.out.println("��ȣ Ÿ�̾ �������ϴ�");
	}
	
}

class Car
{
	Tire frontLeftTire=new HankookTire();
	Tire frontRightTire=new HankookTire();
	Tire backLeftTire=new HankookTire();
	Tire backRightTire=new HankookTire();
	
	void run()
	{
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}

public class srcE {

	public static void main(String[] args) {
		Car myCar=new Car();
		myCar.run();
		
		myCar.frontLeftTire=new KumhoTire();
		myCar.frontRightTire=new KumhoTire();
		
		myCar.run();
	}

}
