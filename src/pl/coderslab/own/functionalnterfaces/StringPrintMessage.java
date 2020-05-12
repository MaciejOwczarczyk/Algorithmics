package pl.coderslab.own.functionalnterfaces;

public class StringPrintMessage implements PrintMessage <String> {

    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
