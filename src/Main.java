public class Main {
    public static void main(String[] args) {
       // Задание 1

        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName =  middleName + " " + firstName + " " + lastName ;

        System.out.println("Ф. И. О. сотрудника - " + fullName);

// Задача 2

        String fullName1 = "Ivanov Ivan Ivanovich";
        String fullNameUpperCase = fullName1.toUpperCase();

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета - " + fullNameUpperCase);




    }
}