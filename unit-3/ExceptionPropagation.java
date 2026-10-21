class ExceptionPropagation
{
    void m()
    {
        int a = 10 / 0;
    }

    void n()
    {
        m();
    }

    void p()
    {
        try
        {
            n();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String args[])
    {
        ExceptionPropagation obj = new ExceptionPropagation();
        obj.p();
    }
}