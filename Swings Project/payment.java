/*
Payment Screen
Authors : Ashutosh Kumar,Anshul Agrawal
PRN : 19030142006
      19030142009
*/

//importing packages and sub-packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Calendar;

//creating class for the given frame
class Payment extends JFrame implements ActionListener
{
  JTextField text1,text2;
  JPasswordField text3;
  JComboBox cb1,cb2,cb3,cb4;
  JCheckBox one;
  JButton save,reset;

  Payment(){

    Container c= getContentPane();
    c.setBackground(new Color(66, 134, 244));
    c.setLayout(new BorderLayout());

    JPanel centerpanel = new JPanel();
    centerpanel.setLayout(new BorderLayout());

    /*center content*/
    JPanel centerpanel1= new JPanel();
    centerpanel1.setLayout(new BorderLayout());
    centerpanel1.setBackground(new Color(66, 134, 244));
    JLabel select= new JLabel("<html><b><font face=\"Helvetica\">"+"<br>"+"Payment Information"+"<br><br>"+"</font></b></html>");
    select.setFont(new Font("Courier New",Font.BOLD, 26));
    select.setForeground(Color.WHITE);
    centerpanel1.add(select);

    JPanel centerpanel2 = new JPanel();
    centerpanel2.setLayout(new BoxLayout(centerpanel2,BoxLayout.Y_AXIS));


    /* Card Holder Name */
    JPanel cardpanel1= new JPanel();
    cardpanel1.setLayout(new FlowLayout(FlowLayout.LEFT));
    cardpanel1.setBackground(new Color(66, 134, 244));
    JLabel cardholder= new JLabel("<html><b><font face=\"Helvetica\">"+"Card Holder Name"+"<br>"+"</font></b></html>");
    cardholder.setFont(new Font("Courier New",Font.BOLD, 18));
    cardholder.setForeground(Color.WHITE);
    text1= new JTextField(15);

    cardpanel1.add(cardholder);
    cardpanel1.add(text1);

    /* Card Payment Type */
    JPanel cardpanel2= new JPanel();
    cardpanel2.setLayout(new FlowLayout(FlowLayout.LEFT));
    cardpanel2.setBackground(new Color(66, 134, 244));
    JLabel cardtype= new JLabel("<html><b><font face=\"Helvetica\">"+"Card Type"+"<br>"+"</font></b></html>");
    cardtype.setFont(new Font("Courier New",Font.BOLD, 18));
    cardtype.setForeground(Color.WHITE);
    String[] card={"Debit Card","Credit Card"};
    cb1=new JComboBox(card);
    String[] card1={"MasterCard","Visa","Rupay"};
    cb2=new JComboBox(card1);

    cardpanel2.add(cardtype);
    cardpanel2.add(cb1);
    cardpanel2.add(cb2);

    /* Card Number*/
    JPanel cardpanel3= new JPanel();
    cardpanel3.setLayout(new FlowLayout(FlowLayout.LEFT));
    cardpanel3.setBackground(new Color(66, 134, 244));
    JLabel cardnumber= new JLabel("<html><b><font face=\"Helvetica\">"+"Card Number"+"<br>"+"</font></b></html>");
    cardnumber.setFont(new Font("Courier New",Font.BOLD, 18));
    cardnumber.setForeground(Color.WHITE);
    text2= new JTextField(20);

    cardpanel3.add(cardnumber);
    cardpanel3.add(text2);

    /* Date Panel*/
    JPanel cardpanel4= new JPanel();
    cardpanel4.setLayout(new FlowLayout(FlowLayout.LEFT));
    cardpanel4.setBackground(new Color(66, 134, 244));
    JLabel month= new JLabel("<html><b><font face=\"Helvetica\">"+"Month"+"<br>"+"</font></b></html>");
    month.setFont(new Font("Courier New",Font.BOLD, 18));
    month.setForeground(Color.WHITE);
    String[] month1 = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
    cb3=new JComboBox(month1);
    JLabel year= new JLabel("<html><b><font face=\"Helvetica\">"+"Year"+"<br>"+"</font></b></html>");
    year.setFont(new Font("Courier New",Font.BOLD, 18));
    year.setForeground(Color.WHITE);
    String[] year1 = yr();
    cb4 = new JComboBox(year1);

    cardpanel4.add(month);
    cardpanel4.add(cb3);
    cardpanel4.add(year);
    cardpanel4.add(cb4);

    /*CVV Panel*/
    JPanel cardpanel5= new JPanel();
    cardpanel5.setBackground(new Color(66, 134, 244));
    cardpanel5.setLayout(new FlowLayout(FlowLayout.LEFT));
    JLabel cvv= new JLabel("<html><b><font face=\"Helvetica\">"+"CVV"+"<br>"+"</font></b></html>");
    cvv.setFont(new Font("Courier New",Font.BOLD, 18));
    cvv.setForeground(Color.WHITE);
    text3= new JPasswordField(5);

    cardpanel5.add(cvv);
    cardpanel5.add(text3);

    /*Save Panel*/
    JPanel cardpanel6= new JPanel();
    cardpanel6.setBackground(new Color(66, 134, 244));
    cardpanel6.setLayout(new FlowLayout(FlowLayout.LEFT));
    JLabel save1= new JLabel("<html><b><font face=\"Helvetica\">"+"Do you want to save this card"+"<br>"+"</font></b></html>");
    save1.setFont(new Font("Courier New",Font.BOLD, 18));
    save1.setForeground(Color.WHITE);
    one= new JCheckBox();

    cardpanel6.add(save1);
    cardpanel6.add(one);

    /*Buttonpanel*/
    JPanel buttonpanel =new JPanel();
    buttonpanel.setBackground(new Color(66, 134, 244));
    save= new JButton("Make Payment");
    reset= new JButton("Reset");

    buttonpanel.add(save);
    buttonpanel.add(reset);

    centerpanel2.add(cardpanel1);
    centerpanel2.add(cardpanel2);
    centerpanel2.add(cardpanel3);
    centerpanel2.add(cardpanel4);
    centerpanel2.add(cardpanel5);
    centerpanel2.add(cardpanel6);
    centerpanel2.add(buttonpanel);

    centerpanel.add(centerpanel1,BorderLayout.NORTH);
    centerpanel.add(centerpanel2,BorderLayout.WEST);
    centerpanel.setBackground(new Color(66, 134, 244));

    c.add(centerpanel);
    save.addActionListener(this);
    reset.addActionListener(this);
    //c.setBackground(new Color(66, 134, 244));

  }
  public String[] yr() {
      String[] arr = new String[15];
      int yr = Calendar.getInstance().get(Calendar.YEAR);
      int c = 0;
      for (int i = yr; i < yr + 15; i++) {

          arr[c] = Integer.toString(i);
          c++;
      }
      return arr;
  }

