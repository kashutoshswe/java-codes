/*
Signup Screen
Authors : Ashutosh Kumar,Anshul Agrawal
PRN : 19030142006
      19030142009
*/

//importing packages and sub-packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Signup extends JFrame implements ActionListener
{
  //Fields
  JLabel signuphead,signup,password,address,gender,country,fname,lname,age;
  JPanel  fnamepanel,lnamepanel,agepanel,headpanel,centerpanel,signuppanel,passwordpanel,logininasguestpanel,buttonpanel,addresspanel,countrypanel,genderpanel;
  JTextField signupname,fname1,lname1,ageno;
  JButton loginbutton,signupbutton,loginbackbutton;
  JPasswordField pass;

  JTextArea addr;
  JRadioButton male,female;
	ButtonGroup bg;
  JComboBox country1;

  Signup()
    {
      Container container=getContentPane();
      container.setLayout(new BorderLayout());

      //head panel
      headpanel=new JPanel();
      headpanel.setBackground(new java.awt.Color(66, 134, 244));
      signuphead=new JLabel("<html><b><font face=\"Helvetica\">"+"Welcome ! Signup"+"</font></b></html>");
      signuphead.setFont(new Font("Courier New",Font.BOLD, 24));
      signuphead.setForeground(Color.WHITE);

      //center panel
      centerpanel=new JPanel();
      centerpanel.setBackground(new java.awt.Color(66, 134, 244));
      centerpanel.setLayout(new BoxLayout(centerpanel,BoxLayout.Y_AXIS));

      //Name panels
      fnamepanel=new JPanel();
      fnamepanel.setBackground(new java.awt.Color(66, 134, 244));
      lnamepanel=new JPanel();
      lnamepanel.setBackground(new java.awt.Color(66, 134, 244));
      fname=new JLabel("<html><b><font face=\"Helvetica\">"+"First Name :"+"</font></b></html>");
      fname.setFont(new Font("Courier New",Font.BOLD, 16));
      fname.setForeground(Color.WHITE);
      lname=new JLabel("<html><b><font face=\"Helvetica\">"+"Last Name :"+"</font></b></html>");
      lname.setFont(new Font("Courier New",Font.BOLD, 16));
      lname.setForeground(Color.WHITE);
      fname1=new JTextField(10);
      lname1=new JTextField(10);

      //agepanel
      agepanel=new JPanel();
      agepanel.setBackground(new java.awt.Color(66, 134, 244));
      age=new JLabel("<html><b><font face=\"Helvetica\">"+"Age :"+"</font></b></html>");
      age.setFont(new Font("Courier New",Font.BOLD, 16));
      age.setForeground(Color.WHITE);
      ageno=new JTextField(10);

      //Signup panel
      signuppanel=new JPanel();
      signuppanel.setBackground(new java.awt.Color(66, 134, 244));
      signup=new JLabel("<html><b><font face=\"Helvetica\">"+"Username :"+"</font></b></html>");
      signup.setFont(new Font("Courier New",Font.BOLD, 16));
      signup.setForeground(Color.WHITE);
      signupname=new JTextField(10);

      //Password panel
      passwordpanel=new JPanel();
      passwordpanel.setBackground(new java.awt.Color(66, 134, 244));
      password=new JLabel("<html><b><font face=\"Helvetica\">"+"Password :"+"</font></b></html>");
      password.setFont(new Font("Courier New",Font.BOLD, 16));
      password.setForeground(Color.WHITE);
      pass=new JPasswordField(10);

      //Address panel
      addresspanel=new JPanel();
      addresspanel.setBackground(new java.awt.Color(66, 134, 244));
      address=new JLabel("<html><b><font face=\"Helvetica\">"+"Address :"+"</font></b></html>");
      address.setFont(new Font("Courier New",Font.BOLD, 16));
      address.setForeground(Color.WHITE);
      addr=new JTextArea(4,20);
      JScrollPane scroll= new JScrollPane(addr);

      //Country Panel
      countrypanel=new JPanel();
      countrypanel.setBackground(new java.awt.Color(66, 134, 244));
      country=new JLabel("<html><b><font face=\"Helvetica\">"+"Country :"+"</font></b></html>");
      country.setFont(new Font("Courier New",Font.BOLD, 16));
      country.setForeground(Color.WHITE);
      country1=new JComboBox();

      //Gender panel
      genderpanel=new JPanel();
      genderpanel.setBackground(new java.awt.Color(66, 134, 244));
      gender=new JLabel("Gender");
      gender.setForeground(Color.WHITE);
      male=new JRadioButton("Male");
      male.setForeground(Color.WHITE);
      male.setBackground(new java.awt.Color(66, 134, 244));
      male.setActionCommand("Male");
      female=new JRadioButton("Female");
      female.setForeground(Color.WHITE);
      female.setBackground(new java.awt.Color(66, 134, 244));
      female.setActionCommand("Female");
      bg=new ButtonGroup();
      //logininasguest Panel

      logininasguestpanel=new JPanel();
      logininasguestpanel.setBackground(new java.awt.Color(66, 134, 244));


      //Button panel
      buttonpanel=new JPanel();
      buttonpanel.setBackground(new java.awt.Color(66, 134, 244));
      signupbutton=new JButton("Create Account");
      loginbutton=new JButton("Log in as Guest");
      loginbackbutton=new JButton("Login");

      country1.addItem("India");
      country1.addItem("Australia");
      country1.addItem("Russia");
      country1.addItem("USA");

      bg.add(male);
      bg.add(female);

      //add elements
      headpanel.add(signuphead);

      fnamepanel.add(fname);
      fnamepanel.add(fname1);
      lnamepanel.add(lname);
      lnamepanel.add(lname1);

      agepanel.add(age);
      agepanel.add(ageno);

      signuppanel.add(signup);
      signuppanel.add(signupname);

      passwordpanel.add(password);
      passwordpanel.add(pass);

      logininasguestpanel.add(loginbutton);

      buttonpanel.add(signupbutton);
      buttonpanel.add(loginbackbutton);

      addresspanel.add(address);
			addresspanel.add(scroll);

			genderpanel.add(gender);
			genderpanel.add(male);
			genderpanel.add(female);

			countrypanel.add(country);
			countrypanel.add(country1);

      centerpanel.add(headpanel);
      centerpanel.add(fnamepanel);
      centerpanel.add(lnamepanel);
      centerpanel.add(agepanel);
      centerpanel.add(signuppanel);
      centerpanel.add(passwordpanel);
      centerpanel.add(addresspanel);
			centerpanel.add(genderpanel);
			centerpanel.add(countrypanel);
      centerpanel.add(buttonpanel);
      centerpanel.add(logininasguestpanel);

      container.add(centerpanel);

      signupbutton.addActionListener(this);
      loginbutton.addActionListener(this);
      loginbackbutton.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae)
    {
          String fname2="",lname2="",age2="",username2="",password2="",address="",country2="";
          char gender2='S';
          boolean value=false;
          int count=0;

          if(ae.getSource()==signupbutton)
          {

              if(fname1.getText().equals(""))
              {
                JOptionPane.showMessageDialog(this,"Enter Name Feild");
              }
              else
              {
                fname2=fname1.getText();
                count+=1;
              }

              if(lname1.getText().equals(""))
              {
                JOptionPane.showMessageDialog(this,"Enter Name Feild");
              }
              else
              {
                lname2=lname1.getText();
                count+=1;
              }

              if(ageno.getText().equals(""))
              {
                JOptionPane.showMessageDialog(this,"Enter Age Feild");
              }
              else
              {
                age2=ageno.getText();
                count+=1;
              }

              if(signupname.getText().equals(""))
              {
                JOptionPane.showMessageDialog(this,"Enter Username Feild");
              }
              else
              {
                username2=signupname.getText();
                count+=1;
              }

              if(pass.getText().equals(""))
              {
                JOptionPane.showMessageDialog(this,"Enter Password Feild");
              }
              else
              {
                password2=pass.getText();
                count+=1;
              }

              if(addr.getText().equals(""))
              {
                JOptionPane.showMessageDialog(this,"Enter Address Feild");
              }
              else
              {
                address=addr.getText();
                count+=1;
              }

              country2=country1.getSelectedItem().toString();
              count+=1;

              String email2="default@gmail.com",phno="110101";

              if(bg.getSelection().getActionCommand()=="Male")
              {
                gender2='M';
                count+=1;
              }
              else
              {
                gender2='F';
                count+=1;
              }

            if(count>7)
            {
              Dbconnect obj2=new Dbconnect();
              value=obj2.insertdata(username2,password2,fname2,lname2,age2,address,gender2,country2,phno,email2);
              if(value)
              {
                System.out.println("Data inserted Successfully");
                this.dispose();
                JOptionPane.showMessageDialog(this,"Welcome to Our World !");
                Login obj3=new Login();
                obj3.setVisible(true);
                obj3.setSize(1366,768);
                this.dispose();
              }
              else
              {
                JOptionPane.showMessageDialog(this,"Account cannot be created !");
              }
            }

            else
            {
              JOptionPane.showMessageDialog(this,"Form Incomplete");
            }

          }//if for signupbutton

          else if(ae.getSource()==loginbackbutton)
          {
            Login obj2=new Login();
            obj2.setVisible(true);
            obj2.setSize(1366,768);
            this.dispose();
          }

          else if(ae.getSource()==loginbutton)
          {
            Offer obj=new Offer();
            obj.setVisible(true);
            obj.setSize(1366,768);
            this.dispose();
          }
    }

    static Signup obj;
    public static void main(String[] args)
    {
        obj=new Signup();
        obj.setVisible(true);
        obj.setSize(1366,768);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
