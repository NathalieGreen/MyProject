import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Game implements ActionListener
{
    private int currentscore = 0;


    JButton[] buttonsArray = new JButton[12];   //creates room for 12 buttons
    ImageIcon[] iconArray = new ImageIcon[12];  //creates space for 12 image icons
    JFrame G = new JFrame();    //creates the window
    JPanel main = new JPanel(); //creates the main panel which I will import everything in to
    JPanel panel = new JPanel(); //creates the panel for the puzzle
    JPanel panel2 = new JPanel(); //creates the panel for the score and JButtons to go into
    JLabel label = new JLabel("Your Score:" +currentscore); //creates a JLabel
    JButton shuffle = new JButton("Shuffle"); //creates a shuffle button
    JButton solve = new JButton("Solve"); //creates a solve button
    ArrayList<Integer> numbers = new ArrayList<Integer>(); //
    ImageIcon blank = new ImageIcon("blank.jpg"); //creates a new icon for the blank image
    boolean solvable = false;
    boolean won = false;


    public Game()
    {
        shuffleNumbers();
        readImages();

        /**
         * sets the size of the panels and makes the layout 4x3
         */
        panel.setPreferredSize( new Dimension(450, 380));
        GridLayout layout = new GridLayout(3,4);
        panel.setLayout(layout);
        main.add(panel);
        panel2.setPreferredSize( new Dimension(450, 60));
        panel2.add(label); //adds the player's score to the JPanel
        shuffle.addActionListener(this);
        solve.addActionListener(this);
        panel2.add(shuffle);
        panel2.add(solve);
        main.add(panel2);

        /**
         * a loop to add the images to the buttons,
         * add action listener to all of the buttons and then add
         * the buttons to the panel
         */
        for (int i = 0; i < 11; i++) {
            buttonsArray[i] = new JButton(iconArray[numbers.get(i)]);
            buttonsArray[i].addActionListener(this);
            panel.add(buttonsArray[i]);
        }

        buttonsArray[11] = new JButton(blank);
        buttonsArray[11].addActionListener(this);
        panel.add(buttonsArray[11]);

        G.setContentPane(main); //sets the panel on the JFrame

        G.setTitle("Bart Puzzle"); //sets the title of the JFrame
        G.setSize(450,450); //sets the size of the JFrame
        G.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //terminates application when closed
        G.setVisible(true); //makes the JFrame visible

    }

    public void readImages(){
        for (int i=0; i<11; i++) {
            iconArray[i] = new ImageIcon("bart" + i + ".jpg");
        }
    }

    /**runs through the number (a, b) if a > b calculate the difference and add to total,
    if width of squares is even and the blank is on an odd row counting from the bottom.
    We always set the last square as blank to ensure the total has to be an odd number
    if the total is odd we then set solvable to true. */
    public void calculateSolvable(){
        int total = 0;
        for (int i=0;i<10;i++) {
            int result = numbers.get(i) - numbers.get(i+1);
            if (result > 0){
                total = total + result;
            }
        }
        System.out.println("Total = " + total);
        if((total & 1) == 0){
            solvable = false;
        }else{
             solvable = true;
        }
    }

        /**adds 0 - 10 to array list and shuffles them.
        Once shuffled the calculate solvable method will be called.
        If the calculate shuffle sets solvable to true this method will stop running */
    public void shuffleNumbers(){

        numbers.clear();
        for (int i=0; i<11; i++) {
            numbers.add(new Integer(i));
        }
        Collections.shuffle(numbers);
        calculateSolvable();
        if (!solvable){
            shuffleNumbers();
        }
    }

        /**Uses the shuffled numbers to iterate through the buttons and set the pictures up accordingly*/
    public void shuffleTiles(){
        shuffleNumbers();
        for(int i = 0; i < 11; i++){
            buttonsArray[i].setIcon(iconArray[numbers.get(i)]);
        }
        buttonsArray[11].setIcon(blank);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            checkButton(e.getSource());
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        label.setText("Your Score:" +currentscore);
    }

    public void checkButton(Object button) throws IOException {
        if(button == shuffle) {
            shuffleNumbers();
            shuffleTiles();
            System.out.println("you have pressed the shuffle button");
            won = false;
           //currentscore = 0;
        }


        /**a loop which solves the puzzle by moving every icon to the correct location (if solve is pressed).*/
        if (button == solve) {
            buttonsArray[0].setIcon(blank);
            for (int i=0; i<11; i++){
                buttonsArray[i+1].setIcon(iconArray[i]);
            }
            currentscore++;
        }

        /**
         * this validates each tile, so that when a tile is clicked on,
         * if the blank tile is directly next to it, it will then and only
         * then swap with that tile
         */
        if(button == buttonsArray[0]) {
            if (buttonsArray[1].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[1].setIcon(buttonsArray[0].getIcon());
                buttonsArray[0].setIcon(blank);
                currentscore++;
            }
            if (buttonsArray[4].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[4].setIcon(buttonsArray[0].getIcon());
                buttonsArray[0].setIcon(blank);
                currentscore++;
            }
        }

        if(button == buttonsArray[1]) {
            if (buttonsArray[0].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[0].setIcon(buttonsArray[1].getIcon());
                buttonsArray[1].setIcon(blank);
                currentscore++;
            }
            if (buttonsArray[5].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[5].setIcon(buttonsArray[1].getIcon());
                buttonsArray[1].setIcon(blank);
                currentscore++;
            }
            if (buttonsArray[2].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[2].setIcon(buttonsArray[1].getIcon());
                buttonsArray[1].setIcon(blank);
                currentscore++;
            }
        }
        if(button == buttonsArray[2]) {
            if (buttonsArray[1].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[1].setIcon(buttonsArray[2].getIcon());
                buttonsArray[2].setIcon(blank);
                currentscore++;
            }
            if (buttonsArray[3].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[3].setIcon(buttonsArray[2].getIcon());
                buttonsArray[2].setIcon(blank);
                currentscore++;
            }
            if (buttonsArray[6].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[6].setIcon(buttonsArray[2].getIcon());
                buttonsArray[2].setIcon(blank);
                currentscore++;
            }
        }
        if(button == buttonsArray[3]) {
            if (buttonsArray[2].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[2].setIcon(buttonsArray[3].getIcon());
                buttonsArray[3].setIcon(blank);
                currentscore++;
            }
            if (buttonsArray[7].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[7].setIcon(buttonsArray[3].getIcon());
                buttonsArray[3].setIcon(blank);
                currentscore++;
            }
        }
        if(button == buttonsArray[4]) {
            if (buttonsArray[0].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[0].setIcon(buttonsArray[4].getIcon());
                buttonsArray[4].setIcon(blank);
                currentscore++;
            }
            if (buttonsArray[5].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[5].setIcon(buttonsArray[4].getIcon());
                buttonsArray[4].setIcon(blank);
                currentscore++;
            }
            if (buttonsArray[8].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[8].setIcon(buttonsArray[4].getIcon());
                buttonsArray[4].setIcon(blank);
                currentscore++;
            }
        }
        if(button == buttonsArray[5]) {
            if (buttonsArray[1].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[1].setIcon(buttonsArray[5].getIcon());
                buttonsArray[5].setIcon(blank);
                currentscore++;
            }
            if (buttonsArray[4].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[4].setIcon(buttonsArray[5].getIcon());
                buttonsArray[5].setIcon(blank);
                currentscore++;
            }
            if (buttonsArray[6].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[6].setIcon(buttonsArray[5].getIcon());
                buttonsArray[5].setIcon(blank);
                currentscore++;
            }
            if (buttonsArray[9].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[9].setIcon(buttonsArray[5].getIcon());
                buttonsArray[5].setIcon(blank);
                currentscore++;
            }
        }
        if(button == buttonsArray[6]) {
            if (buttonsArray[2].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[2].setIcon(buttonsArray[6].getIcon());
                buttonsArray[6].setIcon(blank);
                currentscore++;
            }
            if (buttonsArray[7].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[7].setIcon(buttonsArray[6].getIcon());
                buttonsArray[6].setIcon(blank);
                currentscore++;
            }
            if (buttonsArray[5].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[5].setIcon(buttonsArray[6].getIcon());
                buttonsArray[6].setIcon(blank);
                currentscore++;
            }
            if (buttonsArray[10].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[10].setIcon(buttonsArray[6].getIcon());
                buttonsArray[6].setIcon(blank);
                currentscore++;
            }
        }
        if(button == buttonsArray[7]) {
            if (buttonsArray[3].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[3].setIcon(buttonsArray[7].getIcon());
                buttonsArray[7].setIcon(blank);
                currentscore++;
            }
            if (buttonsArray[6].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[6].setIcon(buttonsArray[7].getIcon());
                buttonsArray[7].setIcon(blank);
                currentscore++;
            }
            if (buttonsArray[11].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[11].setIcon(buttonsArray[7].getIcon());
                buttonsArray[7].setIcon(blank);
                currentscore++;
            }
        }
        if(button == buttonsArray[8]) {
            if (buttonsArray[4].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[4].setIcon(buttonsArray[8].getIcon());
                buttonsArray[8].setIcon(blank);
                currentscore++;
            }
            if (buttonsArray[9].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[9].setIcon(buttonsArray[8].getIcon());
                buttonsArray[8].setIcon(blank);
                currentscore++;
            }
        }
        if(button == buttonsArray[9]) {
            if (buttonsArray[8].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[8].setIcon(buttonsArray[9].getIcon());
                buttonsArray[9].setIcon(blank);
                currentscore++;
            }
            if (buttonsArray[5].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[5].setIcon(buttonsArray[9].getIcon());
                buttonsArray[9].setIcon(blank);
                currentscore++;
            }
            if (buttonsArray[10].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[10].setIcon(buttonsArray[9].getIcon());
                buttonsArray[9].setIcon(blank);
                currentscore++;
            }
        }
        if(button == buttonsArray[10]) {
            if (buttonsArray[9].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[9].setIcon(buttonsArray[10].getIcon());
                buttonsArray[10].setIcon(blank);
                currentscore++;
            }
            if (buttonsArray[6].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[6].setIcon(buttonsArray[10].getIcon());
                buttonsArray[10].setIcon(blank);
                currentscore++;
            }
            if (buttonsArray[11].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[11].setIcon(buttonsArray[10].getIcon());
                buttonsArray[10].setIcon(blank);
                currentscore++;
            }
        }
        if(button == buttonsArray[11]) {
            if (buttonsArray[7].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[7].setIcon(buttonsArray[11].getIcon());
                buttonsArray[11].setIcon(blank);
                currentscore++;
            }
            if (buttonsArray[10].getIcon().toString().equals("blank.jpg")) {
                buttonsArray[10].setIcon(buttonsArray[11].getIcon());
                buttonsArray[11].setIcon(blank);
                currentscore++;
            }
        }
        /**a loop which says that if all of the images are in the correct locations,
         * print "you win!" and run the highscores table class!*/
        for (int i=0; i<11; i++) {
            if (buttonsArray[i+1].getIcon().toString().equals("bart" + i + ".jpg") &&
                    buttonsArray[0].getIcon().toString().equals("blank.jpg") &&
                    !won){
                System.out.println("You Win!!!");
                HighScores scoretable = new HighScores();
                won = true;
                scoretable.table(currentscore);
            }
        }

    }

}