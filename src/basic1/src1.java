package basic1;

import java.io.IOException;
// Scanner가 java.util 패키지에 있다는 것을 컴파일러에게 알려주는 역할
import java.util.Scanner;

public class src1 {

	public static void main(String[] args) throws IOException{
		// 문자열을 기본 타입으로 강제 타입 변환
		String str="10";
		byte value=Byte.parseByte(str);
		
		String str1="200";
		short value1=Short.parseShort(str1);
		
		String str2="30000";
		int value2=Integer.parseInt(str2);
		
		String str3="true";
		boolean value3=Boolean.parseBoolean(str3);
		
		// 문자열이 숫자가 아닌 알파벳이나 특수 문자, 한글 등을 포함하고 있을 경우 숫자 타입으로
		// 변환을 시도하면 숫자 형식 예외(NumberFormatException)가 발생
		// String str="1a";
		// int value=Integer.parseInt(str);	=> NumberFormatException 발생
		
		
		// 반대로 기본타입(byte, short, char, int ....)의 값을 문자열로 변경하는 경우
		// String.valueOf() 메소드를 이용
		
		String str4=String.valueOf(3);
		
		//----------------------------------------------------------------------------------
		
		// System.out.println() => 표준 출력 장치
		// System.in.read()	=> 표준 입력 장치
		
		int keyCode=System.in.read();
		
		// enter키는 다른 키와는 다르게 캐리지 리턴(CR:13)과 라인 피드(LF:10)로 구성된 2개의 키코드가 입력된다.
		// 따라서 2번에 걸쳐서 System.in.read()로 읽어야 한다.
		
		while(true)
		{
			keyCode=System.in.read();
			System.out.println("keyCode: "+keyCode);
			// 사용자가 q를 입력했을 때 반복이 중지되게, q의 키코드는 113
			if(keyCode==113)
				break;
		}
		
		// System.in.read()의 단점은 키코드를 하나씩 읽기 때문에 2개 이상의 키가 조합된 한글을 읽을 수 없다
		// 그리고 키보드로부터 입력된 내용을 통 문자열로 읽지 못한다.
		// 이러한 단점을 보완하기 위해 자바는 Scanner 클래스를 제공하고 있다.
		
		Scanner sc=new Scanner(System.in);
		String inputData;
		
		while(true)
		{
			inputData=sc.nextLine();
			System.out.println("입력된 문자열 : "+inputData);
			// 자바는 기본타입(byte,short,int...)의 값이 동일한지 비교할때에는 ==를 사용하고,
			// 문자열(String)이 동일한지 비교할때에는 equals() 메소드를 사용한다.
			if(inputData.equals("q"))
				break;
		}
		
		//-------------------------------------------------------------------------------------------
		// 정수 타입 변수가 산술 연산식에서 피연산자로 사용되면 int 타입보다 작은 byte, short 타입의 변수는
		// int 타입으로 자동타입변환되어 연산을 수행한다.
	}

}
