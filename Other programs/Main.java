// MultiThreading by Implementing the Runnable Interface
class MyThread implements Runnable{
    public void run()
    {
		Thread t1=Thread.currentThread();
		System.out.println(t1.getName()+" is the user Thread.");
        System.out.println("Thread is Starting.");
        for(int i=0; i<=1000;i++)
        {
			
            System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
        }
		System.out.println("User Thread is ended.");
        
    }

}
class Main
{
    public static void main(String args[])
    {
		Thread r=Thread.currentThread();
		System.out.println(r.getName()+" is the thread name.");
        MyThread th=new MyThread();
		Thread t=new Thread(th);
		t.start();
		for(int i=1000; i<=2000; i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		System.out.println("Main Thread is ended.");
		
    }
}