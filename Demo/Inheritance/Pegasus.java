package Inheritance;

public class Pegasus extends Horse implements Flyer, Mythical {
    public static void main(String... args) {
        Horse myApp = new Horse();
        System.out.println(myApp.identifyMyself());
    }
}