package com.lld.behavioral.design.InterpreterDesign;

public class Main {
    public static void main(String[] args) {
        /**
         * Interpreter Design patter
         *
         * we will evaluate an expression using this design
         *
         * expression = 2 + (3*4)
         *
         */

        String expression = "2+3*4";
        Context context = new Context();

        Interpreter interpreter = new Interpreter(context);
        int res = interpreter.interpret(expression);

        System.out.println(expression+" = "+res);
    }
}
