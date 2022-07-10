package JavaOne.Lesson02;

public class HomeWorkApp2 {

    public static void main(String[] args) {
        System.out.println(taskOne(20, 0));
        System.out.println("*************************");
        taskTwo(-154);
        System.out.println(taskThree(-7));
        System.out.println("*************************");
        taskFour("Hello darling", 8);
    }

    public static boolean taskOne(int a, int b) {

        return (a + b) > 10 && (a + b) <= 20;
    }


    public static void taskTwo(int a) {
        // int a = -154;

        if (a >= 0) {
            System.out.println("Это число положительное");
        } else {
            System.out.println("Это число отрицательное");
        }
        System.out.println("****************");
    }

    public static boolean taskThree(int a) {
        return (a < 0);
    }


    public static void taskFour(String value, int n) {

        for (int i = 1; i <= n; i++) {
            System.out.println(value + " " + i);
        }
        System.out.println("****************");
    }

}
