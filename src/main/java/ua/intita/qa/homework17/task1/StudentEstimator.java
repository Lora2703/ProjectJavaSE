package ua.intita.qa.homework17.task1;

import java.util.Iterator;
import java.util.List;

public class StudentEstimator {

    public List<Student> estimator(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.averageMark(student.getMarks()) < 3) {
                iterator.remove();
            } else {
                int newCourse = student.getCourse();
                newCourse++;
                student.setCourse(newCourse);
            }
        }
        return students;
    }

    public void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }


}
