package Collections;

//If you are the owner of the class implements Comparable
//and want to create comparisons
//It is present in java.lang package

public class Product implements Comparable<Product>
{
    private int pno;
    private String pname;
    private int price;

    Product(int pno, String pname, int price)
    {
        this.pno = pno;
        this.pname = pname;
        this.price = price;
    }

    @Override
    public String toString()
    {
        return pno+"    "+pname+"   "+price;
    }

    public int getPno()
    {
        return pno;
    }

    public void setPno(int pno) {
        this.pno = pno;
    }

    String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product o)
    {
        //We have to decide how we want to sort the ArrayList
        //Ascending order
        return this.pno-o.pno;

        //2nd will be treated 1st
        //Descending order
        // return o.pno-this.pno;
    }
}
