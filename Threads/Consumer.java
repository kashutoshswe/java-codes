package Threads;

public class Consumer extends Thread
{
    Basket basket;

    public Consumer(Basket basket)
    {
        this.basket = basket;
    }

    @Override
    public void run()
    {
        super.run();
        for(int i = 0; i < 10; i++)
        {
           basket.getNum();
        }
    }
}
