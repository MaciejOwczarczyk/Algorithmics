package pl.coderslab.pluralSight.behavioral.interpreter;


public class InterpreterDemo {

    static Expression buildInterpreterTree() {
//        Expression terminal1 = null;
        Expression terminal1 = new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression terminal3 = new TerminalExpression("Bears");

        Expression alternation1 = new AndExpression(terminal2, terminal3);
        Expression alternation2 = new OrExpression(terminal1, alternation1);

        return new AndExpression(terminal3, alternation2);
//        return terminal1;
    }

    public static void main(String[] args) {
//        String context = "Lions";
//        String context = "Tigers";
//        String context = "Lions Tigers";
//        String context = "Lions Bears";
        String context = "Tigers  aaa Bears";

        Expression define = buildInterpreterTree();

        System.out.println(context + " is " + define.interpret(context));
    }
}
