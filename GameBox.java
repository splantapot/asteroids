import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;
import java.lang.Thread;

import objs.Player;

public class GameBox extends JPanel implements Runnable{
    int wSize;
    public GameBox(int w, int h) {
        this.setPreferredSize(new Dimension(w, h));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        wSize = w;
    }
    
    Player player = new Player(60, Color.RED, wSize,600);
    
    Thread gameThread;
    public void startThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }
    
    //Criação dos valores
    
    @Override
    public void run() {
        while (gameThread != null) {
            //game loop ------
            update();
            
            repaint();
            
            player.view();
        }
    }

    public void update() {
        //aqui está a programação dos movimentos, colisões e atualizações


    }

    public void paintComponent(Graphics g) {
        //aqui fica a renderização
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        player.drawPlayer(g2);
    }
}
