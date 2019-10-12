/* Tours Project
Authors : Ashutosh Kumar,Anshul Agrawal
PRN : 19030142006
      19030142009
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//creating class for the given frame
class Homepage extends JFrame implements ActionListener
{
  //Fields and panels required
  JMenu member,feedback,auth;
  JMenuItem login,signup,member_new,member_admin,feedbackform;
  Homepage(){

    /* Menu Bar*/
    JMenuBar mbar=new JMenuBar();

		member=new JMenu("Accounts");
		feedback=new JMenu("Feedback");
    auth= new JMenu("Authentication");
		login=new JMenuItem("Log In");
		signup= new JMenuItem("SignUp");
		member_new=new JMenuItem("New User");
		member_admin=new JMenuItem("Admin");
    feedbackform=new JMenuItem("Feedback Form");

    JSeparator sep =new JSeparator();
    member.add(member_new);
    member.add(sep);
    member.add(member_admin);

    auth.add(login);
    auth.add(sep);
    auth.add(signup);

    feedback.add(feedbackform);

    mbar.add(member);
    mbar.add(feedback);
    mbar.add(auth);
    setJMenuBar(mbar);

    /* Menu Bar ends*/

    /*Container starts*/
    Container con= getContentPane();
    con.setLayout(new BorderLayout());


    //center panel
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
    /*headpanel*/

    /* Top Label ends..*/

    /* centerpanel starts here*/

    /*WEST*/
    JPanel top= new JPanel();
    top.setLayout(new BorderLayout());
    //top.setBackground(new java.awt.Color(66, 134, 244));

    JPanel packagepanel =new JPanel();
    packagepanel.setLayout(new BoxLayout(packagepanel,BoxLayout.Y_AXIS));
    JLabel package_offer=new JLabel("<html><b><font size=20 face=\"Helvetica\">"+"<br>"+"Packages"+"<br>"+"</font></b></html>");
    package_offer.setFont(new Font("Courier New",Font.BOLD, 20));
    JLabel img= new JLabel("",JLabel.CENTER);
    ImageIcon packageIcon = new ImageIcon(new ImageIcon("/home/ashu/Desktop/Programming/Java/Project/Images/package.png").getImage().getScaledInstance(400, 180, Image.SCALE_DEFAULT));
    JLabel package_info= new JLabel("<html><b><font face=\"Helvetica\">"+"<br>"+"Travel around the world with Softwaren name's range of exotic, "+"<br>"+"affordable and luxurious holiday packages."+"<br>"+"From domestic holidays to international holidays,"+"<br>"+" get the best rates on your preferred holiday destinations."+"<br>"+
                                    "Our itineraries are specially designed"+"<br>"+" for a comfortable and hassle-free travel experience."+"<br>"+" At Travelguru, we provide our customers with expert guidance"+"<br>"+" on famous tourist attractions,local cuisines and shopping."+"<br>"+" What's more, you can also customize "+"<br>"+"the holiday package to suit your travel needs."+"<br>"+"</font></b></html>");
    package_info.setFont(new Font("Courier New",Font.BOLD, 12));

    JPanel destinationspanel =new JPanel();
    destinationspanel.setLayout(new BoxLayout(destinationspanel,BoxLayout.Y_AXIS));
    JLabel destinations_name=new JLabel("<html><b><font size=20 face=\"Helvetica\">"+"<br>"+"Destinations"+"<br>"+"</font></b></html>");
    destinations_name.setFont(new Font("Courier New",Font.BOLD, 20));
    JLabel img2= new JLabel("",JLabel.CENTER);
    ImageIcon destinationsIcon = new ImageIcon(new ImageIcon("/home/ashu/Desktop/Programming/Java/Project/Images/destinations.png").getImage().getScaledInstance(400, 180, Image.SCALE_DEFAULT));
    JLabel destinations_info= new JLabel("<html><b><font face=\"Helvetica\">"+"<br>"+"Travel around the world with Softwaren name's range of exotic, "+"<br>"+"affordable and luxurious holiday packages."+"<br>"+"From domestic holidays to international holidays,"+"<br>"+" get the best rates on your preferred holiday destinations."+"<br>"+
                                    "Our itineraries are specially designed"+"<br>"+" for a comfortable and hassle-free travel experience."+"<br>"+" At Travelguru, we provide our customers with expert guidance"+"<br>"+" on famous tourist attractions,local cuisines and shopping."+"<br>"+" What's more, you can also customize "+"<br>"+"the holiday package to suit your travel needs."+"<br>"+"</font></b></html>");
    destinations_info.setFont(new Font("Courier New",Font.BOLD, 12));

    JPanel offerspanel =new JPanel();
    offerspanel.setLayout(new BoxLayout(offerspanel,BoxLayout.Y_AXIS));
    JLabel offer_name=new JLabel("<html><b><font size=20 face=\"Helvetica\">"+"<br>"+"Offers"+"<br>"+"</font></b></html>");
    offer_name.setFont(new Font("Courier New",Font.BOLD, 20));
    JLabel img3= new JLabel("",JLabel.CENTER);
    ImageIcon offersIcon = new ImageIcon(new ImageIcon("/home/ashu/Desktop/Programming/Java/Project/Images/offers.jpg").getImage().getScaledInstance(400, 180, Image.SCALE_DEFAULT));
    JLabel offers_Info= new JLabel("<html><b><font face=\"Helvetica\">"+"<br>"+"Travel around the world with Softwaren name's range of exotic, "+"<br>"+"affordable and luxurious holiday packages."+"<br>"+"From domestic holidays to international holidays,"+"<br>"+" get the best rates on your preferred holiday destinations."+"<br>"+
                                    "Our itineraries are specially designed"+"<br>"+" for a comfortable and hassle-free travel experience."+"<br>"+" At Travelguru, we provide our customers with expert guidance"+"<br>"+" on famous tourist attractions,local cuisines and shopping."+"<br>"+" What's more, you can also customize "+"<br>"+"the holiday package to suit your travel needs."+"<br>"+"</font></b></html>");
    offers_Info.setFont(new Font("Courier New",Font.BOLD, 12));


    img.setIcon(packageIcon);
    packagepanel.add(package_offer);
    packagepanel.add(img);
    packagepanel.add(package_info);

    img2.setIcon(destinationsIcon);
    destinationspanel.add(destinations_name);
    destinationspanel.add(img2);
    destinationspanel.add(destinations_info);

    img3.setIcon(offersIcon);
    offerspanel.add(offer_name);
    offerspanel.add(img3);
    offerspanel.add(offers_Info);

    top.add(packagepanel,BorderLayout.WEST);
    top.add(destinationspanel,BorderLayout.CENTER);
    top.add(offerspanel,BorderLayout.EAST);

    /*WEST ends*/

    /* centerpanel ends here*/

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

    /*Container ends*/

    con.add(centerpanel,BorderLayout.NORTH);
    con.add(top,BorderLayout.CENTER);
    con.add(bottompanel,BorderLayout.SOUTH);
    con.setBackground(new java.awt.Color(66, 134, 244));

		feedbackform.addActionListener(this);
  	login.addActionListener(this);
		signup.addActionListener(this);
		member_new.addActionListener(this);
		member_admin.addActionListener(this);

  }

  public void actionPerformed(ActionEvent ae)
  {
    if(ae.getSource()==feedbackform)
    {
      Feedback obj2=new Feedback();
      obj2.setVisible(true);
      obj2.setSize(1366,768);
      this.dispose();
    }

    else if(ae.getSource()==login)
    {
      Login obj2=new Login();
      obj2.setVisible(true);
      obj2.setSize(1366,768);
      this.dispose();
    }

    else if(ae.getSource()==signup || ae.getSource()==member_new)
    {
      Signup obj2=new Signup();
      obj2.setVisible(true);
      obj2.setSize(1366,768);
      this.dispose();
    }

    else if(ae.getSource()==member_admin)
    {
      Admin obj2=new Admin();
      obj2.setVisible(true);
      obj2.setSize(1366,768);
      this.dispose();
    }
  }

  public static void main(String args[]){
    Homepage obj= new Homepage();
    obj.setVisible(true);
    obj.setSize(1366,768);
    obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
