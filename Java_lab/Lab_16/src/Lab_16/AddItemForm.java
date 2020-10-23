package Lab_16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AddItemForm extends JFrame {

    public void add_drink(Drink drink){
        Customer customer = tableOrder.getCustomer();
        if ((customer==null || customer.getAge()<18) && drink.isAlcoholicDrink()){
            JOptionPane.showMessageDialog(null, "You mustn't sell alchohol to men under 18!");
        }
        else{
            tableOrder.add(drink);
        }
    }
    TableOrder tableOrder;

    AddItemForm(TableOrder tableOrder, int t_num, MFrame mFrame){
        super("Add item form");
        this.tableOrder = tableOrder;
        setSize(400,  500);
        setResizable(false);
        setLayout(new GridLayout(0, 2));
        JLabel l_drinks = new JLabel("Drinks");
        l_drinks.setHorizontalAlignment(JLabel.CENTER);
        JLabel l_dishes = new JLabel("Dish set");
        l_dishes.setHorizontalAlignment(JLabel.CENTER);
        JPanel drinks = new JPanel(new GridLayout(19, 0));
        JPanel dishes = new JPanel();
        JPanel dishes_menu = new JPanel(new GridLayout(8, 0));
        JLabel l_dish_name = new JLabel("Enter dish name: ");
        JTextField t_dish_name = new JTextField();
        JLabel l_dish_desc = new JLabel("Enter dish description: ");
        JTextField t_dish_desc = new JTextField();
        JLabel l_dish_cost = new JLabel("Enter dish cost: ");
        JTextField t_dish_cost = new JTextField();
        JButton add_dish = new JButton("Add Dish");
        add_dish.setMargin(new Insets(5, 62, 5, 62));
        JButton close = new JButton("Finish");
        close.setMargin(new Insets(5, 70, 5, 70));


        JButton beer = new JButton("Beer");
        beer.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                add_drink(new Drink(DrinkTypeEnum.BEER, "Light", 120));
                mFrame.update(t_num);
            }
        });

        JButton wine = new JButton("Wine");
        wine.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                add_drink(new Drink(DrinkTypeEnum.WINE, "Red", 325));
                mFrame.update(t_num);
            }
        });

        JButton vodka = new JButton("Vodka");
        vodka.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                add_drink(new Drink(DrinkTypeEnum.VODKA, "Russian", 100));
                mFrame.update(t_num);
            }
        });

        JButton brandy = new JButton("Brendi");
        brandy.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                add_drink(new Drink(DrinkTypeEnum.BRANDY, "Hot Rat", 130));
                mFrame.update(t_num);
            }
        });

        JButton champagne = new JButton("Champagne");
        champagne.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                add_drink(new Drink(DrinkTypeEnum.CHAMPAGNE, "from the Paris", 610));
                mFrame.update(t_num);
            }
        });

        JButton whiskey = new JButton("Whiskey");
        whiskey.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                add_drink(new Drink(DrinkTypeEnum.WHISKEY, "Red Label", 250));
                mFrame.update(t_num);
            }
        });

        JButton tequila = new JButton("Tequila");
        tequila.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                add_drink(new Drink(DrinkTypeEnum.TEQUILA, "with Guava juice", 324));
                mFrame.update(t_num);
            }
        });

        JButton rum = new JButton("Rum");
        rum.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                add_drink(new Drink(DrinkTypeEnum.RUM, "for real pirates", 144));
                mFrame.update(t_num);
            }
        });

        JButton vermouth = new JButton("Vermouth");
        vermouth.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                add_drink(new Drink(DrinkTypeEnum.VERMOUTH, "Special with herbs", 437));
                mFrame.update(t_num);
            }
        });

        JButton liquor = new JButton("Liquor");
        liquor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                add_drink(new Drink(DrinkTypeEnum.LIQUOR, "veryyy sweeeet", 223));
                mFrame.update(t_num);
            }
        });

        JButton jagermeister = new JButton("Jagermeister");
        jagermeister.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                add_drink(new Drink(DrinkTypeEnum.JAGERMEISTER, "for real deer hunters", 506));
                mFrame.update(t_num);
            }
        });

        JButton juice = new JButton("Juice");
        juice.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                add_drink(new Drink(DrinkTypeEnum.JUICE, "Apple juice", 130));
                mFrame.update(t_num);
            }
        });

        JButton coffee = new JButton("Coffee");
        coffee.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                add_drink(new Drink(DrinkTypeEnum.COFFEE, "Latte", 90));
                mFrame.update(t_num);
            }
        });

        JButton g_tea = new JButton("Green tea");
        g_tea.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                add_drink(new Drink(DrinkTypeEnum.GREEN_TEA, "from China with love", 50));
                mFrame.update(t_num);
            }
        });

        JButton b_tea = new JButton("Black tea");
        b_tea.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                add_drink(new Drink(DrinkTypeEnum.BLACK_TEA, "from India with love", 50));
                mFrame.update(t_num);
            }
        });

        JButton milk = new JButton("Milk");
        milk.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                add_drink(new Drink(DrinkTypeEnum.MILK, "Ultrawhite", 20));
                mFrame.update(t_num);
            }
        });

        JButton water = new JButton("Water");
        water.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                add_drink(new Drink(DrinkTypeEnum.WATER, "Cheap water", 1));
                mFrame.update(t_num);
            }
        });

        JButton soda = new JButton("Soda");
        soda.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                add_drink(new Drink(DrinkTypeEnum.SODA, "Not cheap water", 10));
                mFrame.update(t_num);
            }
        });

        add_dish.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String name = t_dish_name.getText();
                String desc = t_dish_desc.getText();
                int cost = 10;
                try{
                    cost = Integer.parseInt(t_dish_cost.getText());
                } catch (Exception t){
                    System.out.println(t.getMessage());
                }
                Dish dish = new Dish(name, desc, cost);
                tableOrder.add(dish);
                t_dish_name.setText("");
                t_dish_desc.setText("");
                t_dish_cost.setText("");
                mFrame.update(t_num);
            }
        });

        close.addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dispose();
            }
        });


        add(drinks);
        add(dishes);
        drinks.add(l_drinks);
        drinks.add(beer);
        drinks.add(wine);
        drinks.add(vodka);
        drinks.add(brandy);
        drinks.add(champagne);
        drinks.add(whiskey);
        drinks.add(tequila);
        drinks.add(rum);
        drinks.add(vermouth);
        drinks.add(liquor);
        drinks.add(jagermeister);
        drinks.add(juice);
        drinks.add(coffee);
        drinks.add(b_tea);
        drinks.add(g_tea);
        drinks.add(milk);
        drinks.add(water);
        drinks.add(soda);
        dishes.add(dishes_menu);
        dishes_menu.add(l_dishes);
        dishes_menu.add(l_dish_name);
        dishes_menu.add(t_dish_name);
        dishes_menu.add(l_dish_desc);
        dishes_menu.add(t_dish_desc);
        dishes_menu.add(l_dish_cost);
        dishes_menu.add(t_dish_cost);
        dishes.add(add_dish);
        dishes.add(close);


        setVisible(true);
    }
}
