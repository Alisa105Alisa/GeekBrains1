package JavaGusev.lesson1;

public class Lesson1 {

    public static void main(String[] args) {
        int v1 = 15;
        int v2 = 15;
        if (v1 > v2) {
            System.out.println("v1 > v2");
        } else if (v1 < v2) {
            System.out.println("V1 < v2");
        } else {
            System.out.println("V1 = v2");
        }
        drawCat();
        drawCat();
    }
        public static void drawCat () {
            System.out.println("           _..---...,\"\"-._     ,/}/)\n" +
                    "        .''        ,      ``..'(/-<\n" +
                    "       /   _      {      )         \\\n" +
                    "      ;   _ `.     `.   <         a(\n" +
                    "    ,'   ( \\  )      `.  \\ __.._ .: y\n" +
                    "   (  <\\_-) )'-.____...\\  `._   //-'\n" +
                    "    `. `-' /-._)))      `-._)))\n" +
                    "      `...'             ");

        }
    }


