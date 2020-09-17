package Lab_5;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;

public class MFrame extends JFrame {


    MFrame(){
        super("Lab_5");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 700);
        setLayout(new GridLayout(4, 5));
        setVisible(true);
        for (int i =0; i<20; i++){
            Canvas c =new Canvas();
            this.getContentPane().add(c);

        }


    }
}
