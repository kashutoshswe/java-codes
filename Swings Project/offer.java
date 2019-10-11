/*
Offer Details Page
Authors : Ashutosh Kumar,Anshul Agrawal
PRN : 19030142006
      19030142009
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class Offer extends JFrame implements ActionListener
{

  int haps=3,snaps=3;
  JTextField text1;
  JButton submit,reset;

  Offer()
  {
    Container con= getContentPane();
    con.setLayout(new BorderLayout());
    /* Heading*/

    JPanel headpanel= new JPanel();
    headpanel.setBackground(new java.awt.Color(66, 134, 244));
    JLabel heading= new JLabel("Offers",JLabel.CENTER);

    // heading.setForeground(Color.WHITE);
    heading.setFont(heading.getFont().deriveFont(50.0f));
    headpanel.add(heading);
    /* Heading ends here*/

    /*Buttons*/
    JPanel buttonpanel =new JPanel(new FlowLayout());
    buttonpanel.setBackground(new java.awt.Color(66, 134, 244));
    JLabel package_offer= new JLabel("Enter the Offer Name:");
    package_offer.setFont(heading.getFont().deriveFont(20.0f));
    text1= new JTextField(10);
    submit =new JButton("Submit");
    reset= new JButton("Reset");

    /*Image Grid begin here*/
    ImageIcon offerIcon;
    String imgpath="";
    JPanel centerpanel = new JPanel(new GridLayout(haps,snaps,20,8));
    JLabel labels[] = new JLabel[(haps*snaps)];

    System.out.println("Aaya");

    for (int i = 0; i < haps*snaps; i++)
    {
      imgpath="/home/akumar/Desktop/SICSR/Programming/Java/Java Sem 4/Project  J/Images"+i+".jpg";
      offerIcon= new ImageIcon(new ImageIcon(imgpath).getImage().getScaledInstance(400, 180, Image.SCALE_DEFAULT));
      labels[i] = new JLabel(offerIcon,JLabel.CENTER);
      centerpanel.add(labels[i]);
    }

    /*Image Grid closes here*/

    buttonpanel.add(package_offer);
    buttonpanel.add(text1);
    buttonpanel.add(submit);
    buttonpanel.add(reset);
    /*buttonpanel ends here*/

    con.add(headpanel,BorderLayout.NORTH);
    con.add(centerpanel,BorderLayout.CENTER);
    con.add(buttonpanel,BorderLayout.SOUTH);
    con.setBackground(new java.awt.Color(66, 134, 244));

    submit.addActionListener(this);
    reset.addActionListener(this);
  }


  public void actionPerformed(ActionEvent ae)
  {
    String offerno="";
    if(ae.getSource()==submit)
    {
      if(text1.getText().equals(""))
      {
          JOptionPane.showMessageDialog(this,"Enter Offer Number");
      }
      else
      {
        offerno=text1.getText();
        Customer obj=new Customer();
        obj.setVisible(true);
        obj.setSize(1366,768);
        this.dispose();
      }
    }
    else
    {
        text1.setText(" ");
    }
  }

  public static void main(String args[])
  {
    Offer obj= new Offer();
    obj.setVisible(true);
    obj.setSize(1366,768);
    obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
