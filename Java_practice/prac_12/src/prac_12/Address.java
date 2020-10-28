package prac_12;

import java.util.StringTokenizer;

public class Address {
    public String country;
    public String region;
    public String town;
    public String street;
    public String house;
    public String korpus;
    public String flat;

    public Address ( String address){
        String[] temp = address.split(",");
        for (int i = 0; i < temp.length; i++) {
            temp[i]=temp[i].trim();
        }

        country=temp[0];
        region=temp[1];
        town=temp[2];
        street=temp[3];
        korpus=temp[4];
        flat=temp[5];

    }

    public Address ( String address, String delim){
        StringTokenizer st = new StringTokenizer(address, delim);
        country=st.nextToken().trim();
        region=st.nextToken().trim();
        town=st.nextToken().trim();
        street=st.nextToken().trim();
        korpus=st.nextToken().trim();
        flat=st.nextToken().trim();
    }

    public String to_String(){
        return country+"\n"+region+"\n"+town+"\n"+street+"\n"+korpus+"\n"+flat+"\n";
    }
}
