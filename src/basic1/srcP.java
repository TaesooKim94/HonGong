package basic1;

import java.util.Date;

// # ��ü ���� ����(toString())
// Object Ŭ������ toString() �޼ҵ�� ��ü�� ���� ������ �����Ѵ�
// ��ü�� ���� ������ ��ü�� ���ڿ��� ǥ���� ���̴�.
// �⺻������  Object Ŭ������ toString() �޼ҵ�� 'Ŭ�����̸�@16�����ؽ��ڵ�'�� ������ ���� ������ �����Ѵ�.

// Object�� toString() �޼ҵ��� ���ϰ��� �� ����ġ�� ���� �����̹Ƿ�
// Object ���� Ŭ������ toString() �޼ҵ带 ������(�������̵�)�Ͽ� �����ϰ� ������ ������ �����ϵ��� �Ǿ� �ִ�.
// ex) java.util ��Ű���� Date Ŭ������ toString() �޼ҵ带 �������Ͽ� ���� �ý����� ��¥�� �ð� ������ �����Ѵ�.
//     �׸��� 
//     String Ŭ������ toString() �޼ҵ带 �������ؼ� �����ϰ� �ִ� ���ڿ��� �����Ѵ�.

class Member
{
	String id;
	
	Member(String id)
	{
		this.id=id;
	}

	// id�� ������ ���ڿ��� ��� ���� �ؽ� �ڵ带 ����
	@Override
	public int hashCode() {
		// id �ʵ尪�� ���� ��� ���� �ؽ��ڵ带 �����ϵ��� �ϱ� ���� String�� hashCode() �޼ҵ��� ���ϰ��� Ȱ���Ѵ�.
		// String�� hashCode()�� ���� ���ڿ��� ��� ������ �ؽ��ڵ带 �����Ѵ�.
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member)
		{
			Member member=(Member)obj;
			
			if(this.id.equals(member.id))
				return true;
		}
		
		return false;
	}
}
public class srcP {

	public static void main(String[] args) {
		Object obj1=new Object();
		Date obj2=new Date();
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj2);
	}

}
