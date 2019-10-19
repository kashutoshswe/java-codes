package Threads;

public class EvenThread extends Thread
{
    EvenThread(String name)
    {
        super(name);
    }

    //So @override is generally to maintain the method signature for overriding
    @Override
    public void run()
    {
        super.run();
        Thread t2=Thread.currentThread();
        System.out.println(t2);
        for (int i=0;i<=50;i=i+2)
        {
            System.out.println(i+"  "+getName());
           /* try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }*/
        }

    }
}
