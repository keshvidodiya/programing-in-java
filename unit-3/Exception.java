class Exception
{
	public static void main(String agrs[])
{
		String studentName="keshvi";
		System.out.println(studentName + " started math calculation");
	try
	{
		int totalMarks = 100;
		int Subject=0;
		int Result = totalMarks/Subject;

		System.out.println("result : " + Result);
	}
	catch(ArithmeticException e)
	{
		System.out.println("exception caught : division by zero is not possible " +studentName + "!");
	}
	System.out.println(studentName + " 's program continues exicution");
	}
	
}