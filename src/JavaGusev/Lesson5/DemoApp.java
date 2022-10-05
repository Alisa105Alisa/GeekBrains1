package JavaGusev.Lesson5;

public class DemoApp {
    public static void main(String[] args) {
        Car car = new Car("Dodge", 2020);

        car.info();
        car.printModel();


        car.crash();
        car.info();
        String carModel = car.getModel();// получаем свойства из объекта и сохраняем их в переменную

        //car.year = -100;
        //Car.info() - нельзя, так как не статический

//        System.out.println("Model = " + car.model + " year=" + car.year + " wasCrashed=" + car.wasCrashed + " wheelsNumber = " + car.wheelsNumber);
//        Car car2 = new Car();
//        car2.model = "Ford";
//        car2.year = 1989;
//        car2.wheelsNumber = 6;
//
//        System.out.println("Model = " + car2.model + " year=" + car2.year + " wasCrashed=" + car2.wasCrashed + " wheelsNumber = " + car2.wheelsNumber);
//
//        int wheelsNumber = Car.wheelsNumber; - для указания количества колес не нужен объект, а нужен шаблон
//        String model = car.model;
        
        //Car[] cars = new Car[]{car, car2};// собрали созданные машины в массив

        Robot[] robots = new Robot[10];
        for(int i=0; i< robots.length; i++) {
            robots[i] = new Robot("Robot"+i, i+10);
        }
        //создали массив из 10 роботов и заполнили в цикле

        for(Robot robot : robots) {
            robot.info();
        }
        //for each - для каждого робота из массива роботов. Перебираем все объекты. Это способ обойти массив
    }
}
