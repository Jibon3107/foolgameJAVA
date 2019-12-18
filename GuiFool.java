import java.lang.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class GuiFool extends JFrame implements MouseListener,ActionListener
{
	private JPanel panel;
	private JButton yesButton,noButton;
	private JLabel titleLabel;
	private Random random = new Random();
	
	public GuiFool()
	{
		super("Fool Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000,600);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.gray);
		
		titleLabel = new JLabel("Are you a Snake?");
		titleLabel.setBounds(300,10,400,400);
		titleLabel.setFont(new Font("Consolas",Font.BOLD,40));
		panel.add(titleLabel);
		
		yesButton = new JButton("YES");
		yesButton.setBounds(300,350,100,70);
		yesButton.setBackground(Color.green);
		yesButton.addMouseListener(this);
		yesButton.addActionListener(this);
		panel.add(yesButton);
		
		noButton = new JButton("NO");
		noButton.setBounds(550,350,100,70);
		noButton.setBackground(Color.red);
		noButton.addMouseListener(this);
		noButton.addActionListener(this);
		panel.add(noButton);
		
		this.add(panel);
		
	}
	public void mouseEntered(MouseEvent me){
		if(me.getSource().equals(noButton))
		{
			noButton.setBackground(Color.PINK);
			noButton.setBounds(random.nextInt(800),random.nextInt(500),100,70);
			noButton.setBounds(random.nextInt(800),random.nextInt(500),100,70);
		}
		else if(me.getSource().equals(yesButton))
		{
			yesButton.setBackground(Color.orange);
		}
	}
	public void mouseExited(MouseEvent me){
		if(me.getSource().equals(noButton))
		{
			noButton.setBackground(Color.red);
		}
		else if(me.getSource().equals(yesButton))
		{
			yesButton.setBackground(Color.green);
		}
	}
	//public void actionPerformed(ActionEvent ae){}
	public void actionPerformed(ActionEvent ae){
		String result = ae.getActionCommand();
		if(result.equals(yesButton.getText())){
			String fool = "You are a SNAKE!!";
			GuiPlayAgain  gpa= new GuiPlayAgain(fool);
			gpa.setVisible(true);
			this.setVisible(false);
		}
		if(result.equals(noButton.getText())){
			String noKeyboard = "No hiding, SNAKE!!";
			GuiPlayAgain gpa= new GuiPlayAgain(noKeyboard);
			gpa.setVisible(true);
			this.setVisible(false);
		}
	}
	public void mousePressed(MouseEvent me){}
	public void mouseClicked(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	
	
}