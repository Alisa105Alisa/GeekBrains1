package Udemy.Lesson04;

public class Student {
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
            double srednyaOcenka = (st.averageEconomics + st.averageMath + st.averageForeignLang)/3;
            System.out.println("Name: " + st.name + " Average Score: " + srednyaOcenka);
            return srednyaOcenka;
        }

        public static void main (String[]args){
            Student st1 = new Student();
            st1.averageMath = 4.76;
            st1.averageEconomics = 5;
            st1.averageForeignLang = 3.5;
            st1.name = "Ivanov";

            Student st2 = new Student();
            st2.averageMath = 5;
            st2.averageForeignLang = 3.9;
            st2.averageEconomics = 4.3;
            st2.name = "Alekseev";

            Student st3 = new Student();
            st3.averageMath = 5;
            st3.averageEconomics = 5;
            st3.averageForeignLang = 5;
            st3.name = "Tsvetaev";

StudentTest sTest = new StudentTest();
sTest.sredneeArifm(st1);
sTest.sredneeArifm(st2);
sTest.sredneeArifm(st3);

      //      System.out.println("Average Score Ivanov: " +
        //            (Ivanov.averageMath + Ivanov.averageEconomics + Ivanov.averageForeignLang)/3 );
          //  System.out.println("Average Score Alekseev: " +
            //        (Alekseev.averageMath + Alekseev.averageEconomics + Alekseev.averageForeignLang)/3 );
       //     System.out.println("Average Score Tsvetaev: " +
         //           (Tsvetaev.averageMath + Tsvetaev.averageEconomics + Tsvetaev.averageForeignLang)/3 );

        }
    }



