public class MultiAsy extends Thread {
    public void run()
    {
        System.out.println("Task one (Study)");
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        MultiAsy t1=new MultiAsy();
        MultiAsy t2=new MultiAsy();
        MultiAsy t3=new MultiAsy();

        t1.setName("Shubham");
        t2.setName("Bhadauria");
        t3.setName("Vikram");

        t1.start();
        t2.start();
        t3.start();
    }
    
}
