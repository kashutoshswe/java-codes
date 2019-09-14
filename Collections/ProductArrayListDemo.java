package Collections;

import java.util.ArrayList;
import java.util.Collections;


public class ProductArrayListDemo
{

    static void sortByName(ArrayList<Product> products)
    {
        ArrayList<Product> newList=new ArrayList<>(products);
        //sort is overloaded method
        //one takes one parameter which is list
        //Another method is list and the object of the Comparator
        Collections.sort(newList,new SortByName());
        System.out.println(newList);
    }

    public static void main(String[] args)
    {
        ArrayList<Product> arrayList=new ArrayList<>();
        Product p5=new Product(5,"E",4000);
        Product p4=new Product(4,"D",3000);
        Product p3=new Product(3,"C",2000);
        Product p2=new Product(2,"B",1000);
        Product p1=new Product(1,"A",5000);

        arrayList.add(p5);
        arrayList.add(p4);
        arrayList.add(p3);
        arrayList.add(p2);
        arrayList.add(p1);

        System.out.println(arrayList);
        //Collections.sort(arrayList);
        for(Product product : arrayList)
        {
            System.out.println(product);
        }

        sortByName(arrayList);

        ArrayList<String> names=new ArrayList<>();
        names.add("A");
        names.add("Z");
        names.add("Y");
        names.add("D");
        names.add("E");

        System.out.println(names);
        Collections.sort(names);
        System.out.println("New List ");

        System.out.println(names);


    }
}
