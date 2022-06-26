package JavaGusev.lesson1.Lesson2;

public class MethodApp {
    public static final String TEMPLATE = "int = %d string = %s\n";// это шаблон

    public static void main(String[] args) {
        int v1 = multiplication(4, 10);
        int v2 = multiplication(5, 6);
        System.out.println("v1 = " + v1 + " v2 = " + v2 + " v3 = " + multiplication(v1, v2));
        PrintUtil.printFormatted("String to format");

        System.out.printf(TEMPLATE, 10, "str");
        System.out.printf(TEMPLATE, 113, "st12313r");
        //TEMPLATE = "abc"; // нельзя
    }

    public static int multiplication(int n1, int n2){// n1, n2 - параметры
        int result = n1 * n2;
        return result;
    }
    //модификатор доступа + тип значения + имя + Набор параметров


    //naming - ClassName MyClassName - имя класса в camelCase,  с большой буквы
    //methods, variables - loaerCaseUperCase methodName variableName

    //CONSTANTS  - UPPER_CASE (snake_case)_


    //type - void / real type

    //public - protected - (no modifier) default - private
}
