class Father
{
	void house()
	{
		System.out.println("father's house");
	} 
}
class Son extends Father
{
	void bike()
	{
		System.out.println("this is my bike");
	}
	public static void main(String agrs[])
	{
		Son ob = new Son();
		ob.bike();
		ob.house();
	}
}