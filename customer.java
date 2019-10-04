/*
Customer Details Form
Authors : Ashutosh Kumar,Anshul Agrawal
PRN : 19030142006
      19030142009
*/

//importing packages and sub-packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Customer extends JFrame implements ActionListener
{
  //Fields
  JLabel askuseridlabel,fname,lname,phonenumber,emailid,address,gender,country,age,customerhead;
  JPanel emailidpanel,fnamepanel,lnamepanel,phonenumberpanel,emaildpanel,addresspanel,countrypanel,genderpanel,agepanel,headpanel,centerpanel,submitpanel,askpanel,buttonpanel;
  JTextField fname1,lname1,ageno,phonenumbertext,emailidtext,askuserid;
  JButton askbutton,busbutton,trainbutton,flightbutton;

  JTextArea addr;
  JRadioButton male,female;
	ButtonGroup bg;
  JComboBox country1;

  Customer()
    {

      Container container=getContentPane();
      container.setLayout(new BorderLayout());

      //askuserid for auto fill of data
      askpanel=new JPanel();
      askpanel.setBackground(new java.awt.Color(66, 134, 244));
      askuseridlabel=new JLabel("<html><b><font face=\"Helvetica\">"+"Enter User ID:"+"</font></b></html>");
      askuseridlabel.setFont(new Font("Courier New",Font.BOLD, 16));
      askuseridlabel.setForeground(Color.WHITE);
      askbutton=new JButton("Already a Member ?");
      askuserid=new JTextField(10);

      //phone number panels
      phonenumberpanel=new JPanel();
      phonenumberpanel.setBackground(new java.awt.Color(66, 134, 244));
      phonenumbertext=new JTextField(10);
      phonenumber=new JLabel("<html><b><font face=\"Helvetica\">"+"Phone Number: !!"+"</font></b></html>");
      phonenumber.setFont(new Font("Courier New",Font.BOLD, 16));
      phonenumber.setForeground(Color.WHITE);


      //head panel
      headpanel=new JPanel();
      headpanel.setBackground(new java.awt.Color(66, 134, 244));
      customerhead=new JLabel("<html><b><font face=\"Helvetica\">"+"Welcome ! Book Your Journey now !!"+"</font></b></html>");
      customerhead.setFont(new Font("Courier New",Font.BOLD, 24));
      customerhead.setForeground(Color.WHITE);

      //cent  er panel
      centerpanel=new JPanel();
      centerpanel.setBackground(new java.awt.Color(66, 134, 244));
      centerpanel.setLayout(new BoxLayout(centerpanel,BoxLayout.Y_AXIS));

      //Name panels
      fnamepanel=new JPanel();
      fnamepanel.setBackground(new java.awt.Color(66, 134, 244));
      lnamepanel=new JPanel();
      lnamepanel.setBackground(new java.awt.Color(66, 134, 244));
      fname=new JLabel("<html><b><font face=\"Helvetica\">"+"First Name: "+"</font></b></html>");
      fname.setFont(new Font("Courier New",Font.BOLD, 16));
      fname.setForeground(Color.WHITE);
      lname=new JLabel("<html><b><font face=\"Helvetica\">"+"Last Name: "+"</font></b></html>");
      lname.setFont(new Font("Courier New",Font.BOLD, 16));
      lname.setForeground(Color.WHITE);
      fname1=new JTextField(10);
      lname1=new JTextField(10);

      //agepanel
      agepanel=new JPanel();
      agepanel.setBackground(new java.awt.Color(66, 134, 244));
      age=new JLabel("<html><b><font face=\"Helvetica\">"+"Age: "+"</font></b></html>");
      age.setFont(new Font("Courier New",Font.BOLD, 16));
      age.setForeground(Color.WHITE);
      ageno=new JTextField(10);

      //Address panel
      addresspanel=new JPanel();
      addresspanel.setBackground(new java.awt.Color(66, 134, 244));
      address=new JLabel("<html><b><font face=\"Helvetica\">"+"Address: "+"</font></b></html>");
      address.setFont(new Font("Courier New",Font.BOLD, 16));
      address.setForeground(Color.WHITE);
      addr=new JTextArea(4,20);
      JScrollPane scroll= new JScrollPane(addr);

      //Country Panel
      countrypanel=new JPanel();
      countrypanel.setBackground(new java.awt.Color(66, 134, 244));
      country=new JLabel("<html><b><font face=\"Helvetica\">"+"Country: "+"</font></b></html>");
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
      female.setActionCommand("Female");
      female.setBackground(new java.awt.Color(66, 134, 244));
      bg=new ButtonGroup();

      //Email id panel
      emailidpanel=new JPanel();
      emailidpanel.setBackground(new java.awt.Color(66, 134, 244));
      emailid=new JLabel("<html><b><font face=\"Helvetica\">"+"Email ID: "+"</font></b></html>");
      emailid.setFont(new Font("Courier New",Font.BOLD, 16));
      emailid.setForeground(Color.WHITE);
      emailidtext=new JTextField(10);

      //Button panel
      buttonpanel=new JPanel();
      buttonpanel.setBackground(new java.awt.Color(66, 134, 244));
      busbutton=new JButton("Bus");
      flightbutton=new JButton("Flight");
      trainbutton=new JButton("Train");

      country1.addItem("");
      country1.addItem("India");
      country1.addItem("Australia");
      country1.addItem("Russia");
      country1.addItem("USA");

      bg.add(male);
      bg.add(female);

      //add elements
      headpanel.add(customerhead);

      //phonenumber
      phonenumberpanel.add(phonenumber);
      phonenumberpanel.add(phonenumbertext);

      //askpanel
      askpanel.add(askuseridlabel);
      askpanel.add(askuserid);
      askpanel.add(askbutton);

      //email id
      emailidpanel.add(emailid);
      emailidpanel.add(emailidtext);

      fnamepanel.add(fname);
      fnamepanel.add(fname1);
      lnamepanel.add(lname);
      lnamepanel.add(lname1);

      agepanel.add(age);
      agepanel.add(ageno);

      buttonpanel.add(busbutton);
      buttonpanel.add(trainbutton);
      buttonpanel.add(flightbutton);

      addresspanel.add(address);
			addresspanel.add(scroll);

			genderpanel.add(gender);
			genderpanel.add(male);
			genderpanel.add(female);

			countrypanel.add(country);
			countrypanel.add(country1);

      centerpanel.add(headpanel);
      centerpanel.add(askpanel);
      centerpanel.add(fnamepanel);
      centerpanel.add(lnamepanel);
      centerpanel.add(agepanel);
      centerpanel.add(emailidpanel);
      centerpanel.add(phonenumberpanel);
      centerpanel.add(addresspanel);
			centerpanel.add(genderpanel);
			centerpanel.add(countrypanel);
      centerpanel.add(buttonpanel);

      container.add(centerpanel);
      //container.setBackground(new java.awt.Color(66, 134, 244));


      busbutton.addActionListener(this);
      flightbutton.addActionListener(this);
      trainbutton.addActionListener(this);
      askbutton.addActionListener(this);
      female.setSelected(true);
    }

    int flag=0,idto=0;
    public void actionPerformed(ActionEvent ae)
    {
          boolean value=false;
          Dbconnect obj=new Dbconnect();
          if(ae.getSource()==askbutton)
          {
              int x=0;
              String data[];
              int id=Integer.parseInt(askuserid.getText());

              data=obj.returndata(id);
              if(data[0]==null)
              {
                JOptionPane.showMessageDialog(this,"Invalid id");
              }
              else
              {
                flag=1;
                idto=id;
                x+=1;
                fname1.setText(data[x]);
                x+=1;
                lname1.setText(data[x]);
                x+=1;
                ageno.setText(data[x].trim());
                x+=1;
                addr.setText(data[x]);
                x+=1;
                if(data[x].equals("M"))
                {
                  male.setSelected(true);
                }
                else
                {
                  female.setSelected(true);
                }
                x+=1;
                country1.setSelectedItem(data[x]);
                x+=1;
                phonenumbertext.setText(data[x]);
                x+=1;
                emailidtext.setText(data[x]);
              }

          }

          else if(ae.getSource()==busbutton || ae.getSource()==trainbutton || ae.getSource()==flightbutton)
          {
            String fname2="",lname2="",age2="",username2="",password2="",address="",country2="",email2="",phone2="";
            char gender2='S';
            int count=0;

            if(fname1.getText().equals(""))
            {
              JOptionPane.showMessageDialog(this,"Enter Name field");
            }
            else
            {
              fname2=fname1.getText();
              count+=1;
            }

            if(lname1.getText().equals(""))
            {
              JOptionPane.showMessageDialog(this,"Enter Name field");
            }
            else
            {
              lname2=lname1.getText();
              count+=1;
            }

            if(ageno.getText().equals(""))
            {
              JOptionPane.showMessageDialog(this,"Enter Age field");
            }
            else
            {
              age2=ageno.getText();
              count+=1;
            }

            if(addr.getText().equals(""))
            {
              JOptionPane.showMessageDialog(this,"Enter Address field");
            }
            else
            {
              address=addr.getText();
              count+=1;
            }

            if(emailidtext.getText().equals(""))
            {
              JOptionPane.showMessageDialog(this,"Enter Address field");
            }
            else
            {
              email2=emailidtext.getText();
              count+=1;
            }

            if(phonenumbertext.getText().equals(""))
            {
              JOptionPane.showMessageDialog(this,"Enter Address field");
            }
            else
            {
              phone2=phonenumbertext.getText();
              count+=1;
            }

            country2=country1.getSelectedItem().toString();
            count+=1;

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

            if(flag==1)
            {
              String arr[]=new String[2];
              arr=obj.returnuserdetails(idto);
              username2=arr[0];
              password2=arr[1];
              System.out.println(arr[0]);
              System.out.println(arr[1]);
            }

            if(count>7)
            {
                value=obj.insertdata2(username2,password2,fname2,lname2,age2,address,gender2,country2,phone2,email2);
                if(value)
                {
                    System.out.println("Data inserted Successfully");
                    JOptionPane.showMessageDialog(this,"Congrats");
                    if(ae.getSource()==busbutton)
                    {
                      bus obj3=new bus();
                      obj3.setVisible(true);
                      obj3.setSize(1366,768);
                      this.dispose();
                    }
                    else if(ae.getSource()==trainbutton)
                    {
                      Train obj4=new Train();
                      obj4.setVisible(true);
                      obj4.setSize(1366,768);
                      this.dispose();
                    }
                    else if(ae.getSource()==flightbutton)
                    {
                      flights obj5=new flights();
                      obj5.setVisible(true);
                      obj5.setSize(1366,768);
                      this.dispose();
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Server Error ! Try again later");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Form not completely filled");
            }

          }
        }

    public static void main(String[] args)
    {
        Customer obj=new Customer();
        obj.setVisible(true);
        obj.setSize(1366,768);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
