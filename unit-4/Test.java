class Print
{
    synchronized void display(int n)
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println(n * i);
        }
    }
}

class Keshvi extends Thread
{
    Print p;

    Keshvi(Print p)
    {
        this.p = p;
    }

    public void run()
    {
        p.display(2);
    }
}

class Sonal extends Thread
{
    Print p;

    Sonal(Print p)
    {
        this.p = p;
    }

    public void run()
    {
        p.display(5);
    }
}

class Test
{
    public static void main(String args[])
    {
        Print obj = new Print();

        Keshvi t1 = new Keshvi(obj);
        Sonal t2 = new Sonal(obj);

        t1.start();
        t2.start();
    }
}