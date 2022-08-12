package PracticalTasks;

public class Main {
    public static void main(String[] args) {
//        System.out.println("========Practical task 3========");
//        String name1 = PracticalTasks.PracticalTask3.putName();
//        boolean test1 = PracticalTasks.PracticalTask3.isValidUserName(name1);
//        System.out.println("Name: " + name1 + ". Is valid? " + test1);
//
//        String name2 = PracticalTasks.PracticalTask3.putName();
//        boolean test2 = PracticalTasks.PracticalTask3.isValidUserName(name2);
//        System.out.println("Name: " + name2 + ". Is valid? " + test2);
//
//        String name3 = PracticalTasks.PracticalTask3.putName();
//        boolean test3 = PracticalTasks.PracticalTask3.isValidUserName(name3);
//        System.out.println("Name: " + name3 + ". Is valid? " + test3);
//
//        String name4 = PracticalTasks.PracticalTask3.putName();
//        boolean test4 = PracticalTasks.PracticalTask3.isValidUserName(name4);
//        System.out.println("Name: " + name4 + ". Is valid? " + test4);
//
//        String name5 = PracticalTasks.PracticalTask3.putName();
//        boolean test5 = PracticalTasks.PracticalTask3.isValidUserName(name5);
//        System.out.println("Name: " + name5 + ". Is valid? " + test5);

        System.out.println("========Practical task 2========");
        String name = PracticalTask2.putName();
        String patronymic = PracticalTask2.putPatronymic();
        String surname = PracticalTask2.putSurname();

        String test1 = PracticalTask2.outputSurnameAndInitials(surname,name,patronymic);
        System.out.println(test1);

        String test2 = PracticalTask2.outputName(name);
        System.out.println(test2);

        String test3 = PracticalTask2.outputNamePatronymicSurname(name, patronymic,surname);
        System.out.println(test3);
    }
}
