package Lab_12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class Main {
    public static void check_pswd(){
        Pattern pattern = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(_)?.{8,})");
        Scanner sc =new Scanner(System.in);
        String text= sc.nextLine();
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.find()?"Пароль соответсвует":"Пароль не соответсвует");
    }
    public static void main(String[] args) {
        String[] regexprs = {"\\d*[\\.,]\\d{2}\\s(USD|RUB|EU)",  "([0-2][0-9]|3[0-1])\\/(0[0-9]|1[0-2])\\/(19|[2-9]\\d)\\d{2}", "[ \\t\\v\\r\\n\\f][0-9a-z]+@[0-9a-z.]+[\\n\\s]"};
        TestRegEx testRegEx1 = new TestRegEx(regexprs[0]);
        TestRegEx testRegEx2 = new TestRegEx(regexprs[1]);
        TestRegEx testRegEx3 = new TestRegEx(regexprs[2]);
        check_pswd();
    }
}
