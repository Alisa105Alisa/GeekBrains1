package JavaOne.Lesson05.HomeWork;

public class Worker {
    private String name;
    private String position;
    private String email;
    private long telephone;
    private int salary;
    private int age;

    public Worker(String name, String position, String email, long telephone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;

    }

    String getName() {
        return name;
    }

    String getPosition() {
        return position;
    }

    String getEmail() {
        return email;
    }

    long getTelephone() {
        return telephone;
    }

    int getSalary() {
        return salary;
    }

    int getAge() {
        return age;
    }

    String getFullInfo() {
        return this.name + " " +
                this.position + " " +
                this.email + " " +
                this.telephone + " " +
                this.salary + " " +
                this.age;
    }

}

