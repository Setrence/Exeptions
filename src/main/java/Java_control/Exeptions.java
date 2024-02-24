package Java_control;

import java.io.IOException;


class IncorrectValueException extends RuntimeException{
    public IncorrectValueException(String message) {
        super(message);
    }}
class EmptyStringException extends RuntimeException{
    public EmptyStringException(String message) {
        super(message);
    }
}

class ArrayCountElementException extends RuntimeException{
    public ArrayCountElementException(String message) {
        super(message);
    }
}
