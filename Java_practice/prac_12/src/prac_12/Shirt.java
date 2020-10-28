package prac_12;

import java.util.StringTokenizer;

public class Shirt {
    String ID;
    String name;
    String color;
    String size;

    public Shirt(String shirt){
        String[] factors = shirt.split(",");
        for (int i = 0; i < factors.length; i++) {
            factors[i]=factors[i].trim();
        }

        ID=factors[0];
        name=factors[1];
        color=factors[2];
        size=factors[3];
    }

    public String to_String(){
        return ID + "\n" + name + "\n" + color + "\n" + size + "\n";
    }

}
