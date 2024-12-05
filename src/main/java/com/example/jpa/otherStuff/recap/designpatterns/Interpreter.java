package com.example.jpa.otherStuff.recap.designpatterns;

interface Expression {
    int interpret();

}

class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;

    }

    @Override
    public int interpret() {
        return number;
    }
}

class AddExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public AddExpression(Expression e1, Expression e2) {
        leftExpression = e1;
        rightExpression = e2;

    }


    @Override
    public int interpret() {
        return leftExpression.interpret() + rightExpression.interpret();
    }
}

public class Interpreter {
    public static void main(String... a) {

        Expression sum = new AddExpression(new NumberExpression(5), new NumberExpression(10));
       Expression sum2 = new AddExpression(sum,new NumberExpression(6));


        System.out.println("Sum2 " + sum2.interpret());
        System.out.println("Rez: " + sum.interpret());
    }
}
