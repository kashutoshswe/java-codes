/* This keyword Implementation when this keyword is used to pass current class instance
 @Author : Ashutosh Kumar
 @Date : 12th December,2017
 @Last Modified :
*/

import java.util.Scanner;
class Employee
{
  byte age;
  int date_of_joining;
  String name;

  Employee getdetails()
  {
     //returning object of employee class
     return this;
  }

  void inputdata()
  {
   //Taking input from user
   Scanner sc;
   sc=new Scanner(System.in);
  
  //Accepting Age
   System.out.println("Enter age");
   this.age=sc.nextByte();
   sc.nextLine();

   //Age validation
   if(age<=0 || age>=130)
   {
    System.out.println("Invalid age"); 
   }

   //Accepting Name
   System.out.println("Enter Name");
   this.name=sc.next();

   //Name Validation
   if(name==null)
   {
    System.out.println("Invalid name"); 
   }

   //Accepting batch
   System.out.println("Enter Year of Joining");
   this.date_of_joining=sc.nextInt();
 
  //validation of Year
   if(date_of_joining<=1976 || date_of_joining>=2017)
   {
    //Because all Employees before 1977 batch have been retired by now (40 Years of Service) 
    System.out.println("Invalid  batch"); 
   }
  
   display();
  }

  void display()
 {
    //Displaying Data of Employee;
    System.out.println("Name "+this.name);
    System.out.println("Age "+this.age);
    System.out.println("Joining Year "+this.date_of_joining);
 }
}

class Team
{
 public static void main(String args[])
 {
  //Creating object of Employee class by taking the object returned by the employee class
  new Employee().getdetails().inputdata();

  System.out.println("2nd Entry");

  //2nd Object
  new Employee().getdetails().inputdata();
 
  //In this way we can create multiple instances of employee within Team
 }
}
