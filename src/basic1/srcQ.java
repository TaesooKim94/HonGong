package basic1;

// 우리는 지금까지 콘솔에 출력하기 위해 System.out.println() 메소드를 사용했다
// 이 메소드의 매개값은 콘솔에 출력할 내용인데,
// 매개값이 기본타입(byte,short,int,long,float,double,boolean)일 경우, 해당 값을 그대로 출력한다
// 만약 매개값으로 객체를 주면 객체의 toString() 메소드를 호출해서 리턴값을 받아 출력하도록 되어 있다.

// 자바 프로그램은 운영체제에서 바로 실행되는 것이 아니라 JVM 위에서 실행된다.
// 따라서 운영체제의 모든 기능을 직접 이용하기는 어렵다.
// 하지만 java.lang 패키지에 속하는 System 클래스를 이용하면 운영체제의 일부 기능을 이용할 수 있다.
// 즉, 프로그램 종료, 키보드로부터 입력, 모니터로 출력력, 현재 시간 읽기 등이 가능하다.
// System 클래스의 모든 필드와 메소드는 정적 필드와 정적 메소드로 구성되어 있다.

// # 프로그램 종료(exit())
// 강제적으로 JVM을 종료시킬때는 System 클래스의 exit() 메소드를 호출하면 된다.
// exit() 메소드는 현재 실행하고 있는 프로세스를 강제 종료시키는 역할을 한다.
// exit() 메소드는 int 매개값을 지정하도록 되어 있는데, 이 값을 종료 상태값이라고 한다
// 일반적으로 정상 종료일 경우 0 값을 준다.
// System.exit(0);

// # 현재 시각 읽기(currentIimeMillis(), nanoTime())
// 컴퓨터의 시계로부터 현재 시간을 읽어서 밀리세컨드 단위와 나노세컨드 단위의 long 값을 리턴한다
// 리턴값은 주로 프로그램의 실행 소요 시간 측정에 사용된다.
// 프로그램 시작 시 시각을 읽고, 프로그램이 끝날 때 시각을 읽어서 차이를 구하면 프로그램 실행 소요 시간이 나온다

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
		
		long time1=System.nanoTime();	// 시작 시간 읽기
		SmartPhone myPhone= new SmartPhone("구글","안드로이드");
		
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
		
		long time2=System.nanoTime();		// 끝 시간 읽기
		
		System.out.println("계산에 "+(time2-time1)+"나노초가 소요되었다");
	}
}
