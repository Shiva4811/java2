class Name
{
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t.getName()+" is the current thread.");
		System.out.println(t.getPriority()+" is the priority of this Thread.");

		System.out.println("Changing name and priority of this thread.");

		t.setName(" Anna Thread");
		t.setPriority( 7);
		System.out.println("Suspending the thread for 5 sec:-");
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Thread and Priority after change:-");
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		
	}
}