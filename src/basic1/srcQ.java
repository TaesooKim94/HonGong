package basic1;

// �츮�� ���ݱ��� �ֿܼ� ����ϱ� ���� System.out.println() �޼ҵ带 ����ߴ�
// �� �޼ҵ��� �Ű����� �ֿܼ� ����� �����ε�,
// �Ű����� �⺻Ÿ��(byte,short,int,long,float,double,boolean)�� ���, �ش� ���� �״�� ����Ѵ�
// ���� �Ű������� ��ü�� �ָ� ��ü�� toString() �޼ҵ带 ȣ���ؼ� ���ϰ��� �޾� ����ϵ��� �Ǿ� �ִ�.

// �ڹ� ���α׷��� �ü������ �ٷ� ����Ǵ� ���� �ƴ϶� JVM ������ ����ȴ�.
// ���� �ü���� ��� ����� ���� �̿��ϱ�� ��ƴ�.
// ������ java.lang ��Ű���� ���ϴ� System Ŭ������ �̿��ϸ� �ü���� �Ϻ� ����� �̿��� �� �ִ�.
// ��, ���α׷� ����, Ű����κ��� �Է�, ����ͷ� ��·�, ���� �ð� �б� ���� �����ϴ�.
// System Ŭ������ ��� �ʵ�� �޼ҵ�� ���� �ʵ�� ���� �޼ҵ�� �����Ǿ� �ִ�.

// # ���α׷� ����(exit())
// ���������� JVM�� �����ų���� System Ŭ������ exit() �޼ҵ带 ȣ���ϸ� �ȴ�.
// exit() �޼ҵ�� ���� �����ϰ� �ִ� ���μ����� ���� �����Ű�� ������ �Ѵ�.
// exit() �޼ҵ�� int �Ű����� �����ϵ��� �Ǿ� �ִµ�, �� ���� ���� ���°��̶�� �Ѵ�
// �Ϲ������� ���� ������ ��� 0 ���� �ش�.
// System.exit(0);

// # ���� �ð� �б�(currentIimeMillis(), nanoTime())
// ��ǻ���� �ð�κ��� ���� �ð��� �о �и������� ������ ���뼼���� ������ long ���� �����Ѵ�
// ���ϰ��� �ַ� ���α׷��� ���� �ҿ� �ð� ������ ���ȴ�.
// ���α׷� ���� �� �ð��� �а�, ���α׷��� ���� �� �ð��� �о ���̸� ���ϸ� ���α׷� ���� �ҿ� �ð��� ���´�

class SmartPhone
{
	private String company;
	private String os;
	
	public SmartPhone(String company, String os)
	{
		this.company=company;
		this.os=os;
	}

	@Override
	public String toString() {
		return company+", "+os;
	}
}

public class srcQ {

	public static void main(String[] args) {
		
		long time1=System.nanoTime();	// ���� �ð� �б�
		SmartPhone myPhone= new SmartPhone("����","�ȵ���̵�");
		
		String strObj=myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone);
		
		// System.exit()
		for(int i=0;i<10;i++)
		{
			if(i==5)
				System.exit(0);
		}
		
		// System.currentTimeMillis(), System.nanoTime()
		// long time=System.currentTimeMillis();
		// long time=System.nanoTime();
		
		long time2=System.nanoTime();		// �� �ð� �б�
		
		System.out.println("��꿡 "+(time2-time1)+"�����ʰ� �ҿ�Ǿ���");
	}
}
