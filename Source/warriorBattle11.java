import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.text.*;
import java.util.Random;
import javax.swing.*;

public class warriorBattle11 extends JFrame
{
	private JLabel enemyHPJLabel;
	private JTextField enemyHPJTextField;
	
	private JLabel enemyLVLJLabel;
	private JTextField enemyLVLJTextField;
	
	private JTextField enemyNameJTextField;
	
	private JLabel enemySEJLabel;
	private JTextField enemySEJTextField;
	
	private JLabel enemyPicJLabel;
	
	private JLabel classJLabel;
	private JTextField classJTextField;
	
	private JLabel HPJLabel;
	private JTextField HPJTextField;
	
	private JLabel LVLJLabel;
	private JTextField LVLJTextField;
	
	private JButton att1JButton;
	private JButton att2JButton;
	private JButton att3JButton;
	
	private JLabel yourPicJLabel;
	
	private JLabel SEJLabel;
	private JTextField SEJTextField;
	
	private Random HP = new Random();
	
	private Random enemyName = new Random();
	
	private Random enemyHP = new Random();
	
	private Random incomingDMG = new Random();
	
	private Random eStat = new Random();
	
	private Random shockChance = new Random();
	
	private Random c1 = new Random();
	
	private Random generator = new Random();
	
	private Random bash = new Random();
	
	private Random block = new Random();
	
	private int enemyHealth;
	
	public warriorBattle11()
	{
		createUserInterface();
	}
	
