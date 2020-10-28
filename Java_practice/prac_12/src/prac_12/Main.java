package prac_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static final String PATH = "D:\\GitRep\\bigzet-rep\\Java_practice\\prac_12\\src\\text.txt";

    public static void main(String[] args) throws IOException {
        System.out.println(new Person("Chin", "Li", "Hyan").getFIO());
        AddressTest.test();
        ShirtTest.test();
        System.out.println(new PhoneTransf("+79153234531").to_String());
        System.out.println(new PhoneTransf("89153234531").to_String());

        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine().trim();

        FileReader file = new FileReader(filename);
        Scanner fsc = new Scanner(file);
        StringBuilder raw = new StringBuilder();
        while(fsc.hasNextLine()){
            raw.append(fsc.nextLine());
        }

        String[] parsed = raw.toString().split(" ");
        for (int i = 0; i < parsed.length; i++) {
            parsed[i]=parsed[i].trim();
        }

        ArrayList<String> sorted = new ArrayList<String>();

        req_sort(parsed[0].charAt(parsed[0].length()-1), parsed, sorted);
        file.close();

        for (String i :
             sorted) {
            System.out.println(i);

        }
    }

    public static void req_sort(char tail, String[] words, ArrayList<String> sorted){
        for (int i = 0; i < words.length; i++) {
            if (words[i].charAt(0)==tail && !sorted.contains(words[i])){
                sorted.add(words[i]);
                if (sorted.size()!=words.length){
                    req_sort(words[i].charAt(words[i].length()-1), words, sorted);
                }
                break;
            }
        }

    }
}
