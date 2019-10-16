package Threads;

class Basket
{
    private int num;
    //Cannot write block in a class, where as a block should be in a method
    private boolean flag = true;

    synchronized int getNum()
    {
        if(flag)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

        System.out.println(" Get : "+num);
        flag = true;
        notify();
        return num;
    }

   // synchronized can be put before or after the access specifier
    synchronized void setNum(int num)
    {

        if(!flag)
        {
            try
            {
                //release The lock when not required
                wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

        this.num = num;
        System.out.println(" Put : "+num);
        flag = false;
        notify();
    }

    // So it is true only then producer uses setNum else consumer
    // gets the

}
