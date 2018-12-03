/* This keyword Implementation when this keyword is passed as an argument
 @Author : Ashutosh Kumar
 @Date : 12th December,2017
 @Last Modified :
*/

import java.util.Scanner;
class Collegestudent
{
 //college student object declaration
 Student obj;
 Collegestudent(Student obj)
 {
    //using this keyword to store data
    this.obj=obj;
 }

 void display()
 {
    System.out.println("Name :"+obj.name);
    System.out.println("Age :"+obj.age);
    System.out.println("Batch :"+obj.batch);
  }
}

class Student
{

 //Declaration of variables
 
 byte age;
 int batch;
 String name;

 //Constructors
 Student()
 {
   inputData();
   //Creating object of collegestudent
   Collegestudent one=new Collegestudent(this);

   //calling Display method
   one.display();
 }


 void inputData()
 {
  //Taking input from user
   Scanner sc;
   sc=new Scanner(System.in);
  
  //Accepting Age
   System.out.println("Enter age");
   age=sc.nextByte();
   sc.nextLine();

   //Age validation
   if(age<=0 || age>=130)
   {
    System.out.println("Invalid age"); 
   }

   //Accepting Name
   System.out.println("Enter Name");
   name=sc.next();

   //Name Validation
   if(name==null)
   {
    System.out.println("Invalid name"); 
   }

   //Accepting batch
   System.out.println("Enter Batch");
   batch=sc.nextInt();
 
   //validation of batch
   if(batch<=1900 || batch>=2017)
   {
    System.out.println("Invalid batch"); 
   }
 }//Closing of inputData Method

 public static void main(String args[])
 {
  //Creating object of Student class
  Student one=new Student();
 }

}
