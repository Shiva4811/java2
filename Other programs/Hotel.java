interface Customer
{
	int dosa=50;
	int pavbhaji=45;
	int springroll=40;
	void order();
}
interface billing
{
	void menuDisp();
	void bill();
}
interface DiwaliOffer
{
	void offer();
}
class Hotel implements Customer,billing
{
	public int dish1, dish2, bill;
	public void menuDisp()
	{
	System.out.println("****** MENU*******");
	System.out.println("Dosa Rs.  "+dosa);
	System.out.println("pavBhaji Rs.  "+pavbhaji);
	System.out.println("Dosa Rs.  "+springroll);
	}
	public void order()
	{
	dish1=dosa;
	dish2=springroll;
	}
	public void bill()
	{
		bill=dish1+dish2;
		System.out.println("******BILL******");
		System.out.println("YOUR BILL IS   "+bill);
		System.out.println("THANK YOU");
	}
	public void offer()
	{
		System.out.println("20% offer on Diwali sale.....!");
		int offer=bill*80/100;
		System.out.println("bill after 20% discount is :"+offer);
	}
	public static void main(String args[])
	{
	Hotel obj=new Hotel();
	obj.menuDisp();
	obj.order();
	obj.bill();
	obj.offer();
	}
}