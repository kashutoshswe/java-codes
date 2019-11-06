package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;


public class HashMapDemo
{
    public static void main(String[] args)
    {

        // If we use TreeMap we will get the sorted Map according to the Key

        HashMap<String,Integer> hashMap=new HashMap<>();
        TreeMap<String,Integer> treeMap =new TreeMap<>();

        treeMap.put("Z",10);
        treeMap.put("A",10);
        treeMap.put("C",10);
        treeMap.put("X",10);

        System.out.println(" Tree Map is "+treeMap);

        hashMap.put("A",1000);
        hashMap.put("Z",5000);
        hashMap.put("H",10000);
        hashMap.put("R",20000);

        System.out.println(hashMap);

        System.out.println("Salary of A  =   "+hashMap.get("A"));
        System.out.println("ye Key hai ?"+hashMap.containsKey("A"));
        System.out.println("ye Value hai ?"+hashMap.containsValue(5000));

        hashMap.remove("R");
        System.out.println(hashMap);

        //KeySet returns the object of the class
        //Class implements set Interface
        Set<String> names = hashMap.keySet();
        Iterator<String> itr=names.iterator();

        while (itr.hasNext())
        {
            String k = itr.next();
            int v = hashMap.get(k);
            System.out.println(k+"  "+v);
        }

        //Also we can use For Each instead of Iterator
        /*for (String k : names)
        {
            int v = hashMap.get(k);
            System.out.println(k + "  " + v);
        }*/
    }
}
