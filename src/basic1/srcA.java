package basic1;

// # ���� Ÿ�� ��ȯ
// => �θ� Ÿ���� �ڽ� Ÿ������ ��ȯ�ϴ� ��
//    �׷��ٰ� �ؼ� ��� �θ� Ÿ���� �ڽ� Ÿ������ ���� ��ȯ�� �� �ִ� ���� �ƴϴ�.
//    �ڽ� Ÿ���� �θ� Ÿ������ �ڵ� Ÿ�� ��ȯ�� �� �ٽ� �ڽ� Ÿ������ ��ȯ�Ҷ� ���� Ÿ�� ��ȯ�� ����Ѵ�
// ex) �ڽ�Ÿ�� ���� = (�ڽ�Ÿ��) �θ�Ÿ��;
// Parent parent = new Child();
// Child child = (Child)parent;

// �ڽ� Ÿ���� �θ� Ÿ������ �ڵ� Ÿ�� ��ȯ�ϸ�, �θ� ����� �ʵ�� �޼ҵ常 ��� �����ϴٴ� ���� ������ ������
// ���� �ڽĿ� ����� �ʵ�� �޼ҵ带 �� ����ؾ� �Ѵٸ� ���� Ÿ�� ��ȯ�� �ؼ� �ٽ� �ڽ� Ÿ������ ��ȯ�� ����
// �ڽ��� �ʵ�� �޼ҵ带 ����ϸ� �ȴ�.

// # ��ü Ÿ�� Ȯ��
// �θ� ������ �����ϴ� ��ü�� �θ� ��ü���� �ڽ� ��ü���� Ȯ���ϴ� ���
// => instanceof ������

class Parent{}
class Child extends Parent
{
	public void method(Parent parent)
	{
		if(parent instanceof Child)
		{
			Child child=(Child)parent;
		}
	}
}

public class srcA {

	public static void main(String[] args) {

	}

}
