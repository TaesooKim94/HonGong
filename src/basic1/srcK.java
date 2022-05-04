package basic1;

// # ����ó��
// ���� => ������� �߸��� ���� �Ǵ� �������� �߸��� �ڵ����� ���� �߻��ϴ� ���α׷� ����
// ���ܴ� ����ó��(exception handling)�� ���� ���α׷��� �������� �ʰ� ���� ���� ���°� �����ǵ��� �� �� �ִ�.

// # ����
// 1. �Ϲ� ����(exception) = �����Ϸ� üũ ����
//    => ���α׷� ����� ���ܰ� �߻��� ���ɼ��� ���� ������ �ڹ� �ҽ��� �������ϴ� �������� �ش� ���� ó�� �ڵ尡 �ִ��� �˻��Ѵ�
//       ���� ���� ó�� �ڵ尡 ���ٸ� ������ ������ �߻��Ѵ�
// 2. ���� ����(runtime exception) = ������ �� üũ ����
//   => ���� �� ������ �� ���� ���ڱ� �߻��ϱ� ������ �������ϴ� �������� ���� ó�� �ڵ尡 �ִ��� �˻����� �ʴ´�.

// �ڹٿ����� ���ܸ� Ŭ������ �����Ѵ�.
// JVM�� ���α׷��� �����ϴ� ���߿� ���ܰ� �߻��ϸ� �ش� Ŭ������ ��ü�� �����Ѵ�.
// �׸��� ���� ���� ó�� �ڵ忡�� ���� ��ü�� �̿��� �� �ֵ��� ���ش�.
// ��� ��� Ŭ������ java.lang.Exception Ŭ������ ��� �޴´�.

// �߿�!!!)
// �Ϲ� ���ܿ� ���� ���� Ŭ������ RuntimeException Ŭ������ �������� �����Ѵ�
// RuntimeException�� ���� Ŭ������ �ƴϸ� �Ϲ� ���� Ŭ�����̰�,
// ���� Ŭ�����̸� ���� ���� Ŭ�����̴�.
// Ŭ���� ��� ���迡�� �θ�(����)�� RuntimeException�� �ִٸ� ���� ���� Ŭ�����̴�.

// ���� ���ܴ� �ڹ� �����Ϸ��� üũ���� �ʱ� ������ ������ �������� ���迡 ���ؼ� ���� ó�� �ڵ带 �ۼ��ؾ� �Ѵ�.
// ���� �����ڰ� ���� ���ܿ� ���� ���� ó�� �ڵ带 ���� �ʾ��� ���, �ش� ���ܰ� �߻��ϸ� ���α׷��� ��ٷ� ����ȴ�.

// # ���� �߻��Ǵ� ���࿹��
// 1. NullPointerException
// => ��ü ������ ���� ����, �� null ���� ���� ���� ������ ��ü ���� �������� ��Ʈ(.)�� ������� �� �߻�
// 2. ArrayIndexOutOfBoundsException
// => �迭���� �ε��� ������ �ʰ��� ���
// 3. NumberFormatException
// => ���α׷��� �����ϴ� ���� ���ڿ��� �Ǿ� �ִ� �����͸� ���ڷ� �����ϴ� ��찡 ���� �߻��Ѵ�
//    Integer.parseInt("1234"),	Double.parseDouble("123.22")
//    ���ڷ� ��ȯ�� �� ���� ���ڰ� ���ԵǸ� �߻��Ѵ�
//    parseXXX()�޼ҵ�� WrapperŬ������ �����޼ҵ��̴�.
// 4. ClassCastException
// => Ÿ�� ��ȯ(Casting)�� ���� Ŭ������ ���� Ŭ���� ���� �߻��ϰ� ����Ŭ������ �������̽� ������ �߻��Ѵ�
//    �̷��� ���谡 �ƴ϶�� Ŭ������ �ٸ� Ÿ������ ��ȯ�� �� ���⶧���� ClassCastException�� �߻��Ѵ�
//    ClassCastException�� �߻���Ű�� �������� Ÿ�� ��ȯ ���� ��ȯ�� �������� instanceof �����ڷ� Ȯ���ϴ� ���� ����.
public class srcK {

	public static void main(String[] args) {

	}

}