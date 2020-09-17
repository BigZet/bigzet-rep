package Lab_5;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.function.Supplier;

public class MFrame extends JFrame {
Random_creator creators = new Random_creator(new Shape_creator[]{new Circle_creator(), new Rectangle_creator(), new Square_creator()});

    MFrame(){
        super("Lab_5");
        setSize(500, 300);
        setVisible(true);
        setLayout(new GridLayout(2, 10));
        JPanel[] jps = new JPanel[20];
        for (int i = 0; i<20; i++){
            JPanel j = new JPanel();
            jps[i]=j;
            add(j);
        }

    }

    public void paint (Graphics g){
        super.paint(g);
        for (int i = 0; i<20; i++){
            Shape sh = creators.create();
            if (sh.typeS==1){
                double side = (Square)sh.side();
            }
        }
    }

}
