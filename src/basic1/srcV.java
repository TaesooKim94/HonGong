package basic1;

// #프로세스(process)
// => 운영체제에서 실행 중인 하나의 애플리케이션

// #스레드(thread)
// => 프로세스 내부에서 코드의 실행 흐름

// 멀티 프로세스는 운연체제에서 할당받은 자신의 메모리를 가지고 실행하기 때문에
// 각 프로세스는 서로 독립적이다.
// 따라서 하나의 프로세스에서 오류가 발생해도 다른 프로세스에 영향을 미치지 않는다
// 하지만
// 멀티 스레드는 하나의 프로세스 내부에 생성되기 때문에 하나의 스레드가 예외를 발생시키면
// 프로세스 자체가 종료될 수 있어 다른 스레드에 영향을 미치게 된다.

// 멀티 스레드는 다양한 곳에서 사용된다
// 대용량 데이터의 처리 시간을 줄이기 위해 데이터를 분할해서 병렬로 처리하기도 하고,
// UI를 가지고 있는 애플리케이션에서 네트워크 통신을 하기 위해 사용되기도 한다.
// 또한 다수 클라이언트의 요청을 처리하는 서버를 개발할 때에도 사용한다.

// 멀티스레드는 애플리케이션을 개발하는 데 꼭 필요한 기능이기 때문에 반드시 이해해야한다.

// # 메인 스레드
// => 자바의 모든 애플리케이션은 메인 스레드(main thread)가 main()메소드를 실행하면서 시작한다
//    메인 스레드는 필요에 따라 작업 스레드들을 만들어서 병렬로 코드를 실행할 수 있다.
//    즉, 멀티 스레드를 생성해서 멀티 태스킹을 수행한다.

// 싱글 스레드 애플리케이션에서는 메인 스레드가 종료하면 프로세스도 종료된다.
// 하지만
// 멀티 스레드 애플리케이션에서는 실행 중인 스레드가 하나라도 있다면, 프로세스는 종료되지 않는다.
// 메인 스레드가 작업 스레드보다 먼저 종료되더라도 작업 스레드가 계속 실행 중이라면 프로세스는 종료되지 않는다.

// # 작업 스레드 생성과 실행
// => 멀티 스레드로 실행하는 애플리케이션을 개발하려면 먼저 몇개의 작업을 병렬로 실행할지 결정하고
//    각 작업별로 스레드를 생성해야 한다.
// ex) 메인스레드(프로그램시작)	/	작업스레드1(네트워킹)	/	작업스레드2(드로잉)
// 어떤 자바 애플리케이션이건 메인 스레드는 반드시 존재하므로 메인 작업 이외에 추가적인 병렬 작업의 수만큼 스레드를 생성하면 된다.
// 자바에서는 작업 스레드도 객체로 생성되기 때문에 클래스가 필요하다
// java.lang.Thread 클래스를 직접 객체화해서 생성해도 되지만, Thread 클래스를 상속해서 하위 클래스를 만들어 생성할 수도 있다.

// # Thread 클래스로부터 직접 생성
// Runnable은 작업 스레드가 실행할 수 있는 코드를 가지고 있는 객체
// Runnable은 인터페이스 타입이기 때문에 구현 객체를 만들어 대입해야 한다.
// Runnable에는 run() 메소드 하나가 정의되어 있는데, 구현 클래스는 run()을 재정의해서 작업 스레드가 실행할 코드를 작성해야 한다.

class Task implements Runnable
{
	public void run()
	{
		// 스레드가 실행할 코드
	}
}

public class srcV {

	public static void main(String[] args) {
		// Runnable은 작업내용을 가지고 있는 객체이지 실제 스레드는 아니다.
		// Runnable 구현객체를 생성한 후, 이것을 매개값으로 해서 Thread 생성자를 호출해야 비로소 작업 스레드가 생성된다.
		
		Runnable task=new Task();
		
		Thread thread=new Thread(task);
		// 작업 스레드는 생성되는 즉시 실행되는 것이 아니라, start() 메소드를 호출해야만 실행된다.
		// start() 메소드가 호출되면, 작업 스레드는 매개값으로 받은 Runnable의 run()메소드를 실행하면서
		// 자신의 작업을 처리한다.
		thread.start();
	}

}
