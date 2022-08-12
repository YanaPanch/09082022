package PracticalTasks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticalTask3 {
    public static boolean isValidUserName(String name) {
        String regex = "^[A-Za-z]\\w{2,14}$";

        Pattern pattern = Pattern.compile(regex);

        if (name == null) {
            return false;
        }

        Matcher matcher = pattern.matcher(name);

        return matcher.matches();
    }

    public static String putName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter name: ");
        String name = scanner.nextLine();
        return name;
    }
}
