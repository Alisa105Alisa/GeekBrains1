package JavaOne.Lesson05.HomeWork;

public class AllWorkers {
    public static void main(String[] args) {

        Worker[] workerArray = new Worker[5];
        workerArray[0] = new Worker("Сидоров Игорь Витальевич", "Программист",
                "igor@mail.ru", 89564734956L, 80000, 25);
        workerArray[1] = new Worker("Георгий", "Инженер",
                "greg@mail.ru", 84562985634L, 150000, 45);
        workerArray[2] = new Worker("Павлов Виталий Олегович", "Руководитель отдела персонала",
                "pavlov@mail.ru", 89227543876L, 100000, 39);
        workerArray[3] = new Worker("Красильников Анатолий Иванович", "Бухгалтер",
                "anatol@mail.ru", 85463786534L, 50000, 29);
        workerArray[4] = new Worker("Павлова Ирина Сергеевна", "Менеджер",
                "irirna@mail.ru", 85642983456L, 200000, 42);


        allWorkers(workerArray);
        System.out.println("**********");
        ageArray(workerArray);

    }

    private static void allWorkers(Worker[] workerArray) {
        for (int i = 0; i < workerArray.length; i++)
            System.out.println(workerArray[i].getFullInfo());

    }

    private static void ageArray(Worker[] workerArray) {
        for (int i = 0; i < workerArray.length; i++)
            if (workerArray[i].getAge() > 40) {
                System.out.println(workerArray[i].getFullInfo());
            }

    }
}

