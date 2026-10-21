class MethodOverloading
{
	
	void squareWArgs(int x,int y,int z, int v)
	{
		System.out.println("square :"+(x*y*z*v));
	}
	void squareWArgs(int x,int y)
	{
		System.out.println("square :"+(x*y));
	}
	void square(double x,int y)
	{
		System.out.println("square :"+(x*y));
	}
	void square(int x, int y, int z)
	{
		System.out.println("square:"+(x*y*z));
	}
	void square(float x, int y, int z)
	{
		System.out.println("square:"+(x*y*z));
	}
	public static void main(String args[])
	{
		MethodOverloading m=new MethodOverloading();
		m.square(2,3,5);
		m.square(2.2,3);
		m.square(2.2f,3,5);
		
	}
}