class Markes
{
    public static void main(String m[])
    {
        int marks =Integer.parseInt(m[0]);

        if (marks >= 90)
        {
            System.out.println("Grade A");
        }
        else if (marks >= 80)
        {
            System.out.println("Grade B");
        }
        else if (marks >= 70)
        {
            System.out.println("Grade C");
        }
        else if (marks >= 60)
        {
            System.out.println("Grade D");
        }
        else if (marks >= 35)
        {
            System.out.println("Grade E");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}