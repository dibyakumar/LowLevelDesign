package com.lld.behavioral.design.InterpreterDesign.Expression;

import com.lld.behavioral.design.InterpreterDesign.Context;

public class AdditionExpression implements AbstractExpression{
    private AbstractExpression left;
    private AbstractExpression right;

    public AdditionExpression(AbstractExpression left,AbstractExpression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }
}
