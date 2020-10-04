package Lab_12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class TestRegEx {
    String RegEx="[ \\t\\v\\r\\n\\f][0-9a-z]+@[0-9a-z.]+[\\n\\s]";
    String Text="Пример использования регулярных выражений \n" +
            "Дана строка: bigzet20012@mail.ru myhost@@@com.ru, @my.ru, Julia String @@@ma@iill@.r.u\n" +
            "Регулярным выражением было найдено следующее совпадение:";
    Pattern pattern = Pattern.compile(RegEx);
    Matcher matcher = pattern.matcher(Text);
    public TestRegEx(){
        System.out.println(Text);
        while(matcher.find()){
            System.out.println(matcher.group().strip());
        }
    }
}
