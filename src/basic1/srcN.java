package basic1;

// # �⺻ API Ŭ����
// # java.lang ��Ű��
// => �ڹ� ���α׷��� �⺻���� Ŭ������ ��� �ִ� ��Ű��
//    �׷��� java.lang ��Ű���� �ִ� Ŭ������ �������̽��� import���� ����� �� �ִ�.
//    �׵��� ����� String�� System Ŭ������ java.lang ��Ű���� ���ԵǾ� �ֱ� ������ import���� �ʰ� ����ߴ�.
// 1. Object Ŭ���� => �ڹ� Ŭ������ �ֻ��� Ŭ����
// 2. System Ŭ���� => ǥ�� �Է�,���
// 3. Class Ŭ���� => Ŭ������ �޸𸮷� �ε��� �� ���
// 4. String Ŭ���� => ���ڿ��� �����ϰ� �������� ������ ������
// 5. Wrapper Ŭ���� => �⺻ Ÿ���� �����͸� ���� ��ü�� ���鶧 ���
// 6. Math Ŭ���� => ���� �Լ��� �̿��� �� ���

// API�� ���̺귯�� ��� �θ��⵵ �ϴµ�, ���α׷� ���߿� ���� ���Ǵ� Ŭ���� �� �������̽��� ������ ���ϴ� ��

// equals() �޼ҵ��� �Ű� Ÿ���� Object�ε�, �̰��� ��� ��ü�� �Ű����� ���Ե� �� ������ ���ϳ�
// �ֳ��ϸ� ��� ��ü�� Object Ÿ������ �ڵ� Ÿ�� ��ȯ�� �� �ֱ� �����̴�.
// �ڹٿ����� �� ��ü�� ���� ���Ҷ� equals() �޼ҵ带 ���� ����Ѵ�.
// equals() �޼ҵ�� �� ��ü�� ���ؼ� �������� �����ϸ� true�� �����ϰ�, �׷��� ������ false�� �����Ѵ�.
// �������� �����ϴٴ� ���� ���� ��ü�̰� �ٸ� ��ü�̰� ������� ��ü�� �����ϰ� �ִ� �����Ͱ� �������� ���Ѵ�.

// �Ϲ������� Object�� equals() �޼ҵ�� ���� ������ �ʰ� ���� Ŭ�������� �������Ͽ� �������� ���� ���Ҷ� �̿�ȴ�.

class Member
{
	public String id;
	
	Member(String id)
	{
		this.id=id;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Member)
		{
			Member member=(Member)obj;
			if(id.equals(member.id))
				return true;
		}
		
		return false;
	}
}

public class srcN {

	public static void main(String[] args) {
		Member obj1=new Member("blue");
		Member obj2=new Member("blue");
		Member obj3=new Member("red");
		
		if(obj1.equals(obj2))
		{
			System.out.println("obj1�� obj2�� �����ϴ�");
		}
		else
		{
			System.out.println("obj1�� obj2�� �������� �ʴ�.");
		}
		
		if(obj1.equals(obj3))
		{
			System.out.println("obj1�� obj3�� �����ϴ�");
		}
		else
		{
			System.out.println("obj1�� obj3�� �������� �ʴ�");
		}
	}

}
 