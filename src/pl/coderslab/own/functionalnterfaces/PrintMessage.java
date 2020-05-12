package pl.coderslab.own.functionalnterfaces;

@FunctionalInterface
public interface PrintMessage <S> {

    void log(S message);
}
