package basic1;

import java.awt.Toolkit;

//  ex) 멀티 스레드 예시 코드
//  0.5초 주기로 비프(beep)음을 발생시키면서 동시에 출력하는 작업
//  비프음 발생과 출력은 서로 다른 작업이므로 메인 스레드가 동시에 두가지 작업을 처리할 수 없다.
//  비프음을 발생시키면서 동시에 출력을 하려면 두 작업 중 하나를 메인 스레드가 아닌 다른 스레드에서 실행해야 한다.
//  출력 => 메인 스레드		/ 비프음 => 작업 스레드

class BeepTask implements Runnable
{
	public void run()
	{
		Toolkit toolkit=Toolkit.getDefaultToolkit();	// Toolkit 객체 얻기
		
		for(int i=0;i<5;i++)
		{
			toolkit.beep();
			try {Thread.sleep(500);}catch(Exception e) {}	// 0.5초간 일시 정지
		}
	}
}

public class srcW {

	public static void main(String[] args) {
		Runnable beepTask=new BeepTask();
		Thread thread=new Thread(beepTask);
		// 작업 스레드의 start() 메소드를 호출하면 작업 스레드에 의해  BeepTask 객체의
		// run() 메소드가 실행되어 비프음이 발생한다.
		thread.start();
		
//		 #익명객체이용
//		Thread thread=new Thread(new Runnable()
//				{
//					@Override
//					public void run()
//					{
//						Toolkit toolkit=Toolkit.getDefaultToolkit();
//						
//						for(int i=0;i<5;i++)
//						{
//							toolkit.beep();
//							try {Thread.sleep(500);}catch(Exception e) {}
//						}
//					}
//				});
		
		for(int i=0;i<5;i++)
		{
			System.out.println("띵");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}

}
