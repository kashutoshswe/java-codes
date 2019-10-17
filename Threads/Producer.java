package Threads;


//create a no and put it in a basket
public class Producer extends Thread
{
    Basket basket;

    public Producer(Basket basket)
    {
        this.basket = basket;
    }

    @Override
    public void run()
    {
        super.run();
        for (int i = 0; i <10 ; i++)
        {
            basket.setNum(i);
        }

    }
}
