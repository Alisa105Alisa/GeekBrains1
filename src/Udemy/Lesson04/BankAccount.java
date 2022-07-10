package Udemy.Lesson04;

import com.sun.javadoc.SourcePosition;

public class BankAccount {
    int id;
    String name;
    double balance;

    double popolnenieScheta(int summa) {
        balance += summa;
        return balance;
    }

    double snyatieSoScheta(int summa) {
        balance -= summa;
        return balance;
    }

    void accountInfo() {
        System.out.println("ID: " + id + " Name: " + name + " Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Alfa";
        MyAccount.balance = 500000;

        YourAccount.id = 2;
        YourAccount.name = "Beta";
        YourAccount.balance = 0.67;

        HisAccount.id = 3;
        HisAccount.name = "Gamma";
        HisAccount.balance = 87.67;


        System.out.println(YourAccount.name);


        MyAccount.accountInfo();
        MyAccount.popolnenieScheta(300);
        MyAccount.accountInfo();
        MyAccount.snyatieSoScheta(200);
        MyAccount.accountInfo();
    }

}
