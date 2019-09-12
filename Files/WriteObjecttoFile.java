/* Write contents to file
   Date : 27th March,2018
   Ashutosh Kumar
   Using Marker Interface for Serialisation
   Using toString() method to store the state of the object
*/

import java.io.*;
import java.util.Scanner;
class Employee implements Serializable
{
  int eno;
  String enm;
  double sal;

  Employee(int eno,String enm,double sal)
  {
    this.eno=eno;
    this.enm=enm;
    this.sal=sal;
  }

  public String toString()
  {
    return "[Employee : " +eno+","+enm+","+sal+"]";
  }
}

class Manager extends Employee
{
  double comm;
  // the variable which is transient can't be serialzed
  transient char grade;

  Manager(int eno,String enm,double sal,double comm,char grade)
  {
    super(eno,enm,sal);
    this.comm=comm;
    this.grade=grade;
  }

  public String toString()
  {
      return "[Manager : " +eno+","+enm+","+sal+","+comm+","+grade+"]";
  }
}

class Serialization_Demo
{
  public static void main(String args[])
  {
    Employee object1=new Employee(101,"Ashu",84384);
    Manager mobject1=new Manager(101,"Ashu",84384,4500,'B');

    //System.out.println("Object is "+object1);

    try
    {
      FileOutputStream fos=new FileOutputStream("serailout.txt");
      ObjectOutputStream oos=new ObjectOutputStream(fos);

      oos.writeObject(object1);
      oos.writeObject(mobject1);

      oos.flush();
      oos.close();

      Employee object2;
      Manager mobject2;

      FileInputStream fis=new FileInputStream("serailout.txt");
      ObjectInputStream ois=new ObjectInputStream(fis);

      object2=(Employee)ois.readObject();
      mobject2=(Manager)ois.readObject();
      ois.close();

      System.out.println("Employee Class Object2:"+object2);
      System.out.println("Manager Class Object2:"+mobject2);
    }
    catch(Exception e)
    {
      System.out.println("Exception"+e);
      System.exit(0);
    }
  }
}
