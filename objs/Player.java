package objs;

import java.awt.Color;
import java.awt.Graphics2D;

public class Player {

    public int x, y, r, dir;
    public Color cor;

    public Player(int r, Color cor, int wScreen, int hScreen) {
        this.r = (r/2);
        this.cor = cor;
        this.dir = 0;
        this.x = (wScreen/2)-(r/2);
        this.y = (hScreen/2)-(r/2);
    }

    public void view() {
        System.out.println("x: "+x);
        System.out.println("y: "+y);
        System.out.println("r: "+r);
        System.out.println("dir: "+dir);
        System.out.println("Cor: "+cor);
        System.out.println("------------");
    }

    public void drawPlayer(Graphics2D g2) {
        g2.setColor(Color.RED);
        g2.fillArc(this.x, this.y, this.r*2, this.r*2, 0, 360);
    }
}
