package ua.intita.qa.homework12;

public class Group extends Faculty {
    private String gName;

    Group(String uName, String fName, String gName) {
        super(uName, fName);
        this.gName = gName;
    }

    Group(String gName) {
        this.gName = gName;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public double avgGroup(Student[] students, String gName, int i) throws NoStudentsInGroupException,
            MarkInvalidException {
        int sum = 0, count = 0;
        for (Student student : students) {
            if (student.getMarks(i) < 0 || student.getMarks(i) > 10) {
                throw new MarkInvalidException(student.getMarks(i));
            }
            if (student.getgName().equals(gName)) {
                sum += student.getMarks(i);
                count++;
            }
        }
        if (sum == 0) {
            throw new NoStudentsInGroupException(gName);
        }
        return (double) sum / count;
    }
}
