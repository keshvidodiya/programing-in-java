class Outer
{
    void display()
    {
        class Inner
        {
            void show()
            {
                System.out.println("Hello from Inner Class");
            }
        }

        Inner obj = new Inner();
        obj.show();
    }

    public static void main(String args[])
    {
        Outer obj = new Outer();
        obj.display();
    }
}