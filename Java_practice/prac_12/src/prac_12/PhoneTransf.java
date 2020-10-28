package prac_12;

public class PhoneTransf {
    String country_code;
    String f3;
    String s3;
    String f4;

    public PhoneTransf(String phone){
        if (phone.charAt(0) == '8'){
            country_code="7";
            f3=phone.substring(1, 4);
            s3=phone.substring(4, 7);
            f4=phone.substring(7);
        }
        else {
            country_code=phone.substring(1, phone.length()-10);
            f3=phone.substring(phone.length()-10, phone.length()-7);
            s3=phone.substring(phone.length()-7, phone.length()-4);
            f4=phone.substring(phone.length()-4);
        }
    }

    public String to_String(){
        return "+" + country_code + " " + f3 + "-" + s3 + "-" + f4;
    }
}
