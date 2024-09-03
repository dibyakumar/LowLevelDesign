package com.lld.behavioral.design.InterpreterDesign;

import com.lld.behavioral.design.InterpreterDesign.Expression.AbstractExpression;
import com.lld.behavioral.design.InterpreterDesign.Expression.AdditionExpression;
import com.lld.behavioral.design.InterpreterDesign.Expression.MultiplicationExpression;
import com.lld.behavioral.design.InterpreterDesign.Expression.NumberExpression;

public class Interpreter {
    private Context context;

    public Interpreter(Context context){
        this.context = context;
    }
    public int interpret(String expression){
        AbstractExpression abstractExpression = buildExpressionTree(expression);

        return abstractExpression.interpret(context);
    }

    public AbstractExpression buildExpressionTree(String expression){
        String[] split = expression.split("[+*]");

        return new AdditionExpression(new NumberExpression(Integer.parseInt(split[0]))
                , new MultiplicationExpression(new NumberExpression(Integer.parseInt(split[1])),
                new NumberExpression(Integer.parseInt(split[2]))));
    }

}
