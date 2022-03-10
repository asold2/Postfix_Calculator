package stack;

import java.lang.reflect.Executable;

public class EmptyListException extends Exception{
    public EmptyListException(String errorMessage){
        super(errorMessage);
    }

}
