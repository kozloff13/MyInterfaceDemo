package Printer;

public class AdvancePrinter implements IPrinter{


    @Override
    public void print(String text) {

        System.out.println(text.toUpperCase());
        System.out.println(String.format("String length:%d", text.length()));
    }
}
