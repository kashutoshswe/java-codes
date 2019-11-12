package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FrequencyOfNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num;

        HashMap<Integer,Integer> freq=new HashMap<>();
        while(true)
        {
            System.out.println("Enter Number ");
            num = sc.nextInt();
            if (num == 0)
                break;

            if (!(freq.containsKey(num)))
            {
                freq.put(num, 1);
            }
            else
                {
                int count = freq.get(num);
                freq.put(num, count + 1);
            }

        }
        System.out.println(freq);

    }
}
