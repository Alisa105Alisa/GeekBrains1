package JavaOne.Lesson02;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 14.08.2021
 */

public class Lesson2 {

    public static int valueFromClass = 10;

    public static void main(String[] args) {
        int valueFromMethod = 20;
        System.out.println(valueFromMethod);
        studySwitch();

        System.out.println("Hello 1");
        System.out.println("Hello 2");
        System.out.println("Hello 3");
        //...
        System.out.println("Hello 10");
        System.out.println("**********");
        for (int i = 4; i <= 10; i++) {
            System.out.println("Hello " + i);
        }

        System.out.println("Result myMath > " + myMath(2, 10));
        tablePifagors(5, 20);
        int a = 0;

        for (int i = 0; i < 5; i++) {

        }

        while (a < 10) {
            a++;
            if (a == 5) continue;
            if (a == 7) break;
            System.out.print(a + " ");
        }
        int i = 0;

        while (true) {
            i++;
            if (i > 5) break;
        }

        do {
            a++;
            if (a == 4) continue;
            System.out.print(a + " ");
        } while (a < 10);

        System.out.println("Result > " + printMirrorValue(132));

    }

    public static String printMirrorValue(int value) {
        if (value > 99 && value < 1000) {
            return (value % 10) + "" + ((value % 100) / 10) + "" + (value / 100);
        } else {
            return value + " incorrect";
        }
    }

    public static void tablePifagors(int width, int height) {
        for (int y = 1; y < height; y++) {
            for (int x = 1; x < width; x++) {
                System.out.print(y * x + "\t");
            }
            System.out.println();
        }
    }

    public static int myMath(int base, int signature) {
        int result = 1;

        for (int i = 1; i <= signature; i++) {
            result = result * base;
        }

        return result;
    }

    public static void studySwitch() {
        String nameLetter = "Alex";


        if (nameLetter == "Alex") {
            System.out.println("Send letter to Alex");
        } else if (nameLetter == "Olga") {
            System.out.println("Send letter to Olga");
        } else if (nameLetter == "Maria") {
            System.out.println("Send letter to Maria");
        } else if (nameLetter == "Boris") {
            System.out.println("Send letter to Boris");
        } else {
            System.out.println("go out office");
        }

        System.out.println("********************************");

        switch (nameLetter) {
            case "Alex": //nameLetter == "Alex"
                System.out.println("Send letter to Alex");
                break;
            case "Olga": //nameLetter == "Olga"
                System.out.println("Send letter to Olga");
                break;
            case "Maria":
                System.out.println("Send letter to Maria");
                break;
            case "Boris":
                System.out.println("Send letter to Boris");
                break;
            default:
                System.out.println("go out office");
                break;
        }
    }
}
