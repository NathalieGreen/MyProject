import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; 
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener; 
 
 public class Game // implements ActionListener
 {
		public static void main(String[] args)
	{
		Game A = new Game();
	
	}
	

	public Game()
	{
		Icon bart0 = new ImageIcon("bart0.jpg");
		Icon bart1 = new ImageIcon("bart1.jpg");
		Icon bart2 = new ImageIcon("bart2.jpg");
		Icon bart3 = new ImageIcon("bart3.jpg");
		Icon bart4 = new ImageIcon("bart4.jpg");
		Icon bart5 = new ImageIcon("bart5.jpg");
		Icon bart6 = new ImageIcon("bart6.jpg");
		Icon bart7 = new ImageIcon("bart7.jpg");
		Icon bart8 = new ImageIcon("bart8.jpg");
		Icon bart9 = new ImageIcon("bart9.jpg");
		Icon bart10 = new ImageIcon("bart10.jpg");
		Icon bart11 = new ImageIcon("bart11.jpg");
	
		JButton[] number = new JButton[12];
		


		JFrame G = new JFrame();
		JPanel panel = new JPanel();
		GridLayout layout = new GridLayout(3,4);
		panel.setLayout(layout);
		
		

		G.setContentPane(panel); 
		G.setTitle("BartPuzzle"); 
		G.setSize(450,365);
		G.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		number[0] = new JButton(bart0);
		number[1] = new JButton(bart1);
		number[2] = new JButton(bart2);
		number[3] = new JButton(bart3);
		number[4] = new JButton(bart4);
		number[5] = new JButton(bart5);
		number[6] = new JButton(bart6);
		number[7] = new JButton(bart7);
		number[8] = new JButton(bart8);
		number[9] = new JButton(bart9);
		number[10] = new JButton(bart10);
		number[11] = new JButton(bart11);
		
		panel.add(number[0]);
		panel.add(number[1]);
		panel.add(number[2]);
		panel.add(number[3]);
		panel.add(number[4]);
		panel.add(number[5]);
		panel.add(number[6]);
		panel.add(number[7]);
		panel.add(number[8]);
		panel.add(number[9]);
		panel.add(number[10]);
		panel.add(number[11]);
		
		
		number[0].addActionListener(new ActionListener()
		{
	
		public void actionPerformed(ActionEvent c)
			{
				System.out.println("you clicked button 1");
			}
		});
		
		number[1].addActionListener(new ActionListener()
		{
	
		public void actionPerformed(ActionEvent c)
			{
				System.out.println("you clicked button 2");
				number[1].setIcon(bart0);
				number[0].setIcon(bart1);
			}
		});
		
		number[2].addActionListener(new ActionListener()
		{
	
		public void actionPerformed(ActionEvent c)
			{
				System.out.println("you clicked button 3");
				number[2].setIcon(bart0);
				number[0].setIcon(bart2);
			}
		});
		
		number[3].addActionListener(new ActionListener()
		{
	
		public void actionPerformed(ActionEvent c)
			{
				System.out.println("you clicked button 4");
				number[3].setIcon(bart0);
				number[0].setIcon(bart3);
			}
		});
		
		number[4].addActionListener(new ActionListener()
		{
	
		public void actionPerformed(ActionEvent c)
			{
				System.out.println("you clicked button 5");
				number[4].setIcon(bart0);
				number[0].setIcon(bart4);
			}
		});
		
		number[5].addActionListener(new ActionListener()
		{
	
		public void actionPerformed(ActionEvent c)
			{
				System.out.println("you clicked button 6");
				number[5].setIcon(bart0);
				number[0].setIcon(bart5);
			}
		});
		
		number[6].addActionListener(new ActionListener()
		{
	
		public void actionPerformed(ActionEvent c)
			{
				System.out.println("you clicked button 7");
				number[6].setIcon(bart0);
				number[0].setIcon(bart6);
			}
		});
		
		number[7].addActionListener(new ActionListener()
		{
	
		public void actionPerformed(ActionEvent c)
			{
				System.out.println("you clicked button 8");
				number[7].setIcon(bart0);
				number[0].setIcon(bart7);
			}
		});
		
		number[8].addActionListener(new ActionListener()
		{
	
		public void actionPerformed(ActionEvent c)
			{
				System.out.println("you clicked button 9");
				number[8].setIcon(bart0);
				number[0].setIcon(bart8);
			}
		});
		
		number[9].addActionListener(new ActionListener()
		{
	
		public void actionPerformed(ActionEvent c)
			{
				System.out.println("you clicked button 10");
				number[9].setIcon(bart0);
				number[0].setIcon(bart9);
			}
		});
		
		number[10].addActionListener(new ActionListener()
		{
	
		public void actionPerformed(ActionEvent c)
			{
				System.out.println("you clicked button 11");
				number[10].setIcon(bart0);
				number[0].setIcon(bart10);
			}
		});
		
		number[11].addActionListener(new ActionListener()
		{
	
		public void actionPerformed(ActionEvent c)
			{
				System.out.println("you clicked button 12");
				number[11].setIcon(bart0);
				number[0].setIcon(bart11);
			}
		});
		
	
		G.setVisible(true);
	}
	
	
	//public void actionPerformed(ActionEvent c)
	//{
		//JButton s = (JButton)c.getSource();
		//System.out.println("This is:"+s.getIcon().toString());
		//if (s.getIcon().toString().startsWith("bart1"))
		//{
			//System.out.println("This is bart1");
			//for (int i=0; i<12; i++)
			//{
				//if (number[i].getIcon().toString().startsWith("bart0"))
				//{
					//number[i].setIcon(bart0);
					//s.setIcon(bart1);
					
				//}
				
			//}
		//}
	//}
}

/*JButton s = (JButton)c.getSource();
		if (s.getIcon().toString().startsWith("bart"))
		{
			System.out.println("This is bart1");
		}
	}*/
