package Threads;

public class SynchroDemoNew
{
    public static void main(String[] args)
    {

        System.out.println("Start");

        Callme callme = new Callme();
        ThreadMsg m1= new ThreadMsg(callme,"Javaa");
        ThreadMsg m2= new ThreadMsg(callme,"C");
        ThreadMsg m3= new ThreadMsg(callme,"Python");

        m1.start();
        m2.start();
        m3.start();
        //m1.start();


        try
        {
            m1.join();
            m2.join();
            m3.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }


        System.out.println("End ");

        /*
        In case of Asynchronised thread whoever gets the CPU gets gets executed
        when method is not declared as Synchronized

        output :
        [Javaa
        [C
        [Python
        ]
        ]
        ]
        */

    }
}
