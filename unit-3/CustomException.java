class MyException extends Exception
{
    MyException(String msg)
    {
        super(msg);
    }
}

class CustomException
{
    public static void main(String args[])
    {
        int age = 15;

        try
        {
            if(age < 18)
            {
                throw new MyException("Not eligible to vote");
            }
            System.out.println("Eligible to vote");
        }
        catch(MyException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
