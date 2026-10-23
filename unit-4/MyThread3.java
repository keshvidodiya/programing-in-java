class MyThread3 extends Thread
{
    public void run()
    {
        System.out.println("Thread Name: " + getName());
        System.out.println("Thread Priority: " + getPriority());
    }

    public static void main(String args[])
    {
        MyThread3 t = new MyThread3();

        t.setName("MyThread");
        t.setPriority(7);

        t.start();
    }
}