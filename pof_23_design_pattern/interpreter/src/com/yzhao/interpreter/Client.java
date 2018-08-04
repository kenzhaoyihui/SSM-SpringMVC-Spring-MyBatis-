package com.yzhao.interpreter;

public class Client {
    public static Expression buildInterpreterTree() {
        Expression terminal1 = new TerminalExpression("A");
        Expression terminal2 = new TerminalExpression("B");
        Expression terminal3 = new TerminalExpression("C");
        Expression terminal4 = new TerminalExpression("D");

        Expression alternation1 = new OrExpression(terminal2, terminal3);
        Expression alternation2 = new OrExpression(terminal1, alternation1);
        return new AndExpression(terminal4, alternation2);
    }

    public static void main(String[] args) {
        Expression define = buildInterpreterTree();

        String context1 = "D A";
        String context2 = "A B";

        System.out.println(define.interpret(context1));
        System.out.println(define.interpret(context2));
    }
}
