package ua.intita.qa.homework12;

public class NoGroupOnFacultyException extends Exception {
    private final String fName;

    NoGroupOnFacultyException(String fName) {
        this.fName = fName;
    }

    @Override
    public String toString() {
        return "NoGroupOnFacultyException{" +
                "fName='" + fName + '\'' +
                '}';
    }
}
