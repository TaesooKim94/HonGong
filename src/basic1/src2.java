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
		// # 임의의 정수 뽑는 방법
		// => Math.random() 메소드 활용 (이 메소드는 0.0과 1.0 사이에 속하는 double타입의 난수 하나를 리턴)
		//                            이때 0.0은 범위에 포함되고 1.0은 포함되지 않는다.
		System.out.println((int)(Math.random()*10)); // 0 ~ 9
		System.out.println((int)(Math.random()*10)+1);	// 1 ~ 10
		
		int num=(int)(Math.random()*45)+1;	// 1 ~ 45
		
		//--------------------------------------------------------------------------------
		
		// do-while문에서 while() 뒤에 반드시 세미콜론(;)을 붙여야 한다.
		
		//---------------------------------------------------------------------------------
		
		// 기본타입 vs 참조타입
		// 기본타입 => 실제 값을 변수 안에 저장 ex) byte,char,int,long ....
		// 참조타입 => 객체(object)의 번지를 저장하는(참조하는) 타입  ex)배열타입,열거타입,클래스,인터페이스
		
		// 스택영역에 데이터저장
		int age=25;
		double price=100.5;
		
		// name,hobby변수는 스택영역에 있지만(힙영역의 String객체 번지 값을 가지고 있다)
		// 실제 "신용권", "독서"는 힙영역에 할당되어있다.
		String name="신용권";
		String hobby="독서";
		
		// 기본 타입 변수는 스택 영역에 직접 값을 가지고 있지만
		// 참조 타입 변수는 스택 영역에 힙영역의 객체 주소를 가진다.
		
		// 참고로 자바에서는 배열을 객체로 취급한다.
		int[] scores= {10,20,30};
		
		
		// 기본 타입 변수의 ==,!= 연산은 변수의 값이 같은지, 아닌지를 조사하지만
		// 참조 타입 변수들 간의 ==,!= 연산은 동일한 객체를 참조하는지, 다른 객체를 참조하는지 알아볼때 사용(번지값 비교)
		
		// 참조 타입 변수는 힙 영역의 객체를 참조하지 않는다는 뜻으로 null(널) 값을 가질 수 있다.
		
		// 참조 변수를 사용하면서 가장 많이 발생하는 예외 중 하나로 NullPointerException이 있다.
		// 만약 null 상태에서 있지도 않은 객체의 데이터(필드)나 메소드를 사용하는 코드를 실행하면 NullPointerException이 발생한다
		
		int[] intArray=null;
		// intArray[0]=10;	NullPointerExceptin 발생(intArray변수가 참조하는 배열 객체가 없기 때문이다)
		
		// 자바는 문자열 리터얼이 동일하다면 String 객체를 공유하도록 되어 있다.
		String name1="신용권";
		String name2="신용권";
		// new 연산자 => 힙 영역에 새로운 객체를 만들 때 사용하는 연산자로 객체 생성 연산자라고 한다.
		String name3=new String("신용권");
		String name4=new String("신용권");
		// 이경우 name3, name4는 서로 다른 String 객체를 참조하고 있다.
		// 문자열 리터럴로 생성하느냐 new 연산자로 생성하느냐에 따라 비교 연산자의 결과는 달라질 수 있다.
		
		boolean result=(name1==name2);	// true
		System.out.println(result);
		result=(name3==name4);	// false
		System.out.println(result);
		
		// 동일한 String 객체이건 다른 String 객체이건 상관없이 내부 문자열을 비교하고 싶을때에는 String
		// 객체의 equals() 메소드를 사용해야 한다.
		// equals() 메소드는 원본 문자열과 매개값으로 주어진 비교 문자열이 동일한지 비교한 후 true 또는 false를 리턴한다.
		
		boolean result1=name1.equals(name3);	// true
		System.out.println(result1);		
		
		name3=null;
		// null을 대입함으로써 더이상 String 객체를 참조하지 않도록 할수있다.
		// 참조를 잃은 String객체
		// => JVM은 참조되지 않은 객체를 쓰레기 객체로 취급하고 쓰레기 수집기(Gabage Collector)를
		//    구동시켜 메모리에서 자동 제거한다.
		
		String[] names=null;
		names=new String[] {"신용권","홍길동","감자바"};
		
		int sum2=add(new int[] {95,85,90});
		
		// new 연산자로 배열을 처음 생성할 경우 배열은 자동적으로 기본값으로 초기화된다.
		int[] intArray=new int[5];
		
		// 만약 String배열을 생성했다면 names 배열의 경우 names[0] ~ names[29]까지 모두 null 값으로 초기화된다.
		String[] names=new String[30];
		
		// # 다차원 배열
		// => 배열 변수인 scores는 길이가 2인 배열 A를 참조한다.
		//    배열 A의 scores[0]은 다시 길이가 3인 배열 B를 참조한다.
		//    그리고 scores[1]은 길이가 3인 배열 C를 참조한다.
		//    scores[0]과 scores[1]은 모두 배열을 참조하는 변수 역할을 한다.
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
		
		// 기본타입 배열은 각 항목에 직접 값을 갖고 있지만,
		// 참조타입(클래스,인터페이스) 배열은 각 항목에 객체의 번지를 가지고있다.
		// ex) String[] 배열은 각 항목에 문자열이 아니라, String 객체의 번지를 가지고 있다.
		
		String[] strArray=new String[3];
		strArray[0]="java";
		strArray[1]=new String("java");
		strArray[2]="C#";
		
		//---------------------------------------------------------------------------------------
		// # 배열복사
		// - 배열간의 항목 값들을 복사하려면 for문을 사용하거나 System.arraycopy() 메소드를 사용한다.
		
		int[] oldIntArray= {1,2,3};
		int[] newIntArray=new int[5];
		
		System.arraycopy(oldIntArray,0,newIntArray,0,oldIntArray.length);
		
		String[] oldStrArray= {"java","array","copy"};
		String[] newStrArray=new String[5];
		
		// 참조 타입 배열이 복사되면 복사되는 값이 객체의 번지이므로 새 배열의 항목은 이전 배열의 항목이
		// 참조하는 객체와 동일하다.
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		//-----------------------------------------------------------------------------------------
		
		int[] scores= {95,71,84,93,87};
		
		int sum=0;
		
		for(int score:scores)
		{
			sum+=score;
		}
		
		//-------------------------------------------------------------------------------------------
		
		// 열거 타입 => 요일에 대한 데이터, 계절에 대한 데이터와 같이 한정된 값만을 갖는 타입
		// Week가 열거타입
		// 열거 상수는 단독으로 사용할 수 없고, 반드시 '열거타입.열거상수'형태로 사용된다.
		Week today=Week.FRIDAY;
		// 열거 타입 변수는 null값을 저장할 수 있는데 열거 타입도 참조 타입이기 때문이다.
		Week birthday=null;
		
	}
	
	public static int add(int[] scores) 
	{
		int sum=0;
		// 배열의 길이를 얻으려면 배열 객체의 length를 사용
		for(int i=0;i<scores.length;i++)
		{
			sum+=scores[i];
		}
		return sum;
	}
}
