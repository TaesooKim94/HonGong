package basic1;

// # �Ű� ������ ������ �� ���
// => �Ű������� �迭 Ÿ������ ����

// �޼ҵ� �����ε��� ������ �Ű������� Ÿ��, ����, ���� �� �ϳ��� �޶���Ѵ�.
// �����ε��� �޼ҵ带 ȣ���� ��� JVM�� �Ű����� Ÿ���� ���� �޼ҵ带 �����Ѵ�.
// JVM�� ���������� �Ű� ������ Ÿ���� ������, �Ű� ������ Ÿ���� ��ġ���� ���� ��� �ڵ� Ÿ�� ��ȯ�� �������� �˻�
// ���� Ÿ�Ը� �ٸ��� �Ű������� �����ϴٸ� �̰͵� �����ε��� �ƴϴ�.
// �޼ҵ� �����ε��� ���� ��ǥ���� ���� System.out.println() �޼ҵ��̴�.

class Computer
{
	int sum1(int[] values)
	{
		int sum=0;
		for(int i=0;i<values.length;i++)
			sum+=values[i];
		
		return sum;
	}
}

public class src4 {

	public static void main(String[] args) {
		Computer myCom=new Computer();
		int[] values1= {1,2,3};
		System.out.println(myCom.sum1(values1));
		
		int result2=myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println(result2);
	}

}
