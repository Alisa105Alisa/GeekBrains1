package Udemy.Lesson22;

public class Chelovek {
    final String pol;

    public Chelovek(String pol) {
        this.pol = pol;
    }

    private boolean clever;

    public boolean isClever() {
        return clever;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String s) {
        name = s;
    }

    private int vozrast;

    public int getVozrast() {
        return vozrast;// так мы позволяем видеть наш возраст
    }

    public void setVozrast(int i) {// так мы позволяем изменить возраст, задав условия. Это инкапсуляция
        if (i > 0) {
            vozrast = i;
        }
    }

    private int ves;

    public int getVes() {
        return ves;
    }

    public void setVes(int i) {
        if (i > 0) {
            ves = i;
        }
    }
}

class Test {
    public static void main(String[] args) {
        Chelovek c = new Chelovek("male");
        c.setName("Коля");
        c.setVes(50);
        c.setVozrast(15);
        System.out.println(c.getName());
        System.out.println(c.getVozrast());
        System.out.println(c.getVes());
        c.setVes(-30);
        System.out.println(c.getVes());

    }
}