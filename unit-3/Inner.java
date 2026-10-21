class Outer
{
    int a = 10;

    class Inner
    {
        void display()
        {
            System.out.println("Value of a = " + a);
        }
    }

    public static void main(String args[])
    {
        Outer obj = new Outer();
        Outer.Inner i = obj.new Inner();
        i.display();
    }
}