  public void actionPerformed(ActionEvent ae)
  {
    String chname="",cvv="",cardno="";
    String combo1="",combo2="",combo3="",combo4="";
    int count=0,rating=0;
    boolean value=false;

    if(ae.getSource()==save)
    {
      if(text1.getText().equals(""))
      {
        JOptionPane.showMessageDialog(this,"Card Holder Name Feild Cannot be Empty");
      }
      else
      {
        count+=1;
        chname=text1.getText();
      }

      if(text2.getText().equals(""))
      {
        JOptionPane.showMessageDialog(this,"Card Number Feild Cannot be Empty");
      }
      else
      {
        cardno=text2.getText();
        if(!(cardno.matches("([0-9]{16})")))
        {
          JOptionPane.showMessageDialog(this,"Invalid Card Number");
        }
        else
        {
          count+=1;
        }
      }

      if(text3.getText().equals(""))
      {
        JOptionPane.showMessageDialog(this,"CVV Feild Cannot be Empty");
      }
      else
      {
        cvv=text3.getText();
        if(cvv.length()>3)
        {
          JOptionPane.showMessageDialog(this,"Invalid CVV");
        }
        else
        {
          if(!(cvv.matches("([0-9]{3})")))
          {
            JOptionPane.showMessageDialog(this,"Invalid CVV");
          }
          else
          {
            count+=1;
          }
        }
      }

      combo1=cb1.getSelectedItem().toString();
      combo2=cb2.getSelectedItem().toString();
      combo3=cb3.getSelectedItem().toString();
      combo4=cb4.getSelectedItem().toString();

      count+=4;

      if(one.isSelected())
      {
        Dbconnect obj=new Dbconnect();
        value=obj.insertcardetails(chname,cardno,cvv);
      }

      if(count>6)
      {
        if(value)
        {
          JOptionPane.showMessageDialog(this,"Payment Intiated ! Thanks for Booking");
          Homepage obj2=new Homepage();
          obj2.setVisible(true);
          obj2.setSize(1366,768);
          this.dispose();
        }
        else
        {
          JOptionPane.showMessageDialog(this,"Server Encountered an Error ! Try again later");
        }
      }
      else
      {
          JOptionPane.showMessageDialog(this,"Form Incomplete");
      }

    }
    else if(ae.getSource()==reset)
    {
      text1.setText(" ");
      text2.setText(" ");
      text3.setText(" ");
    }
  }

  public static void main(String args[]){
    Payment obj= new Payment();
    obj.setVisible(true);
    obj.setSize(1366,768);
    obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
