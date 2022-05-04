package basic1;

// # �������̽�
// => ��ü�� ������� ������ Ÿ��
//    �������̽��� ���� �پ��� ��ü�� ������ ��������� �̿��� �� �ִ�.
// �������̽��� �����ڵ�� ��ü�� ���� ����ϴ� ���������� �Ѵ�.
// �����ڵ尡 �������̽��� �޼ҵ带 ȣ���ϸ� �������̽��� ��ü�� �޼ҵ带 ȣ���Ų��.
// �׷��� ������ �����ڵ�� ��ü�� ���α����� �� �ʿ䰡 ���� �������̽��� �޼ҵ常 �˰� ������ �ȴ�.

// ���⼭ ���� �ڵ尡 ���� ��ü�� �޼ҵ带 ȣ���ϸ� �����ѵ� �� �߰��� �������̽��� �δ��� �ǹ����� �����
// �� ������ ���� �ڵ带 �������� �ʰ� ����ϴ� ��ü�� ������ �� �ֵ��� �ϱ� ���ؼ��̴�.
// �������̽��� �ϳ��� ��ü�� �ƴ϶� ���� ��ü��� ����� �����ϹǷ� � ��ü�� ����ϴ��Ŀ� ����
// ���� ����� ���ϰ��� �ٸ� �� �ִ�.
// ���� ���� �ڵ� ���鿡���� �ڵ� ������� ���� ����� ���ϰ��� �پ�ȭ�� �� �ִٴ� ������ ������.

// �������̽� �̸��� ù���ڸ� �빮�ڷ� �ϰ�, �������� �ҹ��ڷ� �ۼ��ϴ� ���� �����̴�.

// �������̽��� ��� �ʵ�� �߻� �޼ҵ常�� ��������� ������.
// �������̽��� ��ü�� ������ �� ���� ������ �����ڸ� ���� �� ����.

// # �߻� �޼ҵ� ����
// �������̽��� ���� ȣ��� �޼ҵ�� ���������� ��ü���� ����ȴ�.
// �������̽��� ����� �߻� �޼ҵ�� ��� public abstract�� Ư���� ���� ������
// public abstract�� �����ϴ��� ������ �������� �ڵ����� �ٰ� �ȴ�.

interface RemoteControl
{
	public int MAX_VOLUME=10;
	public int MIN_VOLUME=0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}

// ����!!!!) # public ���� ����
// ���� Ŭ�������� �������̽��� �߻� �޼ҵ忡 ���� ��ü �޼ҵ带 �ۼ��� �� ������ ���� �������̽��� ��� �޼ҵ��
// �⺻������ public ���� ������ ���� ������ public ���� �� ���� ���� �������� �ۼ��� �� ����
// public�� �����ϸ� 'Cannot reduce the visibility of the inherited method'��� ������ ������ ������ �ȴ�.

class Television implements RemoteControl
{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>MAX_VOLUME)
			volume=MAX_VOLUME;
		else if(volume<MIN_VOLUME)
			volume=MIN_VOLUME;
		else
			this.volume=volume;
		
		System.out.println("���� TV ���� :"+this.volume);
	}
}

class Audio implements RemoteControl
{

	@Override
	public void turnOn() {
		
	}

	@Override
	public void turnOff() {
		
	}

	@Override
	public void setVolume(int volume) {
		
	}
}

public class srcC {

	public static void main(String[] args) {
		RemoteControl rc;
		
		rc=new Television();
		
		rc=new Audio();
	}

}
;