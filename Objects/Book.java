package Objects;

import java.io.Serializable;

public class Book implements Serializable
{
    private String name;
    private transient float price;
    private int bookno;

    Book(int bookno, String name, float price)
    {
        this.bookno = bookno;
        this.name = name;
        this.price = price;
    }


     Book()
    {
        super();
    }

    public int getBookno() {
        return bookno;
    }

    public void setBookno(int bookno) {
        this.bookno = bookno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void display()
    {
        System.out.println("Book No "+bookno+"\nBook Name  "+name+"\nPrice "+price);
    }
}
