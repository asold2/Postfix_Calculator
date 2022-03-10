package calculator;

public class Operator extends Token{
    Operation operation;

    public Operator(Operation operation){

        this.operation = operation;
    }

    public void accept(CalculatorVisitor visitor) {
            visitor.visit(this);
    }

    public Operation getOperation(){
        return operation;
    }
}
