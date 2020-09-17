package Prac_4;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class MFrame extends JFrame{

    int C_Milan = 0;
    int C_Madrid = 0;
    Font fnt = new Font("Times new roman",Font.BOLD,16);
    JButton jbtn_1 = new JButton("AC Milan");
    JButton jbtn_2 = new JButton("Real Madrid");
    JLabel jlbl_1 = new JLabel("Result: 0 X 0");
    JLabel jlbl_2 = new JLabel("Last Scorer: N/A");
    JLabel jlbl_3 = new JLabel("Winner: DRAW");
    JPanel jpnl_1 = new JPanel();
    JPanel jpnl_2 = new JPanel();
    JPanel jpnl_3 = new JPanel();
    private void chng_winner(){
        if (this.C_Madrid>C_Milan){
            jlbl_3.setText("Winner: Real Madrid");
        }
        else if (this.C_Madrid==C_Milan){
            jlbl_3.setText("Winner: DRAW");
        }
        else {
            jlbl_3.setText("Winner: AC Milan");
        }
    }
    MFrame(){
        super("PRACTICE_4");
        setLayout(new GridLayout(3, 1));
        setSize(600,300);
        jpnl_1.setBackground(new Color(255, 255, 255));
        add(jpnl_1);
        jpnl_2.setBackground(new Color(255, 50, 50));
        add(jpnl_2);
        jpnl_3.setBackground(new Color(255, 255, 255));
        add(jpnl_3);

        jpnl_1.setLayout(new GridLayout(1, 3));
        jlbl_1.setHorizontalAlignment(JLabel.CENTER);
        jlbl_2.setHorizontalAlignment(JLabel.CENTER);
        jlbl_3.setHorizontalAlignment(JLabel.CENTER);
        jlbl_1.setFont(fnt);
        jlbl_2.setFont(fnt);
        jlbl_3.setFont(fnt);
        jpnl_1.add(jlbl_1);
        jpnl_1.add(jlbl_2);
        jpnl_1.add(jlbl_3);
        jbtn_1.setBackground(new Color(255, 220, 220));
        jbtn_2.setBackground(new Color(255, 220, 220));
        jbtn_1.setHorizontalAlignment(JButton.CENTER);
        jbtn_2.setHorizontalAlignment(JButton.CENTER);
        jbtn_1.setFocusPainted(false);
        jbtn_2.setFocusPainted(false);
        jbtn_1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) { }
            @Override
            public void mousePressed(MouseEvent e) {
                C_Milan+=1;
                jlbl_1.setText(String.format("Result: %d  X %d ", C_Milan, C_Madrid));
                jlbl_2.setText("Last Scorer: AC Milan");
                chng_winner();

            }
            @Override
            public void mouseReleased(MouseEvent e) { }
            @Override
            public void mouseEntered(MouseEvent e) { }
            @Override
            public void mouseExited(MouseEvent e) { }
        });
        jbtn_2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) { }
            @Override
            public void mousePressed(MouseEvent e) {
                C_Madrid+=1;
                jlbl_1.setText(String.format("Result: %d  X %d ", C_Milan, C_Madrid));
                jlbl_2.setText("Last Scorer: Real Madrid");
                chng_winner();
            }
            @Override
            public void mouseReleased(MouseEvent e) { }
            @Override
            public void mouseEntered(MouseEvent e) { }
            @Override
            public void mouseExited(MouseEvent e) { }
        });
        jpnl_3.setLayout(new GridLayout(1, 2));
        jpnl_3.add(jbtn_1);
        jpnl_3.add(jbtn_2);
        setVisible(true);
    }
}
