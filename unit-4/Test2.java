class Keshvi extends Thread
{
    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Keshvi: " + i);
        }
    }
}

class Sonal extends Thread
{
    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Sonal: " + i);
        }
    }
}

class Test2
{
    public static void main(String args[]) throws InterruptedException
    {
        Keshvi t1 = new Keshvi();
        Sonal t2 = new Sonal();

        t1.start();
        t1.join();

        t2.start();
        t2.join();
    }
}