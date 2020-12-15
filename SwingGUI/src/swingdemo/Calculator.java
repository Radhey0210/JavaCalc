package swingdemo;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculator
{

	public static void main(String[] args) 
	{
		calcu obj = new calcu();

	}

}
  class calcu extends JFrame implements ActionListener
  {
	JTextField tf1,tf2;
	JButton b1,b2,b3,b4,b5;
	JLabel l; double result;
	calcu()
	{
		 setFont(new Font("System",Font.BOLD,22));
		   Font f=getFont();
		   FontMetrics fm = getFontMetrics(f);
		   int x =fm.stringWidth("CALCULATOR");
		   int y=fm.stringWidth(" ");
		   int z=(getWidth()) - (x);
		   int w=z/y;
		   String pad = "";
		   //for(int i=0l i=!w;i++;pad=pad+" ';
		   pad=String.format("%"+w+"s",pad); //42:31
		   setTitle(pad+"CALCULATOR"); 
		   
	tf1 = new JTextField(20);	
	tf2 = new JTextField(20);
	b1=new JButton("ADD");
	b2= new JButton("SUB");
	b3=new JButton("DIV");
	b4= new JButton("MULTI");
	b5= new JButton("POWER");
	l=new JLabel("Result");
	l.setFont(new Font("Arial",Font.BOLD,30));
	add(tf1);add(tf2);add(b1);add(b2);add(b3);add(b4);add(b5);add(l);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	setLayout(new FlowLayout());
	setVisible(true);
	setSize(450,200);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent ae)
	{
		if(tf1.getText().equals("") || tf2.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null, "Fill all the text fields");
			
		}
		else
		{
	int x=Integer.parseInt(tf1.getText());	
	int y=Integer.parseInt(tf2.getText());
	if(ae.getSource()==b1)
	result=x+y;
	if(ae.getSource()==b2)
		result=x-y;
	if(ae.getSource()==b3)
		result=x/y;
	if(ae.getSource()==b4)
		result=x*y;
	if(ae.getSource()==b5)
		{result=Math.pow(x, y);}
	l.setText(result+"");

	}
}
  }
