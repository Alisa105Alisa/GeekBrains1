package Udemy.Lesson02;

public class HomeWork {
public static void main (String [] args){
    byte myByte = 12;
    byte myByte1 = 0B1100;
    byte myByte2 = 014;
    byte myByte3 = 0xC;

    short myShort1 = 1300;
    short myShort2 = 0B10100010100;
    short myShort3 = 02424;
    short myShort4 = 0X514;

    int myInt1 = 0;
    int myInt2 = 0B0;
    int myInt3 = 00;
    int myInt4 = 0x0;

    long myLong1 = 123456789L;
    long myLong2 = 0B111010110111100110100010101L;
    long myLong3 = 0726746425L;
    long myLong4 = 0x75BCD15L;

    float myFloat1 = 6.79f;
    float myFloat2 = 0.8465399999999f;

    double myDouble1 = 3.14;
    double myDouble2 = 56744.68493005;

    boolean myBoolean1 = true;
    boolean myBoolean2 = false;

    char myChar1 = 'X';
char myChar2 = 400;
char myChar3 = '\u8456';

    System.out.println(myByte + " " + myByte1 + " " + myByte2 + " "+ myByte3);
    System.out.println(myShort1 + " " + myShort2 + " " + myShort3 + " " + myShort4);
    System.out.println(myInt1 + " " + myInt2 + " " + myInt3 + " " + myInt4);
    System.out.println(myLong1 + " " + myLong2 + " " + myLong3 + " " + myLong4);
    System.out.println(myFloat1 + " " + myFloat2);
    System.out.println(myDouble1 + " " + myDouble2);
    System.out.println(myBoolean1 + " " + myBoolean2);
    System.out.println(myChar1 + " " + myChar2 + " " + myChar3);
}
}
