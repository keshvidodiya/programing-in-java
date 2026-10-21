abstract class Abstract1
{
	abstract void display();
	void show()
	{
		System.out.println("show");
	}
}
class Abstract2 extends Abstract1
{
	void display()
	{
		System.out.println("Abstract method dispaly");
	}
	public static void main(String args[])
	{
		Abstract2 c=new Abstract2();
		c.display();
		c.show();
	}
}