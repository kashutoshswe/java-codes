/*
Form using Swings
Authors : Ashutosh Kumar,Anshul Agrawal
PRN : 19030142006
      19030142009
*/


import javax.swing.*;
import java.awt.*;

class Form extends JFrame
{

	//Label fields
	JLabel head,name,address,gender,course,country;
	JPanel  headpanel,centerpanel,namepanel,addresspanel,countrypanel,genderpanel,coursepanel,buttonpanel;
	JTextField text1;
	JTextArea addr;
	JButton submit,cancel;
	JRadioButton male,female;
	ButtonGroup bg;
	JCheckBox c,cp,java;
	JComboBox country1;

  Form()
    {
			Container container=getContentPane();
			container.setLayout(new BorderLayout());

			headpanel=new JPanel();
			head=new JLabel("Welcome to my form");

			//center panel
			centerpanel=new JPanel();
			centerpanel.setLayout(new BoxLayout(centerpanel,BoxLayout.Y_AXIS));

			//Name panel
			namepanel=new JPanel();
			name=new JLabel("Name:");
			text1=new JTextField(20);

			//Address panel
			addresspanel=new JPanel();
			address=new JLabel("Address:");
			addr=new JTextArea(4,20);


			//Country Panel
			countrypanel=new JPanel();
			country=new JLabel("Country:");
			country1=new JComboBox();


			//Gender panel
			genderpanel=new JPanel();
			gender=new JLabel("Gender");
			male=new JRadioButton("Male");
			female=new JRadioButton("Female");
			bg=new ButtonGroup();


			//course panel
			coursepanel=new JPanel();
			course=new JLabel("Course:");
			c=new JCheckBox("C");
			cp=new JCheckBox("C++");
			java=new JCheckBox("Java");

			//Button panel
			buttonpanel=new JPanel();
			submit=new JButton("Submit");
			cancel=new JButton("Cancel");

			country1.addItem("India");
			country1.addItem("Australia");
			country1.addItem("Russia");
			country1.addItem("USA");

			bg.add(male);
			bg.add(female);


			//add elements
			headpanel.add(head);

			namepanel.add(name,BorderLayout.WEST);
			namepanel.add(text1,BorderLayout.EAST);

			addresspanel.add(address);
			addresspanel.add(addr);

			genderpanel.add(gender);
			genderpanel.add(male);
			genderpanel.add(female);

			countrypanel.add(country);
			countrypanel.add(country1);
			coursepanel.add(course);
			coursepanel.add(c);
			coursepanel.add(cp);
			coursepanel.add(java);

			buttonpanel.add(submit);
			buttonpanel.add(cancel);


			centerpanel.add(headpanel);
			centerpanel.add(namepanel);
			centerpanel.add(addresspanel);
			centerpanel.add(genderpanel);
			centerpanel.add(countrypanel);
			centerpanel.add(coursepanel);
			centerpanel.add(buttonpanel);

			container.add(centerpanel);

    }

    public static void main(String[] args)
    {
        Form obj=new Form();
        obj.setVisible(true);
        obj.setSize(400,500);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
