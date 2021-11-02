package ua.intita.qa.homework12;

public class NoStudentsInGroupException extends Exception {
    private final String gName;

    NoStudentsInGroupException(String gName) {
        this.gName = gName;
    }

    @Override
    public String toString() {
        return "NoStudentsInGroupException{" +
                "gName='" + gName + '\'' +
                '}';
    }
}
