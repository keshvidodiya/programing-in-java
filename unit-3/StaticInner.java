class Outer
{
    static int a = 10;

    static class Inner
    {
        void display()
        {
            System.out.println("Value of a = " + a);
        }
    }

    public static void main(String args[])
    {
        Outer.Inner obj = new Outer.Inner();
        obj.display();
    }
}