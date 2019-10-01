/*
Login Screen
Authors : Ashutosh Kumar,Anshul Agrawal
PRN : 19030142006
      19030142009
*/

//importing packages and sub-packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//creating class for the given frame
class Admin extends JFrame implements ActionListener
{
  //Fields and panels required
  JLabel loginhead,login,password,notauser;
  JPanel  headpanel,centerpanel,loginpanel,passwordpanel,notauserpanel,buttonpanel;
  JTextField loginname;
  JButton loginbutton,signup;
  JPasswordField pass;

  //constructor for creating frame
  Admin()
    {
      Container container=getContentPane();
      container.setLayout(new BorderLayout());

      //head panel
      headpanel=new JPanel();
      headpanel.setBackground(new java.awt.Color(66, 134, 244));
      loginhead=new JLabel("<html><b><font face=\"Helvetica\">"+"Welcome ! Login"+"</font></b></html>");
      loginhead.setFont(new Font("Courier New",Font.BOLD, 24));
      loginhead.setForeground(Color.WHITE);

      //center panel
      centerpanel=new JPanel();
      centerpanel.setBackground(new java.awt.Color(66, 134, 244));
      centerpanel.setLayout(new BoxLayout(centerpanel,BoxLayout.Y_AXIS));

      //Login panel
      loginpanel=new JPanel();
      loginpanel.setBackground(new java.awt.Color(66, 134, 244));
      login=new JLabel("<html><b><font face=\"Helvetica\">"+"Admin Username: "+"</font></b></html>");
      login.setFont(new Font("Courier New",Font.BOLD, 16));
      login.setForeground(Color.WHITE);
      loginname=new JTextField(10);

      //Password panel
      passwordpanel=new JPanel();
      passwordpanel.setBackground(new java.awt.Color(66, 134, 244));
      password=new JLabel("<html><b><font face=\"Helvetica\">"+"Admin Password: "+"</font></b></html>");
      password.setFont(new Font("Courier New",Font.BOLD, 16));
      password.setForeground(Color.WHITE);
      pass=new JPasswordField(10);


      //Button panel
      buttonpanel=new JPanel();
      buttonpanel.setBackground(new java.awt.Color(66, 134, 244));
      loginbutton=new JButton("Login");

      //adding elements to the panel
      headpanel.add(loginhead);

      loginpanel.add(login);
      loginpanel.add(loginname);

      passwordpanel.add(password);
      passwordpanel.add(pass);


      buttonpanel.add(loginbutton);

      centerpanel.add(headpanel);
      centerpanel.add(loginpanel);
      centerpanel.add(passwordpanel);
      centerpanel.add(buttonpanel);

      container.add(centerpanel);

      //adding ActionListener
      loginbutton.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae)
    {
          String uname="",password="";
          boolean value=false;
          int count=0;
          Dbconnect obj2=new Dbconnect();

          if(ae.getSource()==loginbutton)
          {
              //login text
              if(loginname.getText().equals(""))
              {
                JOptionPane.showMessageDialog(this,"Enter Login Username");
              }
              else
              {
                  uname=loginname.getText();
                  count+=1;
              }

              //password
              if(pass.getText().equals(""))
              {
                JOptionPane.showMessageDialog(this,"Enter Password");
              }
              else
              {
                  password=pass.getText();
                  count+=1;
              }

              //count for login
              if(count>1)
              {
                value=obj2.checkadmin(uname,password);
                if(value)
                {
                  this.dispose();
                  System.out.println("Login Successful");
                  System.out.println(uname+" "+password);
                  //Homescreen obj2=new Homescreen();
                }
                else
                {
                  System.out.println("Login Unsuccessfull");
                  JOptionPane.showMessageDialog(this,"Invalid Credentials");
                }
              }
          }
    }

    static Admin obj;
    public static void main(String[] args)
    {
        obj=new Admin();
        obj.setVisible(true);
        obj.setSize(1366,768);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
