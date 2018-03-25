import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class HighScores extends JFrame implements ActionListener {


    TreeMap<Integer, String> highScores = new TreeMap<Integer, String>(); //using tree map allows me to put the scores in Ascending order
    String[] highScoreName = new String[10];
    public int[] highScoreScore = new int[10];
    JLabel[] highScoreNameLabel = new JLabel[10];
    JLabel[] highScoreScoreLabel = new JLabel[10];
    JFrame highScoreFram = new JFrame ();
    JButton play = new JButton("Play Again");



    public void table(int score) throws IOException {

        /**
         * prompts the user to type their name in and stores it in
         * the string "yourName"
         */
        String yourName;
        yourName =JOptionPane.showInputDialog("WELL DONE, YOU WIN!! What is your name?");

        /**
         * sets the name and size of the window and makes it visible,
         * creates a JPanel which I will put the users scores and names into
         * and sets the layout of the panel to a 11 by 2 grid
         */
        highScoreFram.setTitle("High Scores");     //changes window title
        highScoreFram.setSize(411,300);        //changes window size
        highScoreFram.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //closes window but keeps app running
        highScoreFram.setVisible(true);        //makes window visible
        JPanel panel = new JPanel(); //creates a JPanel which I will put my JLabels in
        GridLayout layout = new GridLayout(11,2);
        panel.setLayout(layout);

        /**
         * creates a string of the txt document
         * and reads the document line by line
         */
        String fileName = "highscores.txt";
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;

        int counter = 0;
        int j = 0;

        /**
         * loop to set the even lines in the txt
         * document as the users names, and all of the odd
         * lines are their scores.
         */
        while ((line = br.readLine()) != null) {
            if((counter & 1) == 0){
                highScoreScore[j] = Integer.parseInt(line);
                System.out.println("name" + line);
                counter++;
            }else{
                System.out.println("score" + line);
                highScoreName[j] = line;
                counter++;
                highScores.put(highScoreScore[j],highScoreName[j]);
                j++;
            }
        }
        br.close();

        /**a loop to print all the users names and their scores*/
        for(int i = 0; i<10; i++){
            System.out.println(highScoreName[i]);
            System.out.println(highScoreScore[i]);
        }


        updateHighScores(yourName, score);

        /**
         * goes through the tree map and
         */
        int count = 0;
        for(Map.Entry<Integer,String> entry : highScores.entrySet()) {
            highScoreNameLabel[count] = new JLabel(String.valueOf(entry.getKey()));
            highScoreScoreLabel[count] = new JLabel(entry.getValue());
            count++;
        }

        /**adds the users names and scores to the panel*/
        for(int i = 0; i<10; i++) {
            panel.add(highScoreNameLabel[i]);
            panel.add(highScoreScoreLabel[i]);
        }
        /**
         *  adds action listener to the play again button and then adds
         *  it to the panel
         */
        play.addActionListener(this);
        panel.add(play);

        highScoreFram.setContentPane(panel);   //adds the panel to the frame

    }


    @Override
    public void actionPerformed(ActionEvent a){
        press(a.getSource());
    }

    /**if the play again button is pressed, it disposes of the high
     score frame, to allow the game window to be played again */
    public void press(Object pressed){
        if (pressed == play){
            highScoreFram.dispose();
        }
    }

    public void updateHighScores(String name, int score) throws FileNotFoundException, UnsupportedEncodingException {
        highScores.put(score,name);
        updateHighScoresTxt();
    }

    /**
     * print writer allows me to write into a document
     * @throws FileNotFoundException
     * @throws UnsupportedEncodingException
     */

    public void updateHighScoresTxt() throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("highscores.txt");
        int count = 0;

        /**
         *
         */

        for(Map.Entry<Integer,String> entry : highScores.entrySet()) {
            if(count < 10) {
                writer.write(String.valueOf(entry.getKey()));
                writer.write("\n");
                writer.write(entry.getValue());
                writer.write("\n");
                count++;
            }
        }
        writer.close();
    }
}