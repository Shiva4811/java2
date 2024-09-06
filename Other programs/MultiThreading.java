//This demo is for extending the Thread class
class MyThread extends Thread
{
    public void run()
    {
        System.out.println("I am in the run method");
        for(int i=0; i<=100; i++)
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
        System.out.println("This user Thread is ended.");
       
    }
}
class MultiThreading
{
    public static void main(String[] args) {
        MyThread th=new MyThread();
        Thread t=new Thread(th);
        th.start();
        System.out.println("I am in the main thread.");
        for(int i=100; i<=200; i++)
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
        System.out.println("Main Thread has been ended.");
    }
}