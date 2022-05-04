package basic1;

// # Class Ŭ����
// �ڹٴ� Ŭ������ �������̽��� ��Ÿ �����͸� java.lang ��Ű���� �Ҽӵ� Class Ŭ������ �����Ѵ�
// ��Ÿ ������ => Ŭ������ �̸�, ������ ����, �ʵ� ����, �޼ҵ� ����

// # Class ��ü ���( getClass(), forName())
// 1. Class clazz = Ŭ�����̸�.class
// 2. Class clazz = Class.forName("��Ű��...Ŭ�����̸�")
// 3. Class clazz = ��������.getClass();
// ù��°�� �ι�° ����� ��ü ���� Ŭ���� �̸��� ������ Class ��ü�� ��� ����̴�.
// ����° ����� Ŭ�����κ��� ��ü�� �̹� �����Ǿ� ���� ��쿡 ����ϴ� ����̴�.
// ex) String Ŭ������ Class ��ü��
// 1. Class clazz = String.class;
// 2. Class clazz = Class.forName("java.lang.String");
// 3. String str = "���ڹ�";
//    Class clazz = str.getClass();

// ����)
// Car Ŭ������ Class��ü�� ���, Class�� �޼ҵ带 �̿��� Ŭ������ ��ü �̸���
// ������ �̸� �׸��� ��Ű�� �̸��� ��� ���

// # Ŭ���� ��θ� Ȱ���ؼ� ���ҽ� ���� ��� ���
// Class ��ü�� �ش� Ŭ������ ���� ��� ������ ������ �ֱ� ������ �� ��θ� Ȱ���ؼ� �ٸ� ���ҽ� ����(�̹���, XML, Property����)
// �� ��θ� ���� �� �ִ�.
// �� ����� UI ���α׷����� ���� Ȱ��ȴ�.
// ���� ��� Car Ŭ������ ��ġ�ϴ� ��ο� photo.jpg ������ �ִٰ� �����ϸ�
// ex) ���α׷� ���� �߿� �̹��� ����(photo1.jpg, photo2.jpg)�� ���� ��ΰ� �ʿ��� ��� Car.class�� ��������
//     �� ��� ��θ� �̿��ؼ� ���� ��θ� ���� �� �ִ�.
//     String photo1Path=clazz.getResource("photo1.jpg").getPath();
//     String photo2Path=clazz.getResource("images/photo2.jpg").getPath();

class Car
{
	
}

public class srcR {

	public static void main(String[] args) {
		// ù��° ���
		Class clazz=Car.class;
		
		// �ι�° ���
		// Class clazz = Class.forName("sec01.exam08.Car");
		
		// ����° ���
		// Car car;
		// Class clazz = car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
	}

}
