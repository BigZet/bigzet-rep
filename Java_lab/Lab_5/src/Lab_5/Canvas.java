package Lab_5;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Canvas extends JPanel {
    Shape[] shapes = {new Rectangle(), new Circle(), new Square()};
    final static float dash1[] = {10.0f};
    public Canvas(){
        setOpaque(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Random r = new Random();
        //super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        //g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //g2d.setColor(Color.black);
        //g2d.fillRect(100, 100, 200, 200);
        Shape dr = shapes[r.nextInt(2)].create();
        System.out.println(dr);
        System.out.println(dr.getColor());
        System.out.println(dr.getname());
        if (dr.getname() == 1){
            g2d.setColor(dr.getColor());
            g2d.fillOval(30, 30, (int)dr.getLength()*8, (int)dr.getLength()*8);
            System.out.println((int)dr.getLength()*100);
            System.out.println((int)dr.getLength()*100);
        }
        if (dr.getname() == 2){
            g2d.setColor(dr.getColor());
            g2d.fillRect(30, 30, (int)dr.getLength()*8, (int)dr.getWidth()*8);
        }
        if (dr.getname() == 3){
            g2d.setColor(dr.getColor());
            g2d.fillRect(30, 30, (int)dr.getLength()*8, (int)dr.getLength()*8);
        }





    }
}
