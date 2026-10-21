interface I1
{
	public abstract void display();
}
interface I2 extends I1
{
	public abstract void show();
}

class Main implements I1,I2
{
	public void display()
	{
		System.out.println("Dsiplay");
	}
	public void show()
	{
		System.out.println("show");
	}
	public static void main (String args[])
	{
		Main cm=new Main();
		cm.display();
		cm.show();

	}

}