interface I1
{
	public abstract void display();
}
class ClassMain implements I1
{
	public void display()
	{
		System.out.println("Dsiplay");
	}
	public static void main (String args[])
	{
		ClassMain cm=new ClassMain();
		cm.display();

	}

}