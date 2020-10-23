package Lab_16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AddOrderForm extends JFrame {


    private void nextStep(Order o){
        AddItemForm aif = new AddItemForm(tableOrder, t_num, mFrame);
    }

    private boolean set_order(int t_table_num){
        try {
            tom.add(tableOrder, t_table_num);
            return true;
        } catch (TableOrdersManager.OrderAlreadyAddedException orderAlreadyAddedException) {
            if(tom.freeTableNumbers().length>0){
                t_num=tom.freeTableNumbers()[0];
                return set_order(tom.freeTableNumbers()[0]);
            }
        } catch (TableOrdersManager.IllegalTableNumber illegalTableNumber){
            if(tom.freeTableNumbers().length>0){
                t_num=tom.freeTableNumbers()[0];
                return set_order(tom.freeTableNumbers()[0]);
            }
        }
        JOptionPane.showMessageDialog(null, "Restaurant is full");
        return false;
    }


    TableOrder tableOrder = new TableOrder();;
    TableOrdersManager tom;
    JTextArea order_info;
    int t_num;
    MFrame mFrame;
    AddOrderForm(TableOrdersManager tom, int t_num, MFrame mFrame){
        super("Order maker");
        this.tom = tom;
        this.order_info=order_info;
        this.t_num=t_num;
        this.mFrame=mFrame;
        setLayout(new GridLayout(5, 2));
        setResizable(false);
        setSize(400, 200);
        JLabel fname = new JLabel("First name: ");
        fname.setHorizontalAlignment(JLabel.CENTER);
        JLabel sname = new JLabel("Second name: ");
        sname.setHorizontalAlignment(JLabel.CENTER);
        JLabel age = new JLabel("Age name: ");
        age.setHorizontalAlignment(JLabel.CENTER);
        JLabel table_num = new JLabel("Table num [0-4]: ");
        table_num.setHorizontalAlignment(JLabel.CENTER);
        JTextField t_fname = new JTextField();
        JTextField t_sname = new JTextField();
        JTextField t_age = new JTextField();
        JTextField t_table_num = new JTextField();
        t_table_num.setHorizontalAlignment(JTextField.CENTER);
        t_table_num.setText(Integer.toString(t_num));
        t_table_num.setEditable(false);
        JButton IDN = new JButton("I don't know");
        JButton b_nextStep = new JButton("Next step");
        add(fname);
        add(t_fname);
        add(sname);
        add(t_sname);
        add(age);
        add(t_age);
        add(table_num);
        add(t_table_num);
        add(IDN);
        add(b_nextStep);
        setVisible(true);

        b_nextStep.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Customer customer = new Customer(t_fname.getText(), t_sname.getText(), Integer.parseInt(t_age.getText()), Address.EMPTY_ADDRESS);
                tableOrder.setCustomer(customer);
                boolean check = set_order(Integer.parseInt(t_table_num.getText()));
                mFrame.update(t_num);
                if(check){nextStep(tableOrder);}
                dispose();
            }
        });

        IDN.addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                boolean check = set_order(Integer.parseInt(t_table_num.getText()));
                System.out.println(check);
                mFrame.update(t_num);
                if(check){nextStep(tableOrder);}
                dispose();
            }
        });
    }
}
