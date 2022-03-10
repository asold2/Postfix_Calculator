package calculator;

public class Client {
    public static void main(String args[]){
        Token val1 = new Operand(3000);
        Token val2 = new Operand(34566);
        Operator operator = new Operator(Operation.MULTIPLY);

        CalculatorVisitor calculatorVisitor = new CalculatorVisitor();

        val1.accept(calculatorVisitor);
        val2.accept(calculatorVisitor);
        operator.accept(calculatorVisitor);

        try {
            System.out.println(calculatorVisitor.getResult());
        } catch (MalformedExpressionException e) {
            e.printStackTrace();
        }

    }
}
