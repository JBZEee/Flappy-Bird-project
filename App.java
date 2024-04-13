package FlappyBird;
import javax.swing.JFrame;

public class App{
    public static void main (String[] args){
        int boardWidth = 360; //px
        int boardHeight = 640; //px
        JFrame frame = new JFrame("Flappy Bird");
        //frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();// this is used because we want the dimensions not including the title bar other wise the title bar will also be considered in the panel
        frame.setVisible(true);
    }
}