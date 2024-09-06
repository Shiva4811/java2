class A extends Thread
{
    public void run()
    {
        Thread x=Thread.currentThread();
        System.out.println("I am inside the run method! "+x.getName());
        for(int i=1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName());
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println();
            }
        }
        System.out.println("I am out of the Loop!");
    }
}
class MultiThreadingExtend
{
    public static void main(String args[])
    {
        
        A t=new A();
        t.start();
        Thread y=Thread.currentThread();
        System.out.println(y.getName());

        System.out.println("NOw, you are in the main method!");
        for(int i=1;i<5;i++)
        {
            System.out.println("Now, you are inside the main method loop!");
            System.out.println(y.getName());
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println();
            }
        }
        System.out.println("Now you r outside the main method loop!");
    }
    
}