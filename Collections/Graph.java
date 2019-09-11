package Collections;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

public class Graph
{
    HashMap<Integer, LinkedList<Integer>> hashMap=new HashMap<>();
    void addEdge(int source,int destination)
    {
        if(hashMap.containsKey(source))
        {
            LinkedList<Integer> existingList = hashMap.get(source);
            existingList.add(destination);
            //In case of the list is updated
            hashMap.put(source,existingList);
        }
        else
        {
            LinkedList<Integer> newList=new LinkedList<>();
            newList.add(destination);
            hashMap.put(source,newList);
        }
    }
    void display()
    {
        Set<Integer> keySet= hashMap.keySet();
        for(Integer vertices:keySet)
        {
            System.out.print(vertices + "-->");
           LinkedList<Integer> linkedList=hashMap.get(vertices);
            for (Integer values:linkedList)
            {
                System.out.print(values + "-->");
            }
            System.out.println("\b\b\b");
        }
    }
}
