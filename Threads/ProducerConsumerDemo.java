package Threads;

public class ProducerConsumerDemo
{
    public static void main(String[] args)
    {
        Basket basket = new Basket();
        Producer producer = new Producer(basket);
        Consumer consumer = new Consumer(basket);

        producer.start();
        consumer.start();

        try
        {
            producer.join();
            consumer.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
