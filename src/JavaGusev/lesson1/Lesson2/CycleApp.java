package JavaGusev.lesson1.Lesson2;

public class CycleApp {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            //10 % 3 = 1

            if (i % 2 == 0) {// если i - четное, мы не выполняем код. снизу
                continue;
            }
            if (i > 6) {
                break;
            }
            PrintUtil.printFormatted("String " + i);
        }
        System.out.println(getDividedByThree());

        for (int i = 10; i > 0; i--){// цикл идет в обратную сторону
            System.out.println(i);
        }
        // это бесконечный цикл:
        /* for(;;){
        }*/

        //цикл с двумя переменными:
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i=" + i + " j=" + j);
        }
        System.out.println();

        // вложенные циклы:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i=" + i + " j=" + j);
            }
        }

    }

    public static int getDividedByThree() {
        for (int i = 2; i < 10; i = i + 2) {
            if (i % 3 == 0) {
                return i;
            }
        }
        return 0;// дописываем это на случай, если мы не найдем внутри цикла число, делящееся на 0.
    }
}
