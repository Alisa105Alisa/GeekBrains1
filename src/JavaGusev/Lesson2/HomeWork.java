package JavaGusev.Lesson2;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(summaDvuhChisel(11, 6));
        polozhitelnoeChislo(-9);
        System.out.println(polozhitelnoeChisloBoolean(-5));
        strokaIChislo("Hello", 6);
    }

    public static boolean summaDvuhChisel(int a, int b) {
        if ((a + b) < 20 || (a + b) > 10) {
            return true;
        } else {
            return false;
        }
    }

    public static void polozhitelnoeChislo(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean polozhitelnoeChisloBoolean(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void strokaIChislo(String s1, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(s1);
        }
    }
}
