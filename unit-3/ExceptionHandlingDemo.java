class ExceptionHandlingDemo
{
	public static void main (String agrs[])
	{
		int a,b;
		a=10;
		b=0;
		int sum=a+b;
		int sub=a-b;
		int mul=a*b;

		System.out.println("addition =" +sum);
		System.out.println("subraction = " +sub);
		System.out.println("multipliction = " +mul);
	
		try
		{
			int div;
			div=a/b;
		
			System.out.println("division = " +div);
		
		}
			catch(Exception e)
		{
			System.out.println("you cannot divide number with 0 , this is an exception.");
		}
		System.out.println("i want to be exicuted");

	}

}