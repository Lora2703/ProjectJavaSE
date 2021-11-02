package ua.intita.qa.homework12;

import java.util.Arrays;


public class Student extends Group {
    private String lastName;
    private String firstName;
    private String[] subjects;
    private int[] marks;


    Student(String uName, String fName, String gName, String lastName, String firstName) {
        super(uName, fName, gName);
        this.lastName = lastName;
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }


    public int getMarks(int i) {
        return marks[i];
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "uName='" + getuName() + '\'' +
                ", fName='" + getfName() + '\'' +
                ", gName='" + getgName() + '\'' +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", subjects=" + Arrays.toString(subjects) +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }

    public double avgMark() throws MarkInvalidException {
        int len = 0;
        int sum = 0;
        for (int mark : marks) {
            if (mark < 0 || mark > 10) {
                throw new MarkInvalidException(mark);
            }
            sum += mark;
            len++;
        }
        return (double) sum / len;
    }

}
