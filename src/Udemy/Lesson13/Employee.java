package Udemy.Lesson13;

public class Employee {
    public static void main(String[] args) {
        switch ("среда") {
            case "понедельник":// можно не писать каждый раз, а только после пятницы. Так как на экран выводится одно и то же
            case "вторник":
            case "среда":
            case "четверг":
            case "пятница":
                System.out.println("Работа до 18:00");
                break;
            case "суббота":
                System.out.println("Работа до 14:00");
                break;
            case "воскресенье":
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Такого дня не существует");
        }
    }
}
