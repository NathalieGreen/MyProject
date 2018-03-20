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
      
        panel2.setPreferredSize( new Dimension(450, 50));
        panel2.add(label);
        main.add(panel2);
        


        for (int i = 0; i < buttonsArray.length; i++) {
            buttonsArray[i] = new JButton(iconArray[i]);
            buttonsArray[i].addActionListener(this);
            panel.add(buttonsArray[i]);
        }

        G.setContentPane(main);
      
        G.setTitle("Bart Puzzle");
        G.setSize(450,430);
        G.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        G.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            checkMove(e.getSource());
            label.setText("Your Score:" +currentscore);
    }

    public void checkMove(Object button){
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
       
    }
}
