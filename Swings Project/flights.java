/* Tours Project
Authors : Ashutosh Kumar,Anshul Agrawal
PRN : 19030142006
      19030142009
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//creating class for the given frame
class flights extends JFrame implements ActionListener
{
  //Fields and panels required
  JButton submit,rest;
  JComboBox cb,cb1;
  JTextField text1,text2,text3;
  JRadioButton one_way,round_trip;
  ButtonGroup bg;
  JLabel date_select1;

  flights(){
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

      JLabel select= new JLabel("<html><b><font face=\"Helvetica\">"+"<br>"+"Book Domestic Fight Tickets"+"<br><br>"+"</font></b></html>");
      select.setFont(new Font("Courier New",Font.BOLD, 24));


       JPanel loc0= new JPanel();
       loc0.setLayout(new BorderLayout());

      JPanel radios= new JPanel();
      radios.setLayout(new FlowLayout());


      one_way= new JRadioButton("One way");
      round_trip= new JRadioButton("Round trip");
      bg= new ButtonGroup();
      bg.add(one_way);
      bg.add(round_trip);
      radios.add(one_way);
      radios.add(round_trip);

      one_way.setActionCommand("One");
      round_trip.setActionCommand("Two");


      JPanel loc1= new JPanel();
      loc1.setLayout(new FlowLayout(FlowLayout.LEFT));
      JLabel username= new JLabel("<html><b><font face=\"Helvetica\">"+"Enter UserID:"+"</font></b></html>");
      username.setFont(new Font("Courier New",Font.BOLD, 16));
      text3= new JTextField(10);

      loc1.add(username);
      loc1.add(text3);

      JPanel loc= new JPanel();
      loc.setLayout(new FlowLayout());
      // loc.setPreferredSize(new Dimension(700, 200));
      // loc.setBackground(new java.awt.Color(66, 134, 244));

      JLabel source= new JLabel("<html><b><font face=\"Helvetica\">"+"From"+"</font></b></html>");
      source.setFont(new Font("Courier New",Font.BOLD, 16));
      String state[]={"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat",
                        "Haryana","Himachal Pradesh","Jammu & Kashmir","Jharkhand","Karnataka","Kerala","Madhya Pradesh",
                        "Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan",
                        "Sikkim","Tamil Nadu","Tripura","Uttarakhand","Uttar Pradesh","West Bengal"};
      cb=new JComboBox(state);
      JLabel dest= new JLabel("<html><b><font face=\"Helvetica\">"+"To"+"</font></b></html>");
      dest.setFont(new Font("Courier New",Font.BOLD, 16));
      String state1[]={"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat",
                        "Haryana","Himachal Pradesh","Jammu & Kashmir","Jharkhand","Karnataka","Kerala","Madhya Pradesh",
                        "Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan",
                        "Sikkim","Tamil Nadu","Tripura","Uttarakhand","Uttar Pradesh","West Bengal"};
      cb1=new JComboBox(state);
      //Date
      JLabel date_select= new JLabel("<html><b><font face=\"Helvetica\">"+"Depart"+"</font></b></html>");
      date_select.setFont(new Font("Courier New",Font.BOLD, 16));
      text1= new JTextField(10);
      date_select1= new JLabel("<html><b><font face=\"Helvetica\">"+"Return Date"+"</font></b></html>");
      date_select1.setFont(new Font("Courier New",Font.BOLD, 16));
      text2= new JTextField(10);

      submit= new JButton("Submit");
      rest= new JButton("Reset");

      loc.add(radios);
      // loc.add(username);
      // loc.add(text3);
      loc.add(source);
      loc.add(cb);
      loc.add(dest);
      loc.add(cb1);
      loc.add(date_select);
      loc.add(text1);
      loc.add(date_select1);
      loc.add(text2);
      loc.add(submit);
      loc.add(rest);

      loc0.add(loc1,BorderLayout.NORTH);
      loc0.add(loc,BorderLayout.WEST);

      JPanel imagepanel= new JPanel();
      JLabel img= new JLabel("");
      ImageIcon packageIcon = new ImageIcon(new ImageIcon("/home/ashu/Desktop/Programming/Java/Project/Images/4.jpg").getImage().getScaledInstance(1366, 420, Image.SCALE_DEFAULT));
      img.setIcon(packageIcon);
      imagepanel.add(img);
      /*centerpanel ends here*/

      centerpanel1.add(select,BorderLayout.NORTH);
      // centerpanel1.add(loc1);
      centerpanel1.add(loc0,BorderLayout.WEST);
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
      one_way.addActionListener(this);
      round_trip.addActionListener(this);
      round_trip.setSelected(true);
  }

  int flag=0;
  public void actionPerformed(ActionEvent ae)
  {
    String source="",destination="";

    if(ae.getSource()==one_way)
    {
      text2.setVisible(false);
      date_select1.setVisible(false);
      flag=1;
      System.out.println(+flag);
    }

    else if(ae.getSource()==round_trip)
    {
      text2.setVisible(true);
      date_select1.setVisible(true);
      flag=0;
    }

    if(ae.getSource()==submit)
    {
      source=cb.getSelectedItem().toString();
      destination=cb1.getSelectedItem().toString();

      if(source.equalsIgnoreCase(destination))
      {
        JOptionPane.showMessageDialog(this,"Source and Destinations cannot be Same");
      }

      else
      {
        String date="",date2="",date4="";
        boolean checkFormat=false;
        if(flag==1)
        {
          date4=text3.getText();
	        if(text3.getText().equals("") || (!(date4.matches("([0-9])"))))
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
            	if(date.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})"))
            	{
                	checkFormat=true;
            	}
           	 else
            	{
                	checkFormat=false;
            	}
            }
          }
        }//flag condition
        else
        {
          date=text1.getText();
          date2=text2.getText();
          if(date.matches("([0-9]{2}) /([0-9]{2})/([0-9]{4})"))
          {
            if(date2.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})"))
                checkFormat=true;
            else
                checkFormat=false;
          }
          else
                checkFormat=false;
        }

        //checking date format
        if(checkFormat)
         {
           boolean value=false;
           String type="Two-way",returndate=date2;
           Dbconnect obj=new Dbconnect();
           if(flag==1)
           {
             type="One-Way";
             returndate="--------";
           }
           value=obj.insertflightdetails(date4,date,type,returndate,source,destination);
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
      }//else closing
  }//submit button if

    else if(ae.getSource()==rest)
    {
      text1.setText(" ");
      cb.setSelectedItem("Andhra Pradesh");
      cb1.setSelectedItem("Andhra Pradesh");
    }
  }

  public static void main(String args[]){
    flights obj= new flights();
    obj.setVisible(true);
    obj.setSize(1366,768);
    obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
