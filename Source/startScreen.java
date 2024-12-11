import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.text.*;
import java.util.Random;
import javax.swing.*;

public class startScreen extends JFrame
{
	private JLabel titleJLabel;
	
	private JLabel classJLabel;
	
	private JLabel blahJLabel;
	
	private JButton warriorJButton;
	
	public startScreen()
	{
		createUserInterface();
	}
	
	private void createUserInterface()
	{
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		
		titleJLabel = new JLabel();
		titleJLabel.setText("Ye Olde Vidya Gaem");
		titleJLabel.setBounds(180, 5, 500, 100);
		titleJLabel.setFont(new Font("Times New Roman", Font.PLAIN, 50));
		contentPane.add(titleJLabel);
		
		classJLabel = new JLabel();
		classJLabel.setText("Thine escapade begins as hastily as ye click the arcane rectangle.");
		classJLabel.setBounds(200, 145, 1000, 80);
		classJLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(classJLabel);
		
		blahJLabel = new JLabel();
		blahJLabel.setText("(Or you can click that x up at the top right.)");
		blahJLabel.setBounds(290, 250, 300, 80);
		blahJLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		contentPane.add(blahJLabel);
		
		warriorJButton = new JButton();
		warriorJButton.setText("BEGIN ADVENTURE");
		warriorJButton.setBounds(240, 400, 300, 50);
		contentPane.add(warriorJButton);
		warriorJButton.addActionListener(
		
		new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				warriorJButtonActionPerformed(event);
			}
		}
		
		);
		
		setTitle("Start Screen");
		setSize(800, 600);
		setVisible(true);
		
		
		
	}
	
	private void warriorJButtonActionPerformed(ActionEvent event)
	{
		warriorBattle1.WB1();
	}
	
	public static void start()
	{
		startScreen application = new startScreen();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JOptionPane.showMessageDialog(null, "Welcome, Hero!", "Welcome", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
} // end of class