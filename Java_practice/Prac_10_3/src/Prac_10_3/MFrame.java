package Prac_10_3;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MFrame extends JFrame {

    TextDocument txt;

    MFrame(){
        super("TextEditor");
        setLayout(null);
        setSize(new Dimension(500, 800));
        setResizable(false);
        JMenuBar menuBar = new JMenuBar();
        setBackground(Color.white);
        JEditorPane jta = new JEditorPane();
        jta.setContentType("text/plain");
        jta.setBounds(0, 0, 500, 800);
        add(jta);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenu fileMenu = new JMenu("File");
        JMenu newMenu = new JMenu("New");
        fileMenu.add(newMenu);
        fileMenu.addSeparator();
        JMenu openMenu = new JMenu("Open");
        fileMenu.add(openMenu);

        JMenuItem OpenText = new JMenuItem("Text file");
        JMenuItem NewText = new JMenuItem("Text file");
        JMenuItem SaveText = new JMenuItem("Save");
        fileMenu.add(SaveText);


        NewText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateTextDocument ctd = new CreateTextDocument();
                txt = (TextDocument)ctd.CreateNew();
            }
        });

        OpenText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateTextDocument ctd = new CreateTextDocument();
                txt = (TextDocument)ctd.CreateOpen();
                try {
                    jta.setText(txt.readFile());
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
            }
        });

        SaveText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    txt.writeFile(jta.getText());
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });


        newMenu.add(NewText);
        openMenu.add(OpenText);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);
        setVisible(true);

    }

}
