package basic1;

// ���� equals()�� Object Ŭ������ ���� �� �޼ҵ�������,
// String Ŭ������ �������ؼ� ���ڿ��� ���ϵ��� �����ߴ�.

// �ſ� �߿�!!!!!!!!)
// String ��ü�� ���ڿ��� ������ �Ұ����� Ư���� ���� �ֱ� ������
// repalce()�޼ҵ尡 �����ϴ� ���ڿ��� ���� ���ڿ��� �������� �ƴ϶� ������ ���ο� ���ڿ��̴�.
// ex) String oldStr="�ڹ� ���α׷���";
//	   String newStr=oldStr.replace("�ڹ�","java");

// String original="Java Programming";
// String lowerCase=original.toLowerCase();
// String upperCase=original.toUpperCase();


public class srcT {

	public static void main(String[] args) {
		String ssn="010624-1230123";
		
		char sex=ssn.charAt(7);
		
		switch(sex)
		{
		case '1':
		case '3':
			System.out.println("�����Դϴ�");
			break;
		case '2':
		case '4':
			System.out.println("�����Դϴ�");
			break;
		}
		
		String strVar1=new String("�Ź�ö");
		String strVar2="�Ź�ö";
		
		if(strVar1==strVar2)
		{
			System.out.println("���� String ��ü�� ����");
		}
		else
			System.out.println("�ٸ� String ��ü�� ����");
		
		if(strVar1.equals(strVar2))
			System.out.println("���� ���ڿ��� ����");
		else
			System.out.println("�ٸ� ���ڿ��� ����");
	}
	

}
