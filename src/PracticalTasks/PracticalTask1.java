package PracticalTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticalTask1 {
    public static void main(String[] args) {

        String pattern = "[IT]+";
        String text = "IT AcIT ademy";


        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.print(text.substring(m.start(), m.end()) + "*");
        }
    }
}
