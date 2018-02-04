import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Board extends JFrame implements MouseListener{

    public Board(){
        setResizable(true);
        setSize(400, 400);
        setVisible(true);

        addMouseListener(this);

        /*
        Ball b2 = new Ball(1, 1);
        Ball b3 = new Ball(390, 390);

        b2.add(b3);

        getContentPane().add(b2);

        Thread xx = new Thread(b2);
        Thread yy = new Thread(b3);
        xx.start();
        yy.start();
*/
    }



    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
            int x;
            int y;
            x = e.getXOnScreen();
            y = e.getYOnScreen();
            Ball b3 = new Ball(x,y);
            getContentPane().add(b3);
            Thread temp = new Thread(b3);
            temp.start();
            repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
