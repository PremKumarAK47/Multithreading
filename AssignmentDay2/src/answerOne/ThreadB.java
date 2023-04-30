package answerOne;

public class ThreadB extends Thread {
	
	ThreadA tr;
	public ThreadB(ThreadA tr) {
		this.tr=tr;
		// TODO Auto-generated constructor stub
	}
	
	public void run()
	{
		try {
			tr.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=1;i<=20;i++)
		{
			if(i%2==1)
			{
				System.out.println("Odd Number is : "+i);
			}
		}
	}

}
