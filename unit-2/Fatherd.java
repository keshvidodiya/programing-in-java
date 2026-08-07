class Fatherd
{
	void house()
	{
		System.out.println("father's house");
	} 
}
class Son extends Fatherd
{
	void bike()
	{
		System.out.println("this is my bike");
	}
}
class Mother extends Son
{
	void car()
	{
		System.out.println("its mother's car");
	}
	public static void main(String args[])
	{
		Mother b = new Mother();
		b.bike();
		b.house();
	}
} 
