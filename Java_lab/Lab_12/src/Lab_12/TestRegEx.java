package Lab_12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class TestRegEx {
    String Text="\nПример использования регулярных выражений \n" +
            "Дана строка: (1+8)-9 25.43 USD 666.666 RUB 89.89 EU 12/20/2001 04/09/1999 \n1/03/2001 bigzet200120@mail.ru myhost@@@com.ru, @my.ru, Julia String @@@ma@iill@.r.u\n" +
            "Регулярным выражением было найдено следующее совпадение:";


    public TestRegEx(String RegEx){
        Pattern pattern = Pattern.compile(RegEx);
        Matcher matcher = pattern.matcher(Text);
        System.out.println(Text);
        while(matcher.find()){
            System.out.println(matcher.group().strip());
        }
    }
}
