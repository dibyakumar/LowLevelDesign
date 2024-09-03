package com.lld.behavioral.design.InterpreterDesign.Expression;

import com.lld.behavioral.design.InterpreterDesign.Context;

public interface AbstractExpression {
    int interpret(Context context);
}
