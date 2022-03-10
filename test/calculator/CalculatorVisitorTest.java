package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorVisitorTest {

    CalculatorVisitor calculatorVisitor = new CalculatorVisitor();

    @BeforeEach
    void setUp(){
        calculatorVisitor.pushOperand(new Operand(23));
    }

    @Test
    void pushOperand() {
        calculatorVisitor.pushOperand(new Operand(2));
        try {
            calculatorVisitor.performOperation(new Operator(Operation.PLUS));
        } catch (MalformedExpressionException e) {
            e.printStackTrace();
        }
        try {
            assertTrue(calculatorVisitor.getResult() == 25);
        } catch (MalformedExpressionException e) {
            e.printStackTrace();
        }
    }

    @Test
    void performOperationPLUS() {
        calculatorVisitor.pushOperand(new Operand(2));
        try {
            calculatorVisitor.performOperation(new Operator(Operation.PLUS));
        } catch (MalformedExpressionException e) {
            e.printStackTrace();
        }
        try {
            assertTrue(calculatorVisitor.getResult() == 25);
        } catch (MalformedExpressionException e) {
            e.printStackTrace();
        }

    }
    @Test
    void performOperationMINUS() {
        calculatorVisitor.pushOperand(new Operand(2));
        try {
            calculatorVisitor.performOperation(new Operator(Operation.MINUS));
        } catch (MalformedExpressionException e) {
            e.printStackTrace();
        }
        try {
            assertTrue(calculatorVisitor.getResult() == 21);
        } catch (MalformedExpressionException e) {
            e.printStackTrace();
        }

    }

    @Test
    void performOperationMULTIPLY() {
        calculatorVisitor.pushOperand(new Operand(2));
        try {
            calculatorVisitor.performOperation(new Operator(Operation.MULTIPLY));
        } catch (MalformedExpressionException e) {
            e.printStackTrace();
        }
        try {
            assertTrue(calculatorVisitor.getResult() == 46);
        } catch (MalformedExpressionException e) {
            e.printStackTrace();
        }

    }




    @Test
    void getResult() {
        calculatorVisitor.pushOperand(new Operand(10));
        try {
            calculatorVisitor.performOperation(new Operator(Operation.PLUS));
        } catch (MalformedExpressionException e) {
            e.printStackTrace();
        }
        try {
            assertTrue(calculatorVisitor.getResult() == 33);
        } catch (MalformedExpressionException e) {
            e.printStackTrace();
        }

    }
}