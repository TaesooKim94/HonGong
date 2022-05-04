package basic1;

import java.awt.Toolkit;

//  ex) ��Ƽ ������ ���� �ڵ�
//  0.5�� �ֱ�� ����(beep)���� �߻���Ű�鼭 ���ÿ� ����ϴ� �۾�
//  ������ �߻��� ����� ���� �ٸ� �۾��̹Ƿ� ���� �����尡 ���ÿ� �ΰ��� �۾��� ó���� �� ����.
//  �������� �߻���Ű�鼭 ���ÿ� ����� �Ϸ��� �� �۾� �� �ϳ��� ���� �����尡 �ƴ� �ٸ� �����忡�� �����ؾ� �Ѵ�.
//  ��� => ���� ������		/ ������ => �۾� ������

class BeepTask implements Runnable
{
	public void run()
	{
		Toolkit toolkit=Toolkit.getDefaultToolkit();	// Toolkit ��ü ���
		
		for(int i=0;i<5;i++)
		{
			toolkit.beep();
			try {Thread.sleep(500);}catch(Exception e) {}	// 0.5�ʰ� �Ͻ� ����
		}
	}
}

public class srcW {

	public static void main(String[] args) {
		Runnable beepTask=new BeepTask();
		Thread thread=new Thread(beepTask);
		// �۾� �������� start() �޼ҵ带 ȣ���ϸ� �۾� �����忡 ����  BeepTask ��ü��
		// run() �޼ҵ尡 ����Ǿ� �������� �߻��Ѵ�.
		thread.start();
		
//		 #�͸�ü�̿�
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
			System.out.println("��");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}

}
