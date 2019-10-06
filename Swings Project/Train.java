/* Tours Project
Authors : Ashutosh Kumar,Anshul Agrawal
PRN : 19030142006
      19030142009
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//creating class for the given frame
class Train extends JFrame implements ActionListener
{
  //Fields and panels required
  JTextField text1,text3;
  JComboBox cb,cb1,cb2;
  JButton submit,rest;

  Train(){
    /* Content starts here*/

    /*heading*/
      Container con= getContentPane();
      con.setLayout(new BorderLayout());

      JPanel centerpanel=new JPanel();
      centerpanel.setLayout(new BorderLayout());
      centerpanel.setBackground(Color.WHITE);

      /* head panel start*/
      JPanel headpanel=new JPanel();
      headpanel.setLayout(new BorderLayout());

      /* Name */
      JLabel head=new JLabel("<html><b><font size=20 face=\"Helvetica\">"+"Tours and Travellers "+"</font></b></html>");
      head.setFont(new Font("Courier New",Font.BOLD, 14));
      head.setForeground(Color.WHITE);


      headpanel.add(head);
      headpanel.setBackground(new java.awt.Color(66, 134, 244));
      centerpanel.add(headpanel);
      /*heading end*/

      /*center content*/
      JPanel centerpanel1= new JPanel();
      centerpanel1.setLayout(new BorderLayout());

      JLabel select= new JLabel("<html><b><font face=\"Helvetica\">"+"<br>"+"Book Train Tickets Online"+"<br><br>"+"</font></b></html>");
      select.setFont(new Font("Courier New",Font.BOLD, 24));

      JPanel radios= new JPanel();
      radios.setLayout(new FlowLayout());


      JPanel loc= new JPanel();
      loc.setLayout(new FlowLayout());

      // loc.setPreferredSize(new Dimension(700, 200));
      // loc.setBackground(new java.awt.Color(66, 134, 244));
      JLabel username= new JLabel("<html><b><font face=\"Helvetica\">"+"Enter User ID:"+"</font></b></html>");
      username.setFont(new Font("Courier New",Font.BOLD, 16));
      text3= new JTextField(10);
      JLabel source= new JLabel("<html><b><font face=\"Helvetica\">"+"From"+"</font></b></html>");
      source.setFont(new Font("Courier New",Font.BOLD, 16));
      String state[]={"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat",
                        "Haryana","Himachal Pradesh","Jammu & Kashmir","Jharkhand","Karnataka","Kerala","Madhya Pradesh",
                        "Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan",
                        "Sikkim","Tamil Nadu","Tripura","Uttarakhand","Uttar Pradesh","West Bengal"};
      cb=new JComboBox(state);
      JLabel dest= new JLabel("<html><b><font face=\"Helvetica\">"+"To"+"</font></b></html>");
      dest.setFont(new Font("Courier New",Font.BOLD, 16));
      String  state1[]={"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat",
                        "Haryana","Himachal Pradesh","Jammu & Kashmir","Jharkhand","Karnataka","Kerala","Madhya Pradesh",
                        "Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan",
                        "Sikkim","Tamil Nadu","Tripura","Uttarakhand","Uttar Pradesh","West Bengal"};
      cb1=new JComboBox(state);
      //Date
      JLabel date_select= new JLabel("<html><b><font face=\"Helvetica\">"+"Date"+"</font></b></html>");
      date_select.setFont(new Font("Courier New",Font.BOLD, 16));
      text1= new JTextField(10);

      JLabel classes= new JLabel("<html><b><font face=\"Helvetica\">"+"Class"+"</font></b></html>");
      classes.setFont(new Font("Courier New",Font.BOLD, 16));
      String class1_train[]={"AC Three Tier (3A)","AC Two Tier (2A)","AC First Tier (1A)","AC Chair Car (CC)","Sleeper (SL)","Second Sitting (2S)"};
      cb2=new JComboBox(class1_train);

      submit= new JButton("Submit");
      rest= new JButton("Reset");

      loc.add(username);
      loc.add(text3);
      loc.add(source);
      loc.add(cb);
      loc.add(dest);
      loc.add(cb1);
      loc.add(date_select);
      loc.add(text1);
      loc.add(classes);
      loc.add(cb2);
      loc.add(submit);
      loc.add(rest);

      /*centerpanel ends here*/
      JPanel imagepanel= new JPanel();
      JLabel img= new JLabel("");
      ImageIcon packageIcon = new ImageIcon(new ImageIcon("/home/ashu/Desktop/Programming/Java/Project/Images/2.jpg").getImage().getScaledInstance(1366, 450, Image.SCALE_DEFAULT));
      img.setIcon(packageIcon);
      imagepanel.add(img);



      centerpanel1.add(select,BorderLayout.NORTH);
      centerpanel1.add(loc,BorderLayout.WEST);
      centerpanel1.add(imagepanel,BorderLayout.SOUTH);

      /*center content ends*/

      /*footer panel*/
      JPanel bottompanel= new JPanel();
      bottompanel.setLayout(new BorderLayout());
      bottompanel.setBackground(new java.awt.Color(66, 134, 244));

      /* Social Links*/
      JLabel follow= new JLabel("Follow Us:");
      JLabel fb= new JLabel();
  	  JLabel tw= new JLabel();
  		JLabel insta= new JLabel();
  		JLabel pint= new JLabel();

      JPanel menulinks= new JPanel();
      menulinks.setBackground(new java.awt.Color(66, 134, 244));
  		fb.setIcon(new ImageIcon("/home/ashu/Desktop/Programming/Java/Project/Images/facebook.png"));
  		tw.setIcon(new ImageIcon("/home/ashu/Desktop/Programming/Java/Project/Images/twitter.png"));
  		insta.setIcon(new ImageIcon("/home/ashu/Desktop/Programming/Java/Project/Images/instagram.png"));
  		pint.setIcon(new ImageIcon("/home/ashu/Desktop/Programming/Java/Project/Images/pinterest.png"));

  		menulinks.add(fb);
  		menulinks.add(tw);
  		menulinks.add(insta);
  		menulinks.add(pint);

      /*Social Links ends here*/

      /*Contact labels*/
      JLabel contact_info =new JLabel("<html>"+"<font color=\"black\">"+"Contact Us:"+"<br>"+"Email :name@gmail.com"+"<br>"+
                        "Address :SICSR,PUNE"+"<br>"+"Phone :123456789"+"</font></html>");
      contact_info.setFont(new Font("Courier New",Font.BOLD, 14));

      /*footerpanel ends*/

      bottompanel.add(follow,BorderLayout.NORTH);
  		bottompanel.add(menulinks,BorderLayout.WEST);
      bottompanel.add(contact_info,BorderLayout.EAST);

      /*Bottompanel ends here*/

    /* Content ends here */

      con.add(centerpanel,BorderLayout.NORTH);
      con.add(centerpanel1,BorderLayout.CENTER);
      con.add(bottompanel,BorderLayout.SOUTH);

      submit.addActionListener(this);
      rest.addActionListener(this);
  }

  public void actionPerformed(ActionEvent ae)
  {
    String source="",destination="",classw="";
    if(ae.getSource()==submit)
    {
      source=cb.getSelectedItem().toString();
      destination=cb1.getSelectedItem().toString();
      classw=cb2.getSelectedItem().toString();
      if(source.equalsIgnoreCase(destination))
      {
        JOptionPane.showMessageDialog(this,"Source and Destinations cannot be Same");
      }
      else
      {
        String date="";
        String date2=text3.getText();
        if(text3.getText().equals("") || (!(date2.matches("([0-9])"))))
        {
          JOptionPane.showMessageDialog(this,"Enter User ID or Invalid User ID");
        }
        else
        {
          if(text1.getText().equals(""))
          {
            JOptionPane.showMessageDialog(this,"Date Feild Empty");
          }
          else
          {
              date=text1.getText();
              boolean checkFormat;
              if (date.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})"))
                  checkFormat=true;
              else
                  checkFormat=false;

              if(checkFormat)
                {
                  boolean value=false;
                  Dbconnect obj=new Dbconnect();
                  value=obj.inserttraindetails(date2,date,source,destination,classw);
                  if(value)
                  {
                  JOptionPane.showMessageDialog(this,"Going for Payment");
                  Payment obj2=new Payment();
                  obj2.setVisible(true);
                  obj2.setSize(1366,768);
                  }
                  else
                  {
                    JOptionPane.showMessageDialog(this,"Server Error ! Retry Later");
                  }
               }
              else
                {
                  JOptionPane.showMessageDialog(this,"Invalid Data");
                }
          }
        }//else closing
      }//top else closing
    }//submit button if

    else if(ae.getSource()==rest)
    {
      text1.setText(" ");
      cb.setSelectedItem("Andhra Pradesh");
      cb1.setSelectedItem("Andhra Pradesh");
    }
  }

  public static void main(String args[]){
    Train obj= new Train();
    obj.setVisible(true);
    obj.setSize(1366,768);
    obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
