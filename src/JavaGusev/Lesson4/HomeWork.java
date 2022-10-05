package JavaGusev.Lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork {

    //поле
    public static char[][] map;

    //размер поля
    public static final int SIZE = 3;

    //Точек для победы
    public static final int DOTS_TO_WIN = 3;

    //Описание точек
    public static final char DOT_EMPTY = '*';//1 символ указывается в одинарных кавычках
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    //Сканер
    public static final Scanner SCANNER = new Scanner(System.in);
    //рандом
    public static final Random RANDOM = new Random();

    /**
     * Проинициализироваать поле.
     */
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = DOT_EMPTY;
            }
            //Arrays.fill(map[i], DOT_EMPTY); - то же самое, но проще писать
        }
    }

    /**
     * Вывод игрового поля на экран.
     */
    public static void printMap() {
        //нумеруем верхний ряд
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        //пишем строки мапы
        for (int i = 0; i < map.length; i++) {
            //выводим номер строки
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Ход человека.
     */
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(x, y));// пока человек не ввел валидную ячейку
        map[y][x] = DOT_X;
    }

    /**
     * Ход робота.
     */
    public static void aiTurn() {
        int x, y;
        do {
            x = RANDOM.nextInt(SIZE);// nextInt - псевдорандомное значение между 0 исключительно и переданным значением включительно
            y = RANDOM.nextInt(SIZE);
        } while (!isCellValid(x, y));//валидность ячейки нужна, чтобы робот не пошел в занятую ячейку
        System.out.println("Робот делает ход в " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    /**
     * Проверка валидны ли значения поля
     *
     * @param x координата X
     * @param y координата Y
     * @return да/нет
     */
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {// Проверка, что х и у не выходят за границы
            return false;
        }
        if (map[y][x] != DOT_EMPTY) {
            return false;
        }
        return true;
    }

        public static boolean checkWin(char symbol) {
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {

                    if ((map[i][0] == symbol && map[i][1] == symbol && map[i][2] == symbol) ||
                            (map[0][i] == symbol && map[1][i] == symbol && map[2][i] == symbol))
                        return true;
                }
                if ((map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) ||
                        (map[2][0] == symbol && map[1][1] == symbol && map[0][2] == symbol))
                    return true;
            }
                return false;
            }


    /**
     * Проверка что в поле не осталось ни одной ссвободной ячейки.
     *
     * @return true, если нет ни одной свободной
     */
    public static boolean isMapFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Побеждает человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Робот выиграл");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Game over");
    }

}





