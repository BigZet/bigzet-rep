package Lab_16;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MFrame extends JFrame {

    enum Palette{
        UNDER_WHITE(209, 204, 196),
        UNDER_GRAY(225, 213, 165),
        UNDER_GRAY_2(237, 224, 173),
        UNDER_BROWN(160, 121, 69),
        BROWN(124, 74, 36),
        UNDER_BLACK(49, 19, 14);


        private Color color;
        Palette(int r, int g, int b){
            this.color = new Color(r, g, b);
        }

        public Color getColor() {
            return color;
        }
    }

    public void update(int t_num){
        orderInformation.setText(tom.to_String(t_num));
    }


    String[] table_nums = {"First table", "Second table", "Third table", "Fourth table", "Fifth table"};

    JTextArea orderInformation;
    TableOrdersManager tom;
    MFrame(TableOrdersManager tom, InternetOrdersManager iom){
        super("Restaurant Service");
        this.tom = tom;

        this.setSize(500,800);
        this.setLayout(new BorderLayout());

        JPanel labels = new JPanel(new GridLayout(0, 2));
        labels.setBackground(Palette.UNDER_WHITE.getColor());
        labels.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        JLabel label_tableOrders = new JLabel("Table orders");
        label_tableOrders.setFont(new Font("Arial", Font.TRUETYPE_FONT, 15));
        label_tableOrders.setHorizontalAlignment(0);
        JLabel label_internetOrders = new JLabel("Internet orders");
        label_internetOrders.setHorizontalAlignment(0);
        label_internetOrders.setFont(new Font("Arial", Font.TRUETYPE_FONT, 15));
        JPanel panelOrders = new JPanel(new GridLayout(0, 2));

        JPanel panelBottom = new JPanel(new BorderLayout());

        JPanel panelButtons = new JPanel(new GridLayout(2, 2));

        orderInformation = new JTextArea();
        orderInformation.setText("Select order");
        orderInformation.setBackground(new Color(255, 250, 230));
        orderInformation.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(orderInformation);


        JList tableOrders = new JList();
        DefaultListCellRenderer renderer =  (DefaultListCellRenderer)tableOrders.getCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);

        tableOrders.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int selected = ((JList<?>)e.getSource()).getSelectedIndex();
                orderInformation.setText(tom.to_String(selected));
                System.out.println(selected);
            }
        });
        tableOrders.setLayoutOrientation(JList.VERTICAL);
        tableOrders.setListData(table_nums);
        tableOrders.setBackground(Palette.UNDER_GRAY.getColor());
        tableOrders.setSelectedIndex(0);

        JList internetOrders = new JList();
        internetOrders.setLayoutOrientation(JList.VERTICAL);
        internetOrders.setBackground(Palette.UNDER_GRAY_2.getColor());




        add(labels, BorderLayout.PAGE_START);
        labels.add(label_tableOrders);
        labels.add(label_internetOrders);

        add(panelOrders, BorderLayout.CENTER);
        panelOrders.add(tableOrders);
        panelOrders.add(internetOrders);

        add(panelBottom, BorderLayout.PAGE_END);
        panelBottom.add(orderInformation, BorderLayout.CENTER);
        panelBottom.add(panelButtons, BorderLayout.PAGE_END);


        JButton addIO = new JButton("Add Internet Order");
        addIO.setBackground(new Color(231, 197, 136));
        JButton addTO = new JButton("Add Table Order");
        addTO.setBackground(new Color(236, 203, 167));
        addTO.addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                AddOrder(tom, tableOrders);
            }
        });
        JButton addTOI = new JButton("Add Item to Table Order");
        addTOI.setBackground(new Color(245, 217, 161));
        addTOI.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                AddItem(tom, tableOrders);

            }
        });
        JButton removeTO = new JButton("Remove Table Order");
        removeTO.setBackground(new Color(236, 206, 164));
        removeTO.addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int selected = tableOrders.getSelectedIndex();
                tom.remove(selected);
                orderInformation.setText("DELETED");
            }
        });
        panelButtons.add(addTO);
        panelButtons.add(addIO);
        panelButtons.add(addTOI);
        panelButtons.add(removeTO);

        this.setResizable(false);
        this.setVisible(true);
    }

    public void AddItem(TableOrdersManager tom, JList tableOrders) {
        if (tom.getOrder(tableOrders.getSelectedIndex())==null){
            JOptionPane.showMessageDialog(null, "This order is not exists");
        }
        else {
            AddItemForm adf = new AddItemForm((TableOrder) tom.getOrder(tableOrders.getSelectedIndex()), tableOrders.getSelectedIndex(), this);
        }
    }

    public void AddOrder(TableOrdersManager tom, JList tableOrders) {
        AddOrderForm adf = new AddOrderForm(tom, tableOrders.getSelectedIndex(), this);
    }


}
