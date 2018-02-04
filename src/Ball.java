import javax.swing.*;
import java.awt.*;

public class Ball extends JPanel implements Runnable {
    private int x, y, xDx, yDy, color;
    private final int MAX_X = 400, MAX_Y = 400;

    public Ball(int x, int y){
        this.x = x;
        this.y = y;
        xDx = 1;
        yDy = 1;

        setOpaque(false);
        setPreferredSize(new Dimension(MAX_X, MAX_Y));
    }

    public void run(){
        while(true){
            try{
                Thread.sleep(15);
            } catch(InterruptedException exception){
                System.err.println(exception.toString());
            }

            repaint();
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.red);
        g.fillOval(this.x, this.y, 10, 10);
    }


}
