package basic1;

// 예외처리 => 프로그램에서 예외가 발생했을 경우 프로그램의 갑작스러운 종료를 막고, 정상 실행을 유지할 수 있도록 예외처리를 해야 한다

// 자바 컴파일러는 소스 파일을 컴파일할때 일반 예외가 발생할 가능성이 있는 코드를 발견하면 컴파일 에러를 발생시켜
// 개발자가 강제적으로 예외 처리 코드를 작성하도록 요구한다

// 그러나 실행 예외는 컴파일러가 체크해주지 않기 때문에 개발자의 경험을 바탕으로 예외 처리 코드를 작성해야 한다

// # 예외 처리 코드
// => try catch finally 블록
// 일반예외와 실행예외가 발생할 경우 예외처리를 할수있도록 해준다.
// finally 블록은 예외 발생 여부와 상관없이 항상 실행할 내용이 있을 경우에만 작성
// 심지어 try블록과 catch블록에서 return문을 사용하더라도 finally 블록은 항상 실행된다.

// 이클립스는 일반예외가 발생할 가능성이 있는 코드를 작성하면 빨간 밑줄을 그어 예외 처리 코드의 필요성을 알려준다.
// unhandled exeption(처리되지 않은 예외)

// ArrayIndexOutOfBoundsException이나 NumberFormatException과 같은 실행 예외는 
// 컴파일러가 예외 처리 코드를 체크하지 않기 때문에 이클립스에서도 빨간 밑줄이 생기지 않는다
// 오로지 개발자의 경험에 의해 예외 처리를 작성해줘야 한다
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
//	System.out.println("실행 매개값의 수가 부족함");
//	return;
//}


// #예외 종류에 따른 처리 코드
// 1. 다중 catch
// => try블록 내부는 다양한 예외가 발생할 수 있다
//    이 경우 발생되는 예외별로 예외 처리 코드를 다르게 하려면 다중 catch 블록을 작성한다
//try
//{}
//catch(ArrayIndexOutOfBoundsException e)
//{}
//catch(NumberFormatException e)
//{}
// catch블록이 여러개라 할지라도 단 하나의 catch 블록만 실행된다.
// 그이유는 try블록에서 동시 다발적으로 예외가 발생하지 않고, 하나의 예외가 발생하면 즉시 실행을
// 멈추고 해당 catch블록으로 이동하기 때문이다.


class srcL {

	public static void main(String[] args) {
		// # catch순서
		// 다중 catch 블록을 작성할 때 주의할점
		// => 상위 예외 클래스가 하위 예외 클래스보다 아래쪽에 위치해야 한다
		//    만약 상위 예외 클래스의 catch블록이 위에 있다면, 하위 예외 클래스의 catch블록은 실행되지 않는다.
		//    왜냐하면 하위 예외는 상위 예외를 상속했기 때문에 상위 예외 타입도 되기 때문이다.
		
		// ArrayIndexOutOfBoundsException과 NumberFormatException은 모두 Exception을
		// 상속받기 때문에 Exception이 먼저 나타나면 안된다.
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
			System.out.println("실행 매개값의 수가 부족하다");
		}
		catch(NumberFormatException e)
		{
			System.out.println("숫자로 변환할 수 없습니다");
		}
		finally
		{
			System.out.println("다시 실행하세요");
		}
	}

}
