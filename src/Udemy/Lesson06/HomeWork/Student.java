package Udemy.Lesson06.HomeWork;

public class Student {
    Student (int studBiletNumber1, String name1, String surname1, int yearOfStudy1, double averageMath1, double averageEconomics1, double averageForeignLang1 ){
        studBiletNumber = studBiletNumber1;
        name = name1;
        surname = surname1;
        yearOfStudy = yearOfStudy1;
        averageMath = averageMath1;
        averageEconomics = averageEconomics1;
        averageForeignLang = averageForeignLang1;
    }

    Student (int studBiletNumber2, String name2, String surname2, int yearOfStudy2){
        this(studBiletNumber2, name2, surname2, yearOfStudy2, 0.0, 0.0, 0.0 );
    }

    Student (){
    }
    int studBiletNumber;
    String name;
    String surname;
    int yearOfStudy;
    double averageMath;
    double averageEconomics;
    double averageForeignLang;

}
class StudentTest {
    double sredneeArifm(Student st) {
        double srednyaOcenka = (st.averageEconomics + st.averageMath + st.averageForeignLang) / 3;
        System.out.println("Name: " + st.name + " Average Score: " + srednyaOcenka);
        return srednyaOcenka;
    }

    public static void main(String[] args) {
        Student st1 = new Student(1, "Pavel", "Ivanov", 1,4.6, 3.7, 5.0);
        System.out.println(st1.name);
        Student st2 = new Student(15, "Nikita","Petrov",4 );
        System.out.println(st2.surname + " " + st2.name);
        Student st3 = new Student();
        System.out.println("No student");

        StudentTest sTest = new StudentTest();
        sTest.sredneeArifm(st1);
        sTest.sredneeArifm(st2);
        sTest.sredneeArifm(st3);
    }
}
