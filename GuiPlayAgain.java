import java.lang.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class GuiPlayAgain extends JFrame implements MouseListener,ActionListener
{
	private JLabel titleLabel;
	private JPanel panel;
	private JButton playAgainButton, exitButton;
	GuiPlayAgain(String fool){
		super("Fool Game");
		this.setSize(1000,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		//panel.setBackground(Color.grey);
		
		titleLabel = new JLabel(fool);
		titleLabel.setBounds(300,10,600,600);
		titleLabel.setFont(new Font("Consolas",Font.BOLD,40));
		panel.add(titleLabel);
		
		playAgainButton = new JButton("Play Again?");
		playAgainButton.setBounds(300,350,100,70);
		playAgainButton.setBackground(Color.green);
		playAgainButton.addMouseListener(this);
		playAgainButton.addActionListener(this);
		panel.add(playAgainButton);
		
		exitButton = new JButton("Exit");
		exitButton.setBounds(550,350,100,70);
		exitButton.setBackground(Color.red);
		exitButton.addMouseListener(this);
		exitButton.addActionListener(this);
		panel.add(exitButton);
		
		this.add(panel);
	}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource().equals(playAgainButton))
		{
			playAgainButton.setBackground(Color.orange);
		}
		else if(me.getSource().equals(exitButton))
		{
			exitButton.setBackground(Color.orange);
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource().equals(playAgainButton))
		{
			playAgainButton.setBackground(Color.green);
		}
		else if(me.getSource().equals(exitButton))
		{
			exitButton.setBackground(Color.red);
		}
	}
	public void actionPerformed(ActionEvent ae){
		String result = ae.getActionCommand();
		if(result.equals(playAgainButton.getText()))
		{
			GuiFool gf = new GuiFool();
			gf.setVisible(true);
			this.setVisible(false);
		}
		else if(result.equals(exitButton.getText()))
		{
			System.exit(0);
		}
	}
	public void mousePressed(MouseEvent me){}
	public void mouseClicked(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
}