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

public class Game implements ActionListener 
{
		int currentscore = 0;
		
		JButton[] buttonsArray = new JButton[12];
		ImageIcon[] iconArray = new ImageIcon[12];
		JFrame G = new JFrame();
		JPanel main = new JPanel( new FlowLayout(FlowLayout.CENTER, 0, 0) );
        JPanel panel = new JPanel(); 
        JPanel panel2 = new JPanel();
        JLabel label = new JLabel("Your Score:" +currentscore);
        JButton shuffle = new JButton("Shuffle");
        
    public Game()
    {
        iconArray[0] = new ImageIcon("blank.jpg");
        for (int i = 1; i < buttonsArray.length; i++) {
            iconArray[i] = new ImageIcon("bart" + i + ".jpg");
        }
       
        panel.setPreferredSize( new Dimension(450, 380));
        GridLayout layout = new GridLayout(3,4);
        panel.setLayout(layout);
        main.add(panel);
      
        panel2.setPreferredSize( new Dimension(450, 60));
        panel2.add(label);
        shuffle.addActionListener(this);
        main.add(panel2);
        panel2.add(shuffle);


        for (int i = 0; i < buttonsArray.length; i++) {
            buttonsArray[i] = new JButton(iconArray[i]);
            buttonsArray[i].addActionListener(this);
            panel.add(buttonsArray[i]);
        }

        G.setContentPane(main);
      
        G.setTitle("Bart Puzzle");
        G.setSize(450,450);
        G.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //terminates application when closed
        G.setVisible(true);

    }
     

    @Override
    public void actionPerformed(ActionEvent e) {
            checkMove(e.getSource());
            label.setText("Your Score:" +currentscore);
    }
    
