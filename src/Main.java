import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1 и 2");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());
    }

    private static void task3() {
        String fullName = "Иванов Семен Семёнович";
        System.out.println("Данные ФИО сотрудника - " + fullName.replace('ё', 'е'));
    }
}
