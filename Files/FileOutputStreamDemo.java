package Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo
{
    public static void main(String[] args)
    {
        //if file is not present for FIS then exception is thrown FileNotFoundException
        //if file is not present then create a new file and if file is present then it will overwrite

        FileInputStream fin = null;
        FileOutputStream fout=null;
        long start=0,end=0;
        try
        {
            //When file is opened with FileInputStream so JVM inserts -1 as EOF for file so we can read until EOF
            // FileInputStream accomadates one byte at a time and therefore one character at a time

            fin = new FileInputStream("/home/akumar/Desktop/SICSR-MSC(CA)-Software Development/Coding/Java/Test2/src/image.png");
            fout = new FileOutputStream("/home/akumar/Desktop/SICSR-MSC(CA)-Software Development/Coding/Java/Test2/src/newImage.png");

            int ch;
            start =System.currentTimeMillis();
            //reading one byte at a time
            while ((ch = fin.read()) != -1)
            {
                //writing one byte at a time
                fout.write(ch);
            }
            end = System.currentTimeMillis();
            System.out.println(end-start);
        }
        catch (FileNotFoundException ae)
        {
            System.out.println(ae.getMessage());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(fin!=null)
                    fin.close();
                if(fout!=null)
                fout.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

    }
}
