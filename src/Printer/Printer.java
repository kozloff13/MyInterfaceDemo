package Printer;

public class Printer implements IPrinter {


    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
