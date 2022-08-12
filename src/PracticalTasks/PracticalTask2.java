package PracticalTasks;

import java.util.Scanner;

public class PracticalTask2 {

    public static String putSurname() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter surname: ");
        String surname = scanner.nextLine();
        return surname;
    }

    public static String putName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter name: ");
        String name = scanner.nextLine();
        return name;
    }

    public static String putPatronymic() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter patronymic: ");
        String patronymic = scanner.nextLine();
        return patronymic;
    }


    public static String outputSurnameAndInitials(String surname, String name, String patronymic){
        return surname + " " + name.charAt(0) + "." + patronymic.charAt(0) + ".";
    }

    public static String outputName(String name) {
        return name;
    }

    public static String outputNamePatronymicSurname(String name, String patronymic, String surname) {
        return name + " " + patronymic + " " + surname;
    }

}
