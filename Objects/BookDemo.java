package Objects;

import java.io.*;

public class BookDemo
{
    public static void main(String[] args)
    {
        //.dat is for having extension(any extension), and file will be created in Current Working Directory
        ObjectOutputStream out = null;
        try {
            //ObjectOutputStream is BufferedStream
            out = new ObjectOutputStream(new FileOutputStream("book.dat"));
            Book b1 = new Book(1, "The Alchemist", 100);
            Book b2 = new Book(2, "The Mountains Echoed", 300);
            Book b3 = new Book(3, "Animal Farm", 50);

            //Automatic serialization takes place
            out.writeObject(b1);
            out.writeObject(b2);
            out.writeObject(b3);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //When buffer is full,content is flushed out
            //So when the buffer is half filled then it needs to be forcefully closed
            //The Buffer is flushed out automatically
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        ObjectInputStream in=null;

        try
        {
            FileInputStream fin=new FileInputStream("book.dat");
            in=new ObjectInputStream(fin);
            Object x;
            //fin.available returns the no of bytes remaining to read
            while(fin.available() >0)
            {
                try
                {
                    x=in.readObject();
                    ((Book)x).display();
                }
                catch (ClassNotFoundException e)
                {
                    e.printStackTrace();
                }
            }


        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException ae)
        {
            ae.printStackTrace();
        }
        finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        /*
        This is one way of reading data because EOF marker is not present

        try
        {
            in=new ObjectInputStream(new FileInputStream("book.dat"));
            Object abc;
            while (true)
            {
                try
                {
                    if(((abc=in.readObject()) !=null))
                    {
                        ((Book)abc).display();
                    }
                    else
                        break;

                }
                catch (ClassNotFoundException e)
                {
                    e.printStackTrace();
                }
                catch (EOFException ae)
                {
                    //Because the File does not have marker to mark end of file
                    // So it was giving EOFException
                    //System.out.println("EOF Exception");
                }

            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

*/
    }
}
