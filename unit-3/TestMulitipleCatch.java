class TestMulitipleCatch
{
	public static void main(String agrs[])
	{
	try
	{
		int[] keshviScores =new int[3];

		keshviScores[0] = 80;
		keshviScores[1] = 90;
		keshviScores[2] = 95;
		keshviScores[5] = 100;
		System.out.println("array :" +keshviScores[2]);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Arthmetic error occurred");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("array index error : keshvi accessed an invalid index!");
	}
	catch(Exception e )
	{
		System.out.println("exception handler :" + e);
	}
}
}