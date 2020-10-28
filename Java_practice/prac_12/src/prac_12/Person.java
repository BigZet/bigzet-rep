package prac_12;

public class Person {
    StringBuilder sb = new StringBuilder();

    public Person(String first_name, String second_name, String third_name){
        sb.append(first_name).append(" ").append(second_name.charAt(0)).append(".").append(third_name.charAt(0)).append(".");
    }

    public Person(String first_name){
        sb.append(first_name);
    }
    public String getFIO(){
        return sb.toString();
    }
}
