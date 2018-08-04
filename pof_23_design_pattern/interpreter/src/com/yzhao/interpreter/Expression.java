package com.yzhao.interpreter;

/**
 * 为语言创建解释器，通常由语言的语法和语法分析来定义。
 */
public abstract class Expression {
    public abstract boolean interpret(String str);
}
