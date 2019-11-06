package Collections;

import java.util.LinkedHashSet;

public class RemoveRepeatedLetter
{
    public static void main(String[] args)
    {
        String s="This is is first line.That is is is second line line";
        String arrayS[]=s.split(".");
        String sb="",newSb="";

        for(String r:arrayS)
        {
            String newStringArray[]=r.split(" ");
            LinkedHashSet<String> hashSet=new LinkedHashSet<>();
            for(String x: newStringArray)
                hashSet.add(x);

            for(String y: hashSet)
            {
               sb+=y;
               sb+=" ";
            }
            newSb+=sb;
        }

        System.out.println(newSb);
    }
}
