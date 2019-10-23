package Threads;

import java.util.ArrayList;

public class NumberGen extends Thread
{
    private int start,end;
    private ArrayList<Integer> abc;

    NumberGen(ArrayList<Integer> abc,int start, int end)
    {
        this.abc=abc;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run()
    {
        super.run();
        for (int i = start; i <= end; i++)
        {
	    //synchronized block
            synchronized (abc) 
	    {
                boolean add = abc.add(i);
                if (add)
                    System.out.println("Added " + i);
            }
        }
    }
}
