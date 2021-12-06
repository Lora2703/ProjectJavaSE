package ua.intita.qa.homework17.task1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentEstimatorTest {
    private StudentEstimator studentEstimator = new StudentEstimator();

    @Test
    public void estimator() {

        HashMap<String, Integer> marks1 = new HashMap<>();
        marks1.put("math", 5);
        marks1.put("history", 4);
        marks1.put("logic", 5);
        marks1.put("physics", 5);
        Student student1 = new Student("Shevchuk Petro", "math", 1, marks1);


        HashMap<String, Integer> marks2 = new HashMap<>();
        marks2.put("math", 4);
        marks2.put("history", 3);
        marks2.put("logic", 3);
        marks2.put("physics", 4);
        Student student2 = new Student("Polishchuk Yevgen", "math", 2, marks2);


        HashMap<String, Integer> marks3 = new HashMap<>();
        marks3.put("math", 3);
        marks3.put("history", 2);
        marks3.put("logic", 2);
        marks3.put("physics", 2);
        Student student3 = new Student("Vasylchenko Hrygory", "math", 3, marks3);

        HashMap<String, Integer> marks4 = new HashMap<>();
        marks4.put("math", 4);
        marks4.put("history", 5);
        marks4.put("logic", 5);
        marks4.put("physics", 3);
        Student student4 = new Student("Gavryliuk Semen", "math", 4, marks4);


        HashMap<String, Integer> marks5 = new HashMap<>();
        marks5.put("math", 3);
        marks5.put("history", 2);
        marks5.put("logic", 4);
        marks5.put("physics", 3);
        Student student5 = new Student("Semenchenko Viktor", "math", 4, marks5);


        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        List<Student> newStudents = studentEstimator.estimator(students);

        for (int i = 1; i <= 5; i++) {
            System.out.printf("%d course: \n", i);
            studentEstimator.printStudents(newStudents, i);
        }
    }
}