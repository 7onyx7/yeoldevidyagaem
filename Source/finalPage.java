import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.text.*;
import java.util.Random;
import javax.swing.*;

public class finalPage extends JFrame
{
	private JLabel titleJLabel;
	
	private JLabel classJLabel;
	
	private JButton completeQuestJButton;
	
	private JButton secretJButton;
	
	public finalPage()
	{
		createUserInterface();
	}
	
	private void createUserInterface()
	{
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		
		titleJLabel = new JLabel();
		titleJLabel.setText("Congratulations!!!");
		titleJLabel.setBounds(200, 5, 500, 100);
		titleJLabel.setFont(new Font("Times New Roman", Font.PLAIN, 50));
		contentPane.add(titleJLabel);
		
		classJLabel = new JLabel();
		classJLabel.setText("You have triumphed over the darkness!");
		classJLabel.setBounds(160, 145, 500, 80);
		classJLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		contentPane.add(classJLabel);
		
		completeQuestJButton = new JButton();
		completeQuestJButton.setText("Complete Quest");
		completeQuestJButton.setBounds(300, 300, 150, 30);
		contentPane.add(completeQuestJButton);
		completeQuestJButton.addActionListener(
		
		new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				completeQuestJButtonActionPerformed(event);
			}
		}
		
		);
		
		secretJButton = new JButton();
		secretJButton.setText("Secret...");
		secretJButton.setBounds(300, 590, 150, 30);
		contentPane.add(secretJButton);
		secretJButton.addActionListener(
		
		new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				secretJButtonActionPerformed(event);
			}
		}
		
		);
		
		
		setTitle("You win!");
		setSize(800, 600);
		setVisible(true);
		
		load();
		
	}
	
	public static void load()
	{
		JOptionPane.showMessageDialog(null, "Your heroic deeds shall forever be remembered. Farewell!");
		
		JOptionPane.showMessageDialog(null, "Oh, and one last thing... You may want to travel south. There's something waiting to battle you.");
	}

	private void completeQuestJButtonActionPerformed(ActionEvent event)
	{	
		startScreen.start();
	}
	
	private void secretJButtonActionPerformed(ActionEvent event)
	{
		link.secret();
	}
	
	public static void FP()
	{
		finalPage application = new finalPage();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
} // end of class