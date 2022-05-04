package basic1;

public class src2 {
	public enum Week
	{
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY
	}
	
	public static void main(String[] args) {
		// # ������ ���� �̴� ���
		// => Math.random() �޼ҵ� Ȱ�� (�� �޼ҵ�� 0.0�� 1.0 ���̿� ���ϴ� doubleŸ���� ���� �ϳ��� ����)
		//                            �̶� 0.0�� ������ ���Եǰ� 1.0�� ���Ե��� �ʴ´�.
		System.out.println((int)(Math.random()*10)); // 0 ~ 9
		System.out.println((int)(Math.random()*10)+1);	// 1 ~ 10
		
		int num=(int)(Math.random()*45)+1;	// 1 ~ 45
		
		//--------------------------------------------------------------------------------
		
		// do-while������ while() �ڿ� �ݵ�� �����ݷ�(;)�� �ٿ��� �Ѵ�.
		
		//---------------------------------------------------------------------------------
		
		// �⺻Ÿ�� vs ����Ÿ��
		// �⺻Ÿ�� => ���� ���� ���� �ȿ� ���� ex) byte,char,int,long ....
		// ����Ÿ�� => ��ü(object)�� ������ �����ϴ�(�����ϴ�) Ÿ��  ex)�迭Ÿ��,����Ÿ��,Ŭ����,�������̽�
		
		// ���ÿ����� ����������
		int age=25;
		double price=100.5;
		
		// name,hobby������ ���ÿ����� ������(�������� String��ü ���� ���� ������ �ִ�)
		// ���� "�ſ��", "����"�� �������� �Ҵ�Ǿ��ִ�.
		String name="�ſ��";
		String hobby="����";
		
		// �⺻ Ÿ�� ������ ���� ������ ���� ���� ������ ������
		// ���� Ÿ�� ������ ���� ������ �������� ��ü �ּҸ� ������.
		
		// ����� �ڹٿ����� �迭�� ��ü�� ����Ѵ�.
		int[] scores= {10,20,30};
		
		
		// �⺻ Ÿ�� ������ ==,!= ������ ������ ���� ������, �ƴ����� ����������
		// ���� Ÿ�� ������ ���� ==,!= ������ ������ ��ü�� �����ϴ���, �ٸ� ��ü�� �����ϴ��� �˾ƺ��� ���(������ ��)
		
		// ���� Ÿ�� ������ �� ������ ��ü�� �������� �ʴ´ٴ� ������ null(��) ���� ���� �� �ִ�.
		
		// ���� ������ ����ϸ鼭 ���� ���� �߻��ϴ� ���� �� �ϳ��� NullPointerException�� �ִ�.
		// ���� null ���¿��� ������ ���� ��ü�� ������(�ʵ�)�� �޼ҵ带 ����ϴ� �ڵ带 �����ϸ� NullPointerException�� �߻��Ѵ�
		
		int[] intArray=null;
		// intArray[0]=10;	NullPointerExceptin �߻�(intArray������ �����ϴ� �迭 ��ü�� ���� �����̴�)
		
		// �ڹٴ� ���ڿ� ���;��� �����ϴٸ� String ��ü�� �����ϵ��� �Ǿ� �ִ�.
		String name1="�ſ��";
		String name2="�ſ��";
		// new ������ => �� ������ ���ο� ��ü�� ���� �� ����ϴ� �����ڷ� ��ü ���� �����ڶ�� �Ѵ�.
		String name3=new String("�ſ��");
		String name4=new String("�ſ��");
		// �̰�� name3, name4�� ���� �ٸ� String ��ü�� �����ϰ� �ִ�.
		// ���ڿ� ���ͷ��� �����ϴ��� new �����ڷ� �����ϴ��Ŀ� ���� �� �������� ����� �޶��� �� �ִ�.
		
		boolean result=(name1==name2);	// true
		System.out.println(result);
		result=(name3==name4);	// false
		System.out.println(result);
		
		// ������ String ��ü�̰� �ٸ� String ��ü�̰� ������� ���� ���ڿ��� ���ϰ� ���������� String
		// ��ü�� equals() �޼ҵ带 ����ؾ� �Ѵ�.
		// equals() �޼ҵ�� ���� ���ڿ��� �Ű������� �־��� �� ���ڿ��� �������� ���� �� true �Ǵ� false�� �����Ѵ�.
		
		boolean result1=name1.equals(name3);	// true
		System.out.println(result1);		
		
		name3=null;
		// null�� ���������ν� ���̻� String ��ü�� �������� �ʵ��� �Ҽ��ִ�.
		// ������ ���� String��ü
		// => JVM�� �������� ���� ��ü�� ������ ��ü�� ����ϰ� ������ ������(Gabage Collector)��
		//    �������� �޸𸮿��� �ڵ� �����Ѵ�.
		
		String[] names=null;
		names=new String[] {"�ſ��","ȫ�浿","���ڹ�"};
		
		int sum2=add(new int[] {95,85,90});
		
		// new �����ڷ� �迭�� ó�� ������ ��� �迭�� �ڵ������� �⺻������ �ʱ�ȭ�ȴ�.
		int[] intArray=new int[5];
		
		// ���� String�迭�� �����ߴٸ� names �迭�� ��� names[0] ~ names[29]���� ��� null ������ �ʱ�ȭ�ȴ�.
		String[] names=new String[30];
		
		// # ������ �迭
		// => �迭 ������ scores�� ���̰� 2�� �迭 A�� �����Ѵ�.
		//    �迭 A�� scores[0]�� �ٽ� ���̰� 3�� �迭 B�� �����Ѵ�.
		//    �׸��� scores[1]�� ���̰� 3�� �迭 C�� �����Ѵ�.
		//    scores[0]�� scores[1]�� ��� �迭�� �����ϴ� ���� ������ �Ѵ�.
		int[][] scores=new int[2][3];
		
		int[][] scores1= {{95,80},{92,96}};
		
		int[][] mathScores=new int[2][3];
		
		for(int i=0;i<mathScores.length;i++)
		{
			for(int j=0;j<mathScores[i].length;j++)
			{
				System.out.println(mathScores[i][j]);
			}
		}
		
		// �⺻Ÿ�� �迭�� �� �׸� ���� ���� ���� ������,
		// ����Ÿ��(Ŭ����,�������̽�) �迭�� �� �׸� ��ü�� ������ �������ִ�.
		// ex) String[] �迭�� �� �׸� ���ڿ��� �ƴ϶�, String ��ü�� ������ ������ �ִ�.
		
		String[] strArray=new String[3];
		strArray[0]="java";
		strArray[1]=new String("java");
		strArray[2]="C#";
		
		//---------------------------------------------------------------------------------------
		// # �迭����
		// - �迭���� �׸� ������ �����Ϸ��� for���� ����ϰų� System.arraycopy() �޼ҵ带 ����Ѵ�.
		
		int[] oldIntArray= {1,2,3};
		int[] newIntArray=new int[5];
		
		System.arraycopy(oldIntArray,0,newIntArray,0,oldIntArray.length);
		
		String[] oldStrArray= {"java","array","copy"};
		String[] newStrArray=new String[5];
		
		// ���� Ÿ�� �迭�� ����Ǹ� ����Ǵ� ���� ��ü�� �����̹Ƿ� �� �迭�� �׸��� ���� �迭�� �׸���
		// �����ϴ� ��ü�� �����ϴ�.
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		//-----------------------------------------------------------------------------------------
		
		int[] scores= {95,71,84,93,87};
		
		int sum=0;
		
		for(int score:scores)
		{
			sum+=score;
		}
		
		//-------------------------------------------------------------------------------------------
		
		// ���� Ÿ�� => ���Ͽ� ���� ������, ������ ���� �����Ϳ� ���� ������ ������ ���� Ÿ��
		// Week�� ����Ÿ��
		// ���� ����� �ܵ����� ����� �� ����, �ݵ�� '����Ÿ��.���Ż��'���·� ���ȴ�.
		Week today=Week.FRIDAY;
		// ���� Ÿ�� ������ null���� ������ �� �ִµ� ���� Ÿ�Ե� ���� Ÿ���̱� �����̴�.
		Week birthday=null;
		
	}
	
	public static int add(int[] scores) 
	{
		int sum=0;
		// �迭�� ���̸� �������� �迭 ��ü�� length�� ���
		for(int i=0;i<scores.length;i++)
		{
			sum+=scores[i];
		}
		return sum;
	}
}
