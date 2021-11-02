package ua.intita.qa.homework12;

public class MarkInvalidException extends Exception {
    private int mark;

    MarkInvalidException(int mark) {
        this.mark = mark;
    }


    @Override
    public String toString() {
        return "MarkInvalidException: mark " + mark + " should be from 0 to 10";
    }
}
