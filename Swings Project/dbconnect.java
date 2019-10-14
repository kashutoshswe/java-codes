/*
JDBC code to connect to the database
Authors : Ashutosh Kumar,Anshul Agrawal
PRN : 19030142006
      19030142009
*/

import java.sql.*;

class Dbconnect
{
  //instance variables
  Connection cn;
  ResultSet rs;
  Statement st;
  String query;

  //method for database Connection
  void connect()
  {
    try
    {
      //1st register the driver
      Class.forName("com.mysql.jdbc.Driver");
      //Establish the Connection
      cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","ashutosh");
    }
    catch(Exception ae)
    {
        //To catch all the Exception
        System.out.println(ae);
    }
  }


  void executequery()
  {
    try
    {
      //Statement for executing the query, createStatement will give object of Statement
      st=cn.createStatement();
      //excute query
      rs=st.executeQuery(query);
    }
    catch(Exception ae)
    {
      //To catch all the Exception
      System.out.println(ae);
    }
  }//executeQuery method

  void executeUpdate()
  {
    try
    {
      //Statement for executing the query, createStatement will give object of Statement
      st=cn.createStatement();
      //excute query
      boolean a=st.execute(query);
    }
    catch(Exception ae)
    {
      //To catch all the Exception
      System.out.println(ae);
    }
  }//executeQuery method

  void closeconnect()
  {
    try
      {
        cn.close();
      }

      catch(Exception ae)
      {
        //To catch all the exceptions for finally block
        System.out.println(ae);
      }
  }//closeconnect method


  //Methods for Database data
  boolean checkadmin(String uname,String pass)
  {
    boolean flag=false;
    String user=uname,passw=pass;

    connect();
    //query
    query="select username,password from admin";
    executequery();

    try
    {
    //while loop to parse throught the records for checking whether the user is there or not
      while(rs.next())
        {
          //best practise is to write the column name
          if(user.equalsIgnoreCase(rs.getString(1)) && passw.equalsIgnoreCase(rs.getString(2)))
          {
            System.out.println(rs.getString(1)+" "+rs.getString(2));
            flag=true;
            break;
          }
        }
    }
    catch(Exception ae)
    {
      System.out.println(ae);
    }

  closeconnect();
  return flag;
  }//checkuser closing


  //method to check user authentication
  boolean checkuser(String uname,String pass)
  {
    boolean flag=false;
    String user=uname,passw=pass;

    connect();
    //query
    query="select username,password from user";
    executequery();

    try
    {
    //while loop to parse throught the records for checking whether the user is there or not
      while(rs.next())
        {
          //best practise is to write the column name
          if(user.equalsIgnoreCase(rs.getString(1)) && passw.equalsIgnoreCase(rs.getString(2)))
          {
            System.out.println(rs.getString(1)+" "+rs.getString(2));
            flag=true;
            break;
          }
        }
    }
    catch(Exception ae)
    {
      System.out.println(ae);
    }

  closeconnect();
  return flag;
  }//checkuser closing

  //method to insert data into database
  boolean insertdata(String uname,String password,String fname2,String lname2,String age2,String address,char gender,String country2,String phone2,String email2)
  {
    boolean flag=false;
    int age=Integer.parseInt(age2);
    int phno=Integer.parseInt(phone2);
    connect();
    //query
    query="insert into user(username,password,fname,lname,age,address,gender,country,phoneno,email) VALUE ('"+uname+"','"+password+"','"+fname2+"','"+lname2+"','"+age+"','"+address+"','"+gender+"','"+country2+"','"+phno+"','"+email2+"');";
    executeUpdate();
    closeconnect();
    flag=true;
    return flag;
  }