    public void checkMove(Object button){
			  
		  if(button == shuffle) {		
			  System.out.println("you have pressed the shuffle button");
			}
		
        if(button == buttonsArray[0]) {
            if (buttonsArray[1].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[1].setIcon(buttonsArray[0].getIcon());
                buttonsArray[0].setIcon(iconArray[0]);
                currentscore++;
            }
            if (buttonsArray[4].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[4].setIcon(buttonsArray[0].getIcon());
                buttonsArray[0].setIcon(iconArray[0]);
                currentscore++;
            }
        }

        if(button == buttonsArray[1]) {
            if (buttonsArray[0].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[0].setIcon(buttonsArray[1].getIcon());
                buttonsArray[1].setIcon(iconArray[0]);
                currentscore++;
            }
            if (buttonsArray[5].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[5].setIcon(buttonsArray[1].getIcon());
                buttonsArray[1].setIcon(iconArray[0]);
                currentscore++;
            }
            if (buttonsArray[2].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[2].setIcon(buttonsArray[1].getIcon());
                buttonsArray[1].setIcon(iconArray[0]);
                currentscore++;
            }
        }
        if(button == buttonsArray[2]) {
            if (buttonsArray[1].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[1].setIcon(buttonsArray[2].getIcon());
                buttonsArray[2].setIcon(iconArray[0]);
                currentscore++;
            }
            if (buttonsArray[3].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[3].setIcon(buttonsArray[2].getIcon());
                buttonsArray[2].setIcon(iconArray[0]);
                currentscore++;
            }
            if (buttonsArray[6].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[6].setIcon(buttonsArray[2].getIcon());
                buttonsArray[2].setIcon(iconArray[0]);
                currentscore++;
            }
        }
        if(button == buttonsArray[3]) {
            if (buttonsArray[2].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[2].setIcon(buttonsArray[3].getIcon());
                buttonsArray[3].setIcon(iconArray[0]);
                currentscore++;
            }
            if (buttonsArray[7].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[7].setIcon(buttonsArray[3].getIcon());
                buttonsArray[3].setIcon(iconArray[0]);
                currentscore++;
            }
        }
        if(button == buttonsArray[4]) {
            if (buttonsArray[0].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[0].setIcon(buttonsArray[4].getIcon());
                buttonsArray[4].setIcon(iconArray[0]);
                currentscore++;
            }
            if (buttonsArray[5].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[5].setIcon(buttonsArray[4].getIcon());
                buttonsArray[4].setIcon(iconArray[0]);
                currentscore++;
            }
            if (buttonsArray[8].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[8].setIcon(buttonsArray[4].getIcon());
                buttonsArray[4].setIcon(iconArray[0]);
                currentscore++;
            }
        }
        if(button == buttonsArray[5]) {
            if (buttonsArray[1].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[1].setIcon(buttonsArray[5].getIcon());
                buttonsArray[5].setIcon(iconArray[0]);
                currentscore++;
            }
            if (buttonsArray[4].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[4].setIcon(buttonsArray[5].getIcon());
                buttonsArray[5].setIcon(iconArray[0]);
                currentscore++;
            }
            if (buttonsArray[6].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[6].setIcon(buttonsArray[5].getIcon());
                buttonsArray[5].setIcon(iconArray[0]);
                currentscore++;
            }
            if (buttonsArray[9].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[9].setIcon(buttonsArray[5].getIcon());
                buttonsArray[5].setIcon(iconArray[0]);
                currentscore++;
            }
        }
        if(button == buttonsArray[6]) {
            if (buttonsArray[2].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[2].setIcon(buttonsArray[6].getIcon());
                buttonsArray[6].setIcon(iconArray[0]);
                currentscore++;
            }
            if (buttonsArray[7].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[7].setIcon(buttonsArray[6].getIcon());
                buttonsArray[6].setIcon(iconArray[0]);
                currentscore++;
            }
            if (buttonsArray[5].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[5].setIcon(buttonsArray[6].getIcon());
                buttonsArray[6].setIcon(iconArray[0]);
                currentscore++;
            }
            if (buttonsArray[10].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[10].setIcon(buttonsArray[6].getIcon());
                buttonsArray[6].setIcon(iconArray[0]);
                currentscore++;
            }
        }
        if(button == buttonsArray[7]) {
            if (buttonsArray[3].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[3].setIcon(buttonsArray[7].getIcon());
                buttonsArray[7].setIcon(iconArray[0]);
                currentscore++;
            }
            if (buttonsArray[6].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[6].setIcon(buttonsArray[7].getIcon());
                buttonsArray[7].setIcon(iconArray[0]);
                currentscore++;
            }
            if (buttonsArray[11].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[11].setIcon(buttonsArray[7].getIcon());
                buttonsArray[7].setIcon(iconArray[0]);
                currentscore++;
            }
        }
        if(button == buttonsArray[8]) {
            if (buttonsArray[4].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[4].setIcon(buttonsArray[8].getIcon());
                buttonsArray[8].setIcon(iconArray[0]);
                currentscore++;
            }
            if (buttonsArray[9].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[9].setIcon(buttonsArray[8].getIcon());
                buttonsArray[8].setIcon(iconArray[0]);
                currentscore++;
            }
        }
        if(button == buttonsArray[9]) {
            if (buttonsArray[8].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[8].setIcon(buttonsArray[9].getIcon());
                buttonsArray[9].setIcon(iconArray[0]);
                currentscore++;
            }
            if (buttonsArray[5].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[5].setIcon(buttonsArray[9].getIcon());
                buttonsArray[9].setIcon(iconArray[0]);
                currentscore++;
            }
            if (buttonsArray[10].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[10].setIcon(buttonsArray[9].getIcon());
                buttonsArray[9].setIcon(iconArray[0]);
                currentscore++;
            }
        }
        if(button == buttonsArray[10]) {
            if (buttonsArray[9].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[9].setIcon(buttonsArray[10].getIcon());
                buttonsArray[10].setIcon(iconArray[0]);
                currentscore++;
            }
            if (buttonsArray[6].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[6].setIcon(buttonsArray[10].getIcon());
                buttonsArray[10].setIcon(iconArray[0]);
                currentscore++;
            }
            if (buttonsArray[11].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[11].setIcon(buttonsArray[10].getIcon());
                buttonsArray[10].setIcon(iconArray[0]);
                currentscore++;
            }
        }
        if(button == buttonsArray[11]) {
            if (buttonsArray[7].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[7].setIcon(buttonsArray[11].getIcon());
                buttonsArray[11].setIcon(iconArray[0]);
                currentscore++;
            }
            if (buttonsArray[10].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[10].setIcon(buttonsArray[11].getIcon());
                buttonsArray[11].setIcon(iconArray[0]);
                currentscore++;
            }
        }

        if (buttonsArray[0].getIcon().toString().equals("blank.jpg") &&
                buttonsArray[1].getIcon().toString().equals("bart1.jpg") &&
                buttonsArray[2].getIcon().toString().equals("bart2.jpg") &&
                buttonsArray[3].getIcon().toString().equals("bart3.jpg") &&
                buttonsArray[4].getIcon().toString().equals("bart4.jpg") &&
                buttonsArray[5].getIcon().toString().equals("bart5.jpg") &&
                buttonsArray[6].getIcon().toString().equals("bart6.jpg") &&
                buttonsArray[7].getIcon().toString().equals("bart7.jpg") &&
                buttonsArray[8].getIcon().toString().equals("bart8.jpg") &&
                buttonsArray[9].getIcon().toString().equals("bart9.jpg") &&
                buttonsArray[10].getIcon().toString().equals("bart10.jpg") &&
                buttonsArray[11].getIcon().toString().equals("bart11.jpg")) {
                 System.out.println("You Win!!!");
                 String yourname;
                 yourname =JOptionPane.showInputDialog("WELL DONE, YOU WIN!! What is your name?");
                 System.out.println(yourname + currentscore);

                 JFrame h = new JFrame ();  //creates a new blank window
                 h.setTitle("High Scores");     //changes window title
                 h.setSize(300,300);        //changes window size
                 h.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //closes window but keeps app running
                 h.setVisible(true);        //makes window visible

                //GridLayout layout2 = new GridLayout(10,2);
                //JPanel panel3 = new JPanel();
                //panel3.setLayout(layout2);


                JLabel name = new JLabel("name", JLabel.LEFT);
                JLabel score = new JLabel("score", JLabel.RIGHT);

                h.add(name);
                h.add(score);

                //panel3.add(name);
                //panel3.add(score);



        }
       
    }
   
}
