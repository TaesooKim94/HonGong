package basic1;

import java.util.HashMap;

// �߿�!!!!)
// hashCode()���� ����, equals()�� true�̾�� ������ ��ü�� �Ǵܵȴ�.

// # ��ü �ؽ��ڵ� hashCode()
// => ��ü�� �ĺ��ϴ� �ϳ��� ������
// Object Ŭ������ hashCode() �޼ҵ�� ��ü�� �޸� ������ �̿��ؼ� �ؽ��ڵ带 ����� �����ϱ� ������
// ��ü���� �ٸ� ���� ������ �ִ�.
// ���� ���� �񱳽� hashCode()�� �������̵��� �ʿ䰡 �ִµ�
// 13�忡�� ��� �÷��� �����ӿ�ũ���� HashSet, HashMap, Hashtable�� ������ ���� ������� �� ��ü�� �������� ���Ѵ�.

// �켱 hashCode() �޼ҵ带 �����ؼ� ���ϵ� �ؽ��ڵ� ���� �������� ����.
// �ؽ��ڵ� ���� �ٸ��� �ٸ� ��ü�� �Ǵ��ϰ�, �ؽ��ڵ� ���� ������ equals() �޼ҵ�� �ٽ� ���Ѵ�.
// �׷��� ������ hashCode() �޼ҵ尡 true�� ���͵� equals()�� ���ϰ��� �ٸ��� �ٸ� ��ü�� �ȴ�.

class Key
{
	public int number;
	
	Key(int number)
	{
		this.number=number;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Key)
		{
			Key key=(Key)obj;
			
			if(number==key.number)
				return true;
		}
		
		return false;
	}

	// hashCode()�� ���ϰ��� number �ʵ尪���� �߱� ������ ������ ���� new Key(1)�� 
	// ���� ���� new Key(1)�� ���� �ؽ��ڵ尡 ���ϵȴ�.
	// ������ ���� new Key(1)�� ���� ���� new Key(1)�� ��� ���� �ٸ� ��ü������ HashMap��
	// hashCode()�� ���ϰ��� ����, equals()�� ���ϰ��� true�� �Ǳ� ������ ������ ��ü�� ���Ѵ�
	// ��, ���� �ĺ�Ű�� �ν��Ѵٴ� ���̴�.
	
	// ��������� ��ü�� ���� �񱳸� ���ؼ���
	// Object�� equals() �޼ҵ常 ���������� ���� hashCode() �޼ҵ嵵 �������ؼ� ��������
	// ������ ��ü�� ��� ������ �ؽ��ڵ尡 ���ϵǵ��� �ؾ� �Ѵ�.
	@Override
	public int hashCode() {
		return number;
	}
	
	
}
public class srcO {

	public static void main(String[] args) {
		
		// Key ��ü�� �ĺ�Ű�� ����ؼ� String���� �����ϴ� HashMap ��ü ����
		HashMap<Key,String> hashMap=new HashMap<Key,String>();
		
		// �ĺ�Ű new Key(1)�� "ȫ�浿"�� ������
		hashMap.put(new Key(1), "ȫ�浿");
		
		// �ĺ�Ű new Key(1)�� "ȫ�浿"�� �о��
		String value=hashMap.get(new Key(1));
		
		System.out.println(value);
	}
}
