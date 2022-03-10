package calculator;

import java.util.ArrayList;

public class Client {
    private static CalculatorVisitor calculatorVisitor = new CalculatorVisitor();

    public static void main(String args[]){
        ArrayList<Token> tokenList = new ArrayList<>();
        tokenList.add(new Operand(12));
        tokenList.add(new Operand(23));
        tokenList.add(new Operator(Operation.PLUS));
        tokenList.add(new Operand(12));
        tokenList.add(new Operator(Operation.PLUS));
        tokenList.add(new Operand(2));
        tokenList.add(new Operator(Operation.MULTIPLY));
        tokenList.add(new Operand(4));
        tokenList.add(new Operator(Operation.MINUS));
        System.out.println(evaluateExpression(tokenList));
    }

    public static int evaluateExpression( ArrayList<Token> tokenList){
        for (Token token: tokenList) {
            if(token instanceof Operator){
                calculatorVisitor.visit((Operator) token);
            }
            else{
                calculatorVisitor.visit((Operand) token);
            }
        }
        try {
            return calculatorVisitor.getResult();
        } catch (MalformedExpressionException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
