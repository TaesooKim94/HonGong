package basic1;

// ����ó�� => ���α׷����� ���ܰ� �߻����� ��� ���α׷��� ���۽����� ���Ḧ ����, ���� ������ ������ �� �ֵ��� ����ó���� �ؾ� �Ѵ�

// �ڹ� �����Ϸ��� �ҽ� ������ �������Ҷ� �Ϲ� ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ带 �߰��ϸ� ������ ������ �߻�����
// �����ڰ� ���������� ���� ó�� �ڵ带 �ۼ��ϵ��� �䱸�Ѵ�

// �׷��� ���� ���ܴ� �����Ϸ��� üũ������ �ʱ� ������ �������� ������ �������� ���� ó�� �ڵ带 �ۼ��ؾ� �Ѵ�

// # ���� ó�� �ڵ�
// => try catch finally ���
// �Ϲݿ��ܿ� ���࿹�ܰ� �߻��� ��� ����ó���� �Ҽ��ֵ��� ���ش�.
// finally ����� ���� �߻� ���ο� ������� �׻� ������ ������ ���� ��쿡�� �ۼ�
// ������ try��ϰ� catch��Ͽ��� return���� ����ϴ��� finally ����� �׻� ����ȴ�.

// ��Ŭ������ �Ϲݿ��ܰ� �߻��� ���ɼ��� �ִ� �ڵ带 �ۼ��ϸ� ���� ������ �׾� ���� ó�� �ڵ��� �ʿ伺�� �˷��ش�.
// unhandled exeption(ó������ ���� ����)

// ArrayIndexOutOfBoundsException�̳� NumberFormatException�� ���� ���� ���ܴ� 
// �����Ϸ��� ���� ó�� �ڵ带 üũ���� �ʱ� ������ ��Ŭ���������� ���� ������ ������ �ʴ´�
// ������ �������� ���迡 ���� ���� ó���� �ۼ������ �Ѵ�
//String data1=null;
//String data2=null;
//
//try
//{
//	data1=args[0];
//	data2=args[1];
//}
//catch(ArrayIndexOutOfBoundsException e)
//{
//	System.out.println("���� �Ű����� ���� ������");
//	return;
//}


// #���� ������ ���� ó�� �ڵ�
// 1. ���� catch
// => try��� ���δ� �پ��� ���ܰ� �߻��� �� �ִ�
//    �� ��� �߻��Ǵ� ���ܺ��� ���� ó�� �ڵ带 �ٸ��� �Ϸ��� ���� catch ����� �ۼ��Ѵ�
//try
//{}
//catch(ArrayIndexOutOfBoundsException e)
//{}
//catch(NumberFormatException e)
//{}
// catch����� �������� ������ �� �ϳ��� catch ��ϸ� ����ȴ�.
// �������� try��Ͽ��� ���� �ٹ������� ���ܰ� �߻����� �ʰ�, �ϳ��� ���ܰ� �߻��ϸ� ��� ������
// ���߰� �ش� catch������� �̵��ϱ� �����̴�.


class srcL {

	public static void main(String[] args) {
		// # catch����
		// ���� catch ����� �ۼ��� �� ��������
		// => ���� ���� Ŭ������ ���� ���� Ŭ�������� �Ʒ��ʿ� ��ġ�ؾ� �Ѵ�
		//    ���� ���� ���� Ŭ������ catch����� ���� �ִٸ�, ���� ���� Ŭ������ catch����� ������� �ʴ´�.
		//    �ֳ��ϸ� ���� ���ܴ� ���� ���ܸ� ����߱� ������ ���� ���� Ÿ�Ե� �Ǳ� �����̴�.
		
		// ArrayIndexOutOfBoundsException�� NumberFormatException�� ��� Exception��
		// ��ӹޱ� ������ Exception�� ���� ��Ÿ���� �ȵȴ�.
		try
		{
			String data1=args[0];
			String data2=args[1];
			int value1=Integer.parseInt(data1);
			int value2=Integer.parseInt(data2);
			int result=value1+value2;
			System.out.println(data1+"+"+data2+"="+result);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("���� �Ű����� ���� �����ϴ�");
		}
		catch(NumberFormatException e)
		{
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�");
		}
		finally
		{
			System.out.println("�ٽ� �����ϼ���");
		}
	}

}
