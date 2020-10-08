package Prac_10_3;

import java.io.*;
import java.util.Scanner;

public class TextDocument implements IDocument{
    File file;
    TextDocument(){
        this.file = new File("file.txt");
    }
    TextDocument(File file){
        this.file = file;
    }
    public String readFile() throws FileNotFoundException {
        FileReader fr = new FileReader(file);
        Scanner scan = new Scanner(fr);
        String text = "";

        while  (scan.hasNextLine()){
            text+=scan.nextLine();
        }
        return text;
    }

    public void writeFile(String text) throws IOException {
        PrintWriter out = new PrintWriter(file.getAbsoluteFile());
        try{
            out.print(text);
        } finally {
            out.close();
        }
    }
}