  boolean insertdata2(String uname,String password,String fname2,String lname2,String age2,String address,char gender,String country2,String phone2,String email2)
  {
    boolean flag=false;
    int age=Integer.parseInt(age2);
    int phno=Integer.parseInt(phone2);
    connect();
    //query
    //String sqlQuery = "INSERT INTO `time_entry`(pid,tid,rid,tspend,description) VALUE ('"+pid+"','"+tid+"','"+rid+"',"+tspent+",'"+des+"');";
    query="insert into user2(username,password,fname,lname,age,address,gender,country,phoneno,email) VALUE ('"+uname+"','"+password+"','"+fname2+"','"+lname2+"','"+age+"','"+address+"','"+gender+"','"+country2+"','"+phno+"','"+email2+"');";
    executeUpdate();
    closeconnect();
    flag=true;
    return flag;
  }

//To retrive customer details
String[] returndata(int id)
  {
    String[] data=new String[9];
    int x=0,v=countrecords();
    if(v!=0)
    {
      if(id>v)
      {
        return null;
      }
    }
    else
        return null;

    connect();
    query="select * from user where uid="+id;
    executequery();

    try
    {
    //while loop to parse throught the records for checking whether the user is there or not
      while(rs.next())
        {
          data[x]=rs.getString(2);
          x+=1;
          data[x]=rs.getString(4);
          x+=1;
          data[x]=rs.getString(5);
          x+=1;
          data[x]=rs.getInt(6)+" ";
          x+=1;
          data[x]=rs.getString(7);
          x+=1;
          data[x]=rs.getString(8);
          x+=1;
          data[x]=rs.getString(9);
          x+=1;
          data[x]=rs.getString(10);
          x+=1;
          data[x]=rs.getString(11);
        }
     }
     catch(Exception ae)
     {
       System.out.println(ae);
     }
    closeconnect();
    return data;
  }

  int countrecords()
  {
    int a=0;
    connect();
    query="select count(*) from teacher";
    executequery();
    try
    {
      if(rs.next())
      {
          a=rs.getInt(1);
      }
     }
     catch(Exception ae)
     {
       System.out.println(ae);
     }
     closeconnect();
     return a;
  }

  //CallableStatement in JDBC
  CallableStatement cstmt=null;
  String[] returnuserdetails(int id)
  {
    String[] data=new String[2];
    connect();
    try
    {
    cstmt=cn.prepareCall("{call p100(?,?,?)}");
    cstmt.setInt(1,id);

    cstmt.registerOutParameter(2,java.sql.Types.VARCHAR);
    cstmt.registerOutParameter(3,java.sql.Types.VARCHAR);

    cstmt.execute();

    data[0]=cstmt.getString(2);
    data[1]=cstmt.getString(3);
    }
    catch(Exception ae)
    {
      System.out.println(ae);
    }
    closeconnect();
    return data;
  }

  boolean insertfeedback(String name,String email,String feedback,int rating)
  {
    boolean flag=false;
    connect();
    query="insert into feedback VALUE ('"+name+"','"+email+"','"+feedback+"','"+rating+"');";
    executeUpdate();
    closeconnect();
    flag=true;
    return flag;
  }

  boolean insertcardetails(String chname,String cardno,String cvv)
  {
    boolean flag=false;
    connect();
    query="insert into card VALUE ('"+chname+"','"+cardno+"','"+cvv+"');";
    executeUpdate();
    closeconnect();
    flag=true;
    return flag;
  }

  boolean insertbusdetails(String date2,String date,String source,String destination)
  {
    boolean flag=false;
    int uid=Integer.parseInt(date2);
    connect();
    query="insert into bus VALUE ('"+uid+"','"+date+"','"+source+"','"+destination+"');";
    executeUpdate();
    closeconnect();
    flag=true;
    return flag;
  }

  boolean insertflightdetails(String date4,String date,String type,String returndate,String source,String destination)
  {
    boolean flag=false;
    int uid=Integer.parseInt(date4);
    connect();
    query="insert into flight VALUE ('"+uid+"','"+date+"','"+type+"','"+returndate+"','"+source+"','"+destination+"');";
    executeUpdate();
    closeconnect();
    flag=true;
    return flag;
  }

  boolean inserttraindetails(String date2,String date,String source,String destination,String classw)
  {
    boolean flag=false;
    int uid=Integer.parseInt(date2);
    connect();
    query="insert into train VALUE ('"+uid+"','"+date+"','"+source+"','"+destination+"','"+classw+"');";
    executeUpdate();
    closeconnect();
    flag=true;
    return flag;
  }
}
