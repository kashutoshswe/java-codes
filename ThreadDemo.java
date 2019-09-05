package Threads;
//With normal execution 584861 NanoSeconds
//With Thread Execution  NanoSeconds

public class ThreadDemo
{
    public static void main(String[] args)
    {
        long start,end;
        start=System.nanoTime();
        System.out.println("Start ");

        EvenThread evenThread=new EvenThread("Even");
        OddThread oddThread=new OddThread("Odd");
        evenThread.start();
        oddThread.start();

        //Never call the run method, call start method of threads
        //Based on whoever gets the CPU will execute
        //Even and odd are child threads
        //So parallel we have 3 threads - main,even,odd
        //So here the issue main thread executes 1st and completes and gets exit
        //Idealy main should wait for both the threads to finish and do the cleanup work
        //So for this we have join method, the calling thread will pause

        System.out.println("Even is Alive "+evenThread.isAlive());
        System.out.println("Odd is Alive "+oddThread.isAlive());

        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Even is Alive "+evenThread.isAlive());
        System.out.println("Odd is Alive "+oddThread.isAlive());


        //There is a method isAlive which checks whether the thread is alive or not

        System.out.println("End ");

        end=System.nanoTime();
        System.out.println(end-start);
    }
}
