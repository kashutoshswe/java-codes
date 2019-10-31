package Threads;

public class ThreadMsg extends Thread
{
    //Data members will be there in the memory until the Object is there in the memory
    private Callme callme;
    private String msg;
    ThreadMsg(Callme callme, String msg)
    {
        this.callme=callme;
        this.msg =msg;
    }

    @Override
    public void run()
    {
        //Never ever synchronised the run method
        super.run();
        callme.print(msg);
    }
}
