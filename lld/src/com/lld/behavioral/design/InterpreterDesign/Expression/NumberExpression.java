package com.lld.behavioral.design.InterpreterDesign.Expression;

import com.lld.behavioral.design.InterpreterDesign.Context;

public class NumberExpression implements AbstractExpression{
    private int number;
    public NumberExpression(int number){
        this.number = number;
    }

    @Override
    public int interpret(Context context) {
        return this.number;
    }
}
