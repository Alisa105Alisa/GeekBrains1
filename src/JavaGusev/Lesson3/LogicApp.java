package JavaGusev.Lesson3;

public class LogicApp {
    public static void main(String[] args) {
        // ИЛИ  || (обе проверки) | (одна проверка)   +
        // И    && (обе проверки) & (одна проверка)  *
        // НЕ   !
        int a = 0;
        if (isPositive(a) && !isZero(a) || !isPositive(a)) {
            System.out.println("Положительно и не 0");
        }
        if (!isPositive(a) || isZero(a)) {

        }
    }

    public static boolean isPositive(int val) {
        return val >= 0;
    }
    public static boolean isZero (int val){
        return val == 0;
    }
}
