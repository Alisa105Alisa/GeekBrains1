package JavaOne.Lesson02;

public class Sand {
    public static void main(String[] args) {
        System.out.println("result = " + firstTask(2,10));
        tablePifagor(10,10);
    }
    public static int firstTask (int base,int signature) {
        int result = 1;
        for (int i = 1; i <= signature; i++) {
            result = result * base;
        }
        return result;
    }

    public static void tablePifagor(int width, int height) {
        for (int i = 1; i < height; i++) {
            for (int j = 1; j < width; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println(" ");
        }
    }

}
