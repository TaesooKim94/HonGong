package basic1;

import java.io.IOException;

// # String Ŭ����
// �ڹ��� ���ڿ��� java.lang ��Ű���� String Ŭ������ �ν��Ͻ��� �����ȴ�

// ������ ������ �аų�, ��Ʈ��ũ�� ���� ���� �����ʹ� ���� byte[] �迭�̹Ƿ� �̰��� ���ڿ��� ��ȯ�ϱ� ���� ���ȴ�

public class srcS {

	public static void main(String[] args) throws IOException{
		byte[] bytes= {72,101,108,108,111,32,74,97,118,97};
		
		String str1=new String(bytes);
		System.out.println(str1);
		
		String str2=new String(bytes, 6, 4);
		System.out.println(str2);
		
		// # System.in.read()
		// => Ű���忡�� �Է��� ������ �Ű������� �־��� ����Ʈ �迭�� �����ϰ� ���� ����Ʈ ���� �����Ѵ�.
		
		byte[] bytess=new byte[100];		// ���� ����Ʈ�� �����ϱ� ���� �迭 ����
		
		System.out.println("�Է�: ");
		int readByteNo=System.in.read(bytes);	// �迭�� ���� ����Ʈ�� �����ϰ� ���� ����Ʈ ���� ����
		
		String str=new String(bytess,0,readByteNo-2);	// �迭�� ���ڿ��� ��ȯ
		System.out.println(str);
	}

}
