package ua.intita.qa.homework12;

public class Faculty extends University {

    private String fName;

    Faculty(String uName, String fName) {
        super(uName);
        this.fName = fName;
    }

    public Faculty() {
    }

    public Faculty(String fName) {
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public double avgFaculty(Student[] students, String fName, int i) throws NoGroupOnFacultyException,
            MarkInvalidException, NoFacultyInUniversity {
        int sumF = 0, count = 0;
        for (Student student : students) {
            if (student.getfName().equals(fName)) {
                if (student.getMarks(i) < 0 || student.getMarks(i) > 10) {
                    throw new MarkInvalidException(student.getMarks(i));
                }
                sumF += student.getMarks(i);
                count++;
            }
        }
        if (sumF == 0) {
            throw new NoGroupOnFacultyException(fName);
        }
        return (double) sumF / count;
    }

//    public double avgFaculty(Student[] students, Group[] groups, String fName){
//        int sum = 0, count = 0;
//        for (Group group : groups){
//            if (group.getfName().equals(fName)){
//                sum += group.avgGroup(students,group.getgName(), i);
//            }
//        }
//
//
//    }
}
