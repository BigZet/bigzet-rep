package Prac_10_3;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;

public class CreateTextDocument implements ICreateDocument{
    public IDocument CreateNew() {
        System.out.println("NEW");
        return new TextDocument();
    }

    public IDocument CreateOpen() {
        JFileChooser fileopen = new JFileChooser();
        FileNameExtensionFilter fileNameExtensionFilter = new FileNameExtensionFilter("Text files", "txt");
        fileopen.setFileFilter(fileNameExtensionFilter);
        int ret = fileopen.showDialog(null, "Open file");
        if (ret==JFileChooser.APPROVE_OPTION){
            File file = fileopen.getSelectedFile();
            System.out.println("OPEN");
            return new TextDocument(file);
        }
        System.out.println("NEW");
        return new TextDocument();
    }
}
