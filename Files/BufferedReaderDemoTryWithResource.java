package Files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Try with Resource
//Here we can open resource within the try itself
//and therefore even if the occurs or not it will be closed without finally
//So it eliminates the need of writing the finally block

public class BufferedReaderDemoTryWithResource
{
    public static void main(String[] args) {

        long start = 0, end = 0;
        try (BufferedReader bf = new BufferedReader(new FileReader("/home/akumar/Desktop/SICSR-MSC(CA)-Software Development/Coding/Java/Test2/src/Files/test.txt"))) {
            //When file is opened with FileInputStream so JVM inserts -1 as EOF for file so we can read until EOF
            // FileInputStream accomadates one byte at a time and therefore one character at a time
            String ch;
            start = System.currentTimeMillis();
            while ((ch = bf.readLine()) != null) {
                System.out.println(ch);
            }
            end = System.currentTimeMillis();
            System.out.println(end - start);
        } catch (FileNotFoundException ae) {
            System.out.println(ae.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



