package basic1;

import java.io.IOException;
// Scanner�� java.util ��Ű���� �ִٴ� ���� �����Ϸ����� �˷��ִ� ����
import java.util.Scanner;

public class src1 {

	public static void main(String[] args) throws IOException{
		// ���ڿ��� �⺻ Ÿ������ ���� Ÿ�� ��ȯ
		String str="10";
		byte value=Byte.parseByte(str);
		
		String str1="200";
		short value1=Short.parseShort(str1);
		
		String str2="30000";
		int value2=Integer.parseInt(str2);
		
		String str3="true";
		boolean value3=Boolean.parseBoolean(str3);
		
		// ���ڿ��� ���ڰ� �ƴ� ���ĺ��̳� Ư�� ����, �ѱ� ���� �����ϰ� ���� ��� ���� Ÿ������
		// ��ȯ�� �õ��ϸ� ���� ���� ����(NumberFormatException)�� �߻�
		// String str="1a";
		// int value=Integer.parseInt(str);	=> NumberFormatException �߻�
		
		
		// �ݴ�� �⺻Ÿ��(byte, short, char, int ....)�� ���� ���ڿ��� �����ϴ� ���
		// String.valueOf() �޼ҵ带 �̿�
		
		String str4=String.valueOf(3);
		
		//----------------------------------------------------------------------------------
		
		// System.out.println() => ǥ�� ��� ��ġ
		// System.in.read()	=> ǥ�� �Է� ��ġ
		
		int keyCode=System.in.read();
		
		// enterŰ�� �ٸ� Ű�ʹ� �ٸ��� ĳ���� ����(CR:13)�� ���� �ǵ�(LF:10)�� ������ 2���� Ű�ڵ尡 �Էµȴ�.
		// ���� 2���� ���ļ� System.in.read()�� �о�� �Ѵ�.
		
		while(true)
		{
			keyCode=System.in.read();
			System.out.println("keyCode: "+keyCode);
			// ����ڰ� q�� �Է����� �� �ݺ��� �����ǰ�, q�� Ű�ڵ�� 113
			if(keyCode==113)
				break;
		}
		
		// System.in.read()�� ������ Ű�ڵ带 �ϳ��� �б� ������ 2�� �̻��� Ű�� ���յ� �ѱ��� ���� �� ����
		// �׸��� Ű����κ��� �Էµ� ������ �� ���ڿ��� ���� ���Ѵ�.
		// �̷��� ������ �����ϱ� ���� �ڹٴ� Scanner Ŭ������ �����ϰ� �ִ�.
		
		Scanner sc=new Scanner(System.in);
		String inputData;
		
		while(true)
		{
			inputData=sc.nextLine();
			System.out.println("�Էµ� ���ڿ� : "+inputData);
			// �ڹٴ� �⺻Ÿ��(byte,short,int...)�� ���� �������� ���Ҷ����� ==�� ����ϰ�,
			// ���ڿ�(String)�� �������� ���Ҷ����� equals() �޼ҵ带 ����Ѵ�.
			if(inputData.equals("q"))
				break;
		}
		
		//-------------------------------------------------------------------------------------------
		// ���� Ÿ�� ������ ��� ����Ŀ��� �ǿ����ڷ� ���Ǹ� int Ÿ�Ժ��� ���� byte, short Ÿ���� ������
		// int Ÿ������ �ڵ�Ÿ�Ժ�ȯ�Ǿ� ������ �����Ѵ�.
	}

}
