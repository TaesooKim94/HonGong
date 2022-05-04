package basic1;

import java.text.SimpleDateFormat;
import java.util.Date;

// # Wrapper(����) Ŭ����
// �ڹٴ� �⺻Ÿ��(byte,char,short,int,long,float,double,boolean)�� ���� ���� ��ü�� ������ �� �ִ�
// �⺻Ÿ���� ���� ���ο��� ������
// ���� ��ü�� Ư¡�� �����ϰ� �ִ� �⺻ Ÿ�� ���� �ܺο��� ������ �� ����.
// ���� ������ ���� �����ϰ� �ʹٸ� ���ο� ���� ��ü�� ������ �Ѵ�.
// �߿�!!!)
// ���� ��ü�� �ַ� �÷��� �����ӿ�ũ���� �⺻ Ÿ�� ���� ��ü�� �����ؼ� ������ �� ���ȴ�.

// 1.�ڽ�(Boxing): �⺻ Ÿ���� ���� ���� ��ü�� ����� ����
// 2.��ڽ�(Unboxing): ���尴ü���� �⺻ Ÿ���� ���� ���� ����
// ex)
// Byte obj=new Byte(10);
// Character obj=new Character('��');
// Short obj=new Short(100);
// Boolean obj=new Boolean(true);
// �����ڸ� ������� �ʾƵ� �� ���� Ŭ�������� ������ �ִ� ���� valueOf() �޼ҵ带 ����� ���� �ִ�.
// Integer obj=Integer.valueOf(1000);
// Integer obj=Integer.valueOf("1000");

// #���尴ü���� �ٽ� �⺻Ÿ���� ���� ���� ���(��ڽ�)
// byte num=obj.byteValue();
// char num=obj.charValue();
// short num=obj.shortValue();

public class srcU {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		System.out.println(sdf.format(date));
	}

}
