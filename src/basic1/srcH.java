package basic1;

// # ��ø Ŭ������ ���� ����
// ��� Ŭ���� ���ο��� �ٱ� Ŭ������ �ʵ�� �޼ҵ忡 ������ ���� ������ ������.
// ���� �޼ҵ��� �Ű� ������ ���� ������ ���� Ŭ�������� ����� ���� ������ ������.

// 1.�ν��Ͻ� ��� Ŭ���� => �ٱ� Ŭ������ �ν��Ͻ� �ʵ��� �ʱⰪ�̳� �ν��Ͻ� �޼ҵ忡�� ��ü�� ������ �� ������,
//					  ���� �ʵ��� �ʱⰪ�̳� ���� �޼ҵ忡���� ��ü�� ������ �� ����
// �ݸ鿡
// 2.���� ��� Ŭ���� => ��� �ʵ��� �ʱⰪ�̳� ��� �޼ҵ忡�� ��ü�� ������ �� �ִ�.

// 1.�ν��Ͻ� ��� Ŭ���� �ȿ����� �ٱ� Ŭ������ ��� �ʵ�� ��� �޼ҵ忡 ������ �� ������
// 2.���� ��� Ŭ���� �ȿ����� �ٱ� Ŭ������ �����ʵ�� �޼ҵ忡�� ������ �� �ְ�, �ν��Ͻ� �ʵ�� �޼ҵ忡�� ������ �� ����.

// # ��ø Ŭ�������� �ٱ� Ŭ���� ���� ���
// Ŭ���� ���ο��� this�� ��ü �ڽ��� �����̴�
// ��ø Ŭ�������� this Ű���带 ����ϸ� �ٱ� Ŭ������ ��ü ������ �ƴ϶�, ��ø Ŭ������ ��ü ������ �ȴ�
// ��ø Ŭ���� ���ο��� �ٱ� Ŭ������ ��ü ������ �������� �ٱ� Ŭ������ �̸��� this �տ� �ٿ��ش�
// ex) �ٱ�Ŭ����.this.�ʵ�     �ٱ�Ŭ����.this.�޼ҵ�()

class Outter
{
	String field="Outter-field";
	
	void method()
	{
		System.out.println("Outter-method");
	}
	
	class Nested
	{
		String field="Nested-field";;
		void method()
		{
			System.out.println("Nested-method");
		}
		
		void print()
		{
			System.out.println(this.field);
			this.method();
			
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
public class srcH {

	public static void main(String[] args) {
		Outter outter=new Outter();
		Outter.Nested nested=outter.new Nested();
		nested.print();
	}

}
