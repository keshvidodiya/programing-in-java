class MyThread2 implements Runnable
{
    public void run()
    {
        System.out.println("Thread is woking");
    }

    public static void main(String args[])
    {
        MyThread2 obj = new MyThread2();
        Thread t = new Thread(obj);
        t.start();
    }
}