	private void createUserInterface()
	{
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		
		enemyHPJLabel = new JLabel();
		enemyHPJLabel.setText("HP:");
		enemyHPJLabel.setBounds(10, 5, 20, 20);
		contentPane.add(enemyHPJLabel);
		
		enemyHPJTextField = new JTextField();
		enemyHPJTextField.setBounds(35, 5, 100, 20);
		enemyHPJTextField.setHorizontalAlignment(JTextField.CENTER);
		enemyHPJTextField.setEditable(false);
		enemyHPJTextField.setText(String.valueOf(350));
		contentPane.add(enemyHPJTextField);
		
		enemyLVLJLabel = new JLabel();
		enemyLVLJLabel.setText("LVL:");
		enemyLVLJLabel.setBounds(5, 35, 30, 20);
		contentPane.add(enemyLVLJLabel);
		
		enemyLVLJTextField = new JTextField();
		enemyLVLJTextField.setBounds(35, 35, 100, 20);
		enemyLVLJTextField.setHorizontalAlignment(JTextField.CENTER);
		enemyLVLJTextField.setEditable(false);
		contentPane.add(enemyLVLJTextField);
		
		enemyNameJTextField = new JTextField();
		enemyNameJTextField.setBounds(305, 5, 100, 20);
		enemyNameJTextField.setHorizontalAlignment(JTextField.CENTER);
		enemyNameJTextField.setEditable(false);
		contentPane.add(enemyNameJTextField);
		
		enemySEJLabel = new JLabel();
		enemySEJLabel.setText("Status Effect");
		enemySEJLabel.setBounds(580, 5, 100, 10);
		contentPane.add(enemySEJLabel);
		
		enemySEJTextField = new JTextField();
		enemySEJTextField.setBounds(580, 20, 75, 25);
		enemySEJTextField.setEditable(false);
		contentPane.add(enemySEJTextField);
		
		enemyPicJLabel = new JLabel();
		contentPane.add(enemyPicJLabel);

		classJLabel = new JLabel();
		classJLabel.setText("Class:");
		classJLabel.setBounds(5, 525, 50, 20);
		contentPane.add(classJLabel);
		
		classJTextField = new JTextField();
		classJTextField.setBounds(50, 525, 100, 20);
		classJTextField.setEditable(false);
		classJTextField.setHorizontalAlignment(JTextField.CENTER);
		contentPane.add(classJTextField);
		
		HPJLabel = new JLabel();
		HPJLabel.setText("HP:");
		HPJLabel.setBounds(20, 545, 20, 20);
		contentPane.add(HPJLabel);
		
		HPJTextField = new JTextField();
		HPJTextField.setBounds(50, 545, 100, 20);
		HPJTextField.setEditable(false);
		HPJTextField.setHorizontalAlignment(JTextField.CENTER);
		HPJTextField.setText(String.valueOf(300));
		contentPane.add(HPJTextField);
		
		LVLJLabel = new JLabel();
		LVLJLabel.setText("LVL:");
		LVLJLabel.setBounds(15, 565, 30, 20);
		contentPane.add(LVLJLabel);
		
		LVLJTextField = new JTextField();
		LVLJTextField.setBounds(50, 565, 100, 20);
		LVLJTextField.setEditable(false);
		LVLJTextField.setHorizontalAlignment(JTextField.CENTER);
		contentPane.add(LVLJTextField);
		
		att1JButton = new JButton();
		att1JButton.setText("Slash");
		att1JButton.setBounds(205, 565, 100, 25);
		contentPane.add(att1JButton);
		att1JButton.addActionListener(
		
		new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				att1JButtonActionPerformed(event);
			}
		}
		
		);
		
		att2JButton = new JButton();
		att2JButton.setText("Bash");
		att2JButton.setBounds(305, 565, 100, 25);
		contentPane.add(att2JButton);
		att2JButton.addActionListener(
		
		new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				att2JButtonActionPerformed(event);
			}
		}
		
		);
		
		att3JButton = new JButton();
		att3JButton.setText("Block");
		att3JButton.setBounds(405, 565, 100, 25);
		contentPane.add(att3JButton);
		att3JButton.addActionListener(
		
		new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				att3JButtonActionPerformed(event);
			}
		}
		
		);
		
		yourPicJLabel = new JLabel();
		contentPane.add(yourPicJLabel);
		
		SEJLabel = new JLabel();
		SEJLabel.setText("Status Effect");
		SEJLabel.setBounds(580, 545, 100, 10);
		contentPane.add(SEJLabel);
		
		SEJTextField = new JTextField();
		SEJTextField.setBounds(580, 560, 75, 25);
		SEJTextField.setEditable(false);
		contentPane.add(SEJTextField);
		
		setTitle("Level 11");
		setSize(775, 650);
		setVisible(true);
		
		load();
	}
	
	private void load()
	{
		enemyLVLJTextField.setText("65");
		LVLJTextField.setText("60");
		classJTextField.setText("Warrior");
		enemyNameJTextField.setText("Fulgurmancer");
		
	}
	
	private void att1JButtonActionPerformed(ActionEvent event)
	{
		String ename = enemyNameJTextField.getText();
		
		String enemyHealth = enemyHPJTextField.getText();
		int dmg = generator.nextInt(10) + 30;
		int reh = Integer.parseInt(enemyHealth) - dmg;
		
		JOptionPane.showMessageDialog(null, "You slash the " + ename + " for " + dmg + " damage!");
		
		enemyHPJTextField.setText(String.valueOf(reh));
		
		if(reh <= 0)
		{
			JOptionPane.showMessageDialog(null, "You defeated the " + ename + "!!");
			
			link.b12();
		}
		
		else
		{
			String enemyHealth2 = enemyHPJTextField.getText();
			int dmg2 = generator.nextInt(20) + 30;
			int reh2 = Integer.parseInt(enemyHealth2) - dmg2;
			
			JOptionPane.showMessageDialog(null, "You slash the " + ename + " again for " + dmg2 + " damage!!");
			
			enemyHPJTextField.setText(String.valueOf(reh2));
			
			if(reh2 <= 0)
			{
				JOptionPane.showMessageDialog(null, "You defeated the " + ename + "!!");
			
				link.b12();
			}
			
			else
			{
				String enemyHealth3 = enemyHPJTextField.getText();
				int dmg3 = generator.nextInt(30) + 30;
				int reh3 = Integer.parseInt(enemyHealth3) - dmg3;
				
				JOptionPane.showMessageDialog(null, "You slash the " + ename + " once more for " + dmg3 + " damage!!");
			
				enemyHPJTextField.setText(String.valueOf(reh3));
			
				if(reh3 <= 0)
				{
					JOptionPane.showMessageDialog(null, "You defeated the " + ename + "!!");
			
					link.b12();
				}
				
				else
				{
					enemyAttack();
				}
				
			}
			
		}
		
	}
	
	private void att2JButtonActionPerformed(ActionEvent event)
	{
		String HP = HPJTextField.getText();

		String enemyHealth = enemyHPJTextField.getText();

		String ename = enemyNameJTextField.getText();

		int dmg = bash.nextInt(10) + 120;

		int stun = eStat.nextInt(9) + 1;

		int reh = Integer.parseInt(enemyHealth) - dmg;

		if(stun <= 2)
		{

			JOptionPane.showMessageDialog(null, "You bash the " + ename + " with your shield for " + dmg + " damage, leaving them stunned!");
			
			enemySEJTextField.setText("Stun");
			
			enemyHPJTextField.setText(String.valueOf(reh));

			if(reh <= 0)
			{

				JOptionPane.showMessageDialog(null, "You defeated the enemy!");
				
				link.b12();
	
			}
	
			else
			{
		
				JOptionPane.showMessageDialog(null, "The enemy is stunned!");

			}

		}

		else
		{
			enemySEJTextField.setText("");

			JOptionPane.showMessageDialog(null, "You bash the " + ename + " with your shield for " + dmg + " damage.");
			
			enemyHPJTextField.setText(String.valueOf(reh));
		
			if(reh <= 0)
			{

				JOptionPane.showMessageDialog(null, "You defeated the enemy!");
				
				link.b12();
	
			}

			else
			{

				enemyAttack();

			}

		}
		
	}
	
	private void att3JButtonActionPerformed(ActionEvent event)
	{
		enemyAttackBlocked();
		
	}
	
	private void enemyAttack()
	{	
		String ename = enemyNameJTextField.getText();
	
		String stat = SEJTextField.getText();
	
		int sc = shockChance.nextInt(3) + 1;
		
		String HP = HPJTextField.getText();

		int dmg = incomingDMG.nextInt(30) + 120;
		
		if(stat.equals(""))
		{
			
			if(sc <= 1)
			{
				JOptionPane.showMessageDialog(null, ename + " attacks you with a lightning spell for " + dmg + " damage!! You are paralyzed!.");
		
				int remHP = Integer.parseInt(HP) - dmg;
		
				HPJTextField.setText(String.valueOf(remHP));
		
				if((int) remHP <= 0)
				{
					SEJTextField.setText("");
				
					JOptionPane.showMessageDialog(null, "You died a horrible death..");
			
					link.b11();
			
				}
			
				SEJTextField.setText("Paralysis");
				shockEffect();
			}
		
			else
			{
				JOptionPane.showMessageDialog(null, ename + " attacks you for " + dmg + " damage!!");
		
				int remHP = Integer.parseInt(HP) - dmg;
		
				HPJTextField.setText(String.valueOf(remHP));
		
				if((int) remHP <= 0)
				{
					SEJTextField.setText("");
				
					JOptionPane.showMessageDialog(null, "You died a horrible death..");
			
					link.b11();
			
				}
			
				else if(stat.equals("Paralysis"))
				{
					shockEffect();
				}
			
			}
		
		}
		
		else
		{
			
			JOptionPane.showMessageDialog(null, ename + " attacks you for " + dmg + " damage!!");
		
			int remHP = Integer.parseInt(HP) - dmg;
		
			HPJTextField.setText(String.valueOf(remHP));
			
			if(remHP <= 0)
			{
				JOptionPane.showMessageDialog(null, "You died a horrible death..");
			
				link.b11();
			
			}
			
		}
		
	}
	
	private void enemyAttackBlocked()
	{
		String ename = enemyNameJTextField.getText();
		
		String stat = SEJTextField.getText();
		
		String HP = HPJTextField.getText();
		
		int sc = shockChance.nextInt(3) + 1;
		
		int dmg = incomingDMG.nextInt(30) + 120;
		
		int b = block.nextInt(30) + 100;
		
		int finDMG = dmg - b;
		
		int remHP = Integer.parseInt(HP) - finDMG;
		
		
		if(stat.equals(""))
		{
		
			if(dmg <= b)
			{
			
				if(sc <= 1)
				{
					JOptionPane.showMessageDialog(null, ename + " attacks you with a lightning spell for " + dmg + " damage, but you blocked " + b + " damage! You are paralyzed!.");
		
					if((int) remHP <= 0)
					{
						SEJTextField.setText("");
					
						JOptionPane.showMessageDialog(null, "You died a horrible death..");
			
						link.b11();
			
					}
			
					SEJTextField.setText("Paralysis");
					shockEffect();
				}
			
				else
				{
					JOptionPane.showMessageDialog(null, ename + " attacks you for " + dmg + " damage, but you blocked " + b + " damage!");
				
					if(stat.equals("Paralysis"))
					{
						shockEffect();
					}
				
				}
			
			}
		
			else
			{
				if(sc <= 1)
				{
					JOptionPane.showMessageDialog(null, ename + " attacks you with a lightning spell for " + dmg + " damage, but you blocked " + b + " damage! You are paralyzed!.");
		
					HPJTextField.setText(String.valueOf(remHP));
				
					if((int) remHP <= 0)
					{
						SEJTextField.setText("");
					
						JOptionPane.showMessageDialog(null, "You died a horrible death..");
			
						link.b11();
			
					}
				
					SEJTextField.setText("Paralysis");
					shockEffect();
				
				}
			
				else
				{
					JOptionPane.showMessageDialog(null, ename + " attacks you for " + dmg + " damage, but you blocked " + b + " damage!");
				
					HPJTextField.setText(String.valueOf(remHP));
				
					if((int) remHP <= 0)
					{
						SEJTextField.setText("");
					
						JOptionPane.showMessageDialog(null, "You died a horrible death..");
			
						link.b11();
			
					}
				
					else if(stat.equals("Paralysis"))
					{
						shockEffect();
					}
				
				}
			
			}
		
		}

			
		else
		{
			if(dmg <= b)
			{
				JOptionPane.showMessageDialog(null, ename + " attacks you for " + dmg + " damage, but you blocked " + b + " damage!");
				
				if(remHP <= 0)
				{
					JOptionPane.showMessageDialog(null, "You died a horrible death..");
			
					link.b11();
			
				}
				
				else if(stat.equals("Paralysis"))
				{
					shockEffect();
				}
				
			}
		
			else
			{
				JOptionPane.showMessageDialog(null, ename + " attacks you for " + dmg + " 	damage, but you blocked " + b + " damage!");
			
				HPJTextField.setText(String.valueOf(remHP));
			
				if(remHP <= 0)
				{
					JOptionPane.showMessageDialog(null, "You died a horrible death..");
			
					link.b11();
			
				}
				
				else if(stat.equals("Paralysis"))
				{
					shockEffect();
				}
			
			}
			
		}	
	
	}	
	
	public void shockEffect()
	{	
		String ename = enemyNameJTextField.getText();
		String HP = HPJTextField.getText();
		String stat = SEJTextField.getText();
		HPJTextField.setText(String.valueOf(HP));
		
		if(Integer.parseInt(HP) <= 0)
		{
			SEJTextField.setText("");
				
			JOptionPane.showMessageDialog(null, "You died a horrible death..");
			
			link.b11();
			
		}
		
		else
		{
			att1JButton.setEnabled(false);
			att2JButton.setEnabled(false);
			
			JOptionPane.showMessageDialog(null, "You can't move!");
			
			status();
		}
		
	}
	
	public void status()
	{
		String HP = HPJTextField.getText();
		
		int clear = c1.nextInt(3) + 1;
		
		if(Integer.parseInt(HP) <= 0)
		{
			SEJTextField.setText("");
				
			JOptionPane.showMessageDialog(null, "You died a horrible death..");
			
			link.b11();
			
		}
				
		
		else if(clear == 1)
		{
			att1JButton.setEnabled(true);
			att2JButton.setEnabled(true);
			
			SEJTextField.setText("");
			
			JOptionPane.showMessageDialog(null, "Your paralysis clears up, allowing you to attack again.");
				
		}
		
	}
	
	public static void WB11()
	{
		warriorBattle11 application = new warriorBattle11();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
} // end of class