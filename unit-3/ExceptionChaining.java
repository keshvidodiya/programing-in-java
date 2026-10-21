class ExceptionChaining
{
    public static void main(String args[])
    {
        try
        {
            try
            {
                int a = 10 / 0;
            }
            catch(Exception e)
            {
                throw new RuntimeException("New Exception", e);
            }
        }
        catch(RuntimeException e)
        {
            System.out.println(e);
            System.out.println("Cause: " + e.getCause());
        }
    }
}