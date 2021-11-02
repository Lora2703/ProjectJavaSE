package ua.intita.qa.homework12;

public class NoFacultyInUniversity extends Exception {
    private final String fName;

    NoFacultyInUniversity(String fName) {
        this.fName = fName;
    }

    @Override
    public String toString() {
        return "NoFacultyInUniversity{" +
                "fName='" + fName + '\'' +
                '}';
    }
}
