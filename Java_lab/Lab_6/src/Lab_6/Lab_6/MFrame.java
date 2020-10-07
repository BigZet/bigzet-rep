package Lab_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class MFrame extends JFrame {
    Random r = new Random();
    int game_num = r.nextInt(20);
    int counter = 3;
    JTextField textField = new JTextField();
    String addmsg = "";
    Boolean ex = false;
    JButton btn = new JButton("Confirm");
    public void check(int x) {

        if(counter==1){
            addmsg="\nLoser, don't waste my time! Go out!";
        }
        if (x == game_num) {
            JOptionPane.showMessageDialog(null, "Congratulations! You win!", "Lab_game_inc", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        } else if (x < game_num) {
            counter -= 1;
            JOptionPane.showMessageDialog(null, String.format("You a wrong, your num is smaller than game num. You have %d chances %s", counter, addmsg), "Lab_game_inc", JOptionPane.PLAIN_MESSAGE);
        } else {
            counter -= 1;
            JOptionPane.showMessageDialog(null, String.format("You a wrong, your num is greater than game num. You have %d chances %s", counter, addmsg), "Lab_game_inc", JOptionPane.PLAIN_MESSAGE);
        }
        if (counter==0){
            System.exit(0);
        }

    }
    public void myAction(){
        int x=checkint(textField.getText());
        if (x==-1){
            textField.setText("");
            return;
        }
        check(x);
        textField.setText("");
    }

    public int checkint(String s){
        try {
            int x = Integer.parseInt(s.strip());
            return x;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please try again");
            return -1;
        }
    }
    MFrame(){
        super("UGADAYKA");
        setSize(new Dimension(300, 150));
        setDefaultCloseOperation( EXIT_ON_CLOSE);
        JPanel jp = new JPanel();
        add(jp);
        jp.setLayout(new GridLayout(2, 1));
        btn.setBackground(Color.CYAN);
        btn.setFocusPainted(false);
        btn.setFocusable(false);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myAction();
            }
        });
        jp.add(textField);
        jp.add(btn);
        System.out.println(game_num);
        setVisible(true);

    }
}
