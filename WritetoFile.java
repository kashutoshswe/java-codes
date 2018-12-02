/* Write contents to file
   Date : 27th March,2018
   Ashutosh Kumar
*/

import java.io.*;
import java.util.Scanner;
class WritetoFile
{
    FileOutputStream fos;
    Scanner scan;
    String data;
    WritetoFile() throws Exception
    {
        scan=new Scanner(System.in);
        System.out.println("Enter the data which you want to write");
        data=scan.nextLine();

        //convert string to byte array
        byte bdata[]=data.getBytes();

        //FileOutputStream second parameter is for making the file in the append mode.
        fos=new FileOutputStream("data.txt",true);
        fos.write(bdata);
    }

    public static void main(String args[]) throws Exception
    {
      //Creates file in same directory
      WritetoFile obj=new WritetoFile();
    }
}
