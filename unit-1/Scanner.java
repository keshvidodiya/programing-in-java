import java.lang.*;
import java.util.Scanner;

class HelloImport
{
	public static void main(String agrs[])
	{
		int no1,no2,no3;

		System.out.print("enter three no:");
		Scanner sc = new Scanner (System.in);

		no1=sc.nextInt();
		no2=sc.nextInt();
		no3=sc.nextInt();

		System.out.print("total of the no is:"+(no1+no2+no3));
	}
}