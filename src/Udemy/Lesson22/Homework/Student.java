package Udemy.Lesson22.Homework;

public class Student {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String s) {
        name = s;
    }

    private int course;

    public int getCourse() {
        return course;
    }

    public void setCourse(int i) {
        if (i > 0 && i < 5) {
            this.course = i;
        }
    }

    private int grade;
    public int getGrade(){
        return grade;
    }
    public void setGrade (int j) {
        if (j > 0 && j < 11) {
            this.grade = j;
        }
    }

    public void showInfo (){
        System.out.println(getName() + " " + getCourse() + " " + getGrade());
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student s = new Student ();
        s.setName("Олеша");
        s.setCourse(4);
        s.getGrade();
        s.showInfo();
    }
}
