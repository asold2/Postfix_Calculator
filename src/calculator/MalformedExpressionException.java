package calculator;

public class MalformedExpressionException extends Exception {
    public MalformedExpressionException(String errorMessage){
        super(errorMessage);
    }
}
