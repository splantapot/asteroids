import objs.Player;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {

        final int gameWidth = 800;
        final int gameHeight = 600;

        JFrame gameWindow = new JFrame("Asteroids");
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setSize(gameWidth, gameHeight);
        gameWindow.setVisible(true);
        gameWindow.setResizable(false);

        GameBox gameBox = new GameBox(gameWidth, gameHeight);
        gameWindow.add(gameBox);
        gameWindow.pack();

        gameBox.startThread();
    }
}