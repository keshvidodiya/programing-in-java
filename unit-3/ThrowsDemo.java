class ThrowsDemo
{
    static void show() throws Exception
    {
        System.out.println("Hello Java");
    }

    public static void main(String args[])
    {
        try
        {
            show();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
