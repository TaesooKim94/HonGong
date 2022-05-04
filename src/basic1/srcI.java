package basic1;

// # ��ø �������̽�
// Ŭ������ ����� ����� �������̽�
// �������̽��� Ŭ���� ���ο� �����ϴ� ������ �ش� Ŭ������ ����� ���踦 �δ� ���� Ŭ������ ����� ���ؼ��̴�.
// ��ø �������̽��� �ν��Ͻ� ��� �������̽��� ���� ��� �������̽� ��� �����ϴ�

// �ν��Ͻ� ��� �������̽��� �ٱ� Ŭ������ ��ü�� �־�� ��� �����ϸ�,
// ���� ��� �������̽��� �ٱ� Ŭ������ ��ü ���� �ٱ� Ŭ���������� �ٷ� ������ �� �ִ�.
// �ַ� ���� ��� �������̽��� ���� ����ϴµ� UI ���α׷��ֿ��� �̺�Ʈ�� ó���� �������� ���� Ȱ��ȴ�.

// ex) Button�� Ŭ������ �� �̺�Ʈ�� ó���ϴ� ��ü�� �ް� �ʹٸ�
//     �ƹ� ��ü�� ������ �ȵǰ�, Button ���ο� ����� ��ø �������̽��� ������ ��ü�� �޾ƾ� �Ѵٸ�
//     ������ ���� Button Ŭ������ �����ϸ� �ȴ�

class Button
{
	OnClickListener listener;	// �������̽� Ÿ�� �ʵ�
	
	void setOnClickListener(OnClickListener listener)	// �Ű������� ������
	{
		this.listener=listener;
	}
	
	void touch()
	{
		listener.onClick();		//	���� ��ü�� onClick() �޼ҵ� ȣ��
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
		System.out.println("��ȭ�� �̴ϴ�");
	}
}

class MessageListener implements Button.OnClickListener
{
	@Override
	public void onClick()
	{
		System.out.println("�޽����� �����ϴ�");
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
