package ua.intita.qa.homework17.task1;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.Set;


@Getter
@Setter
public class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> marks;


    public Student(String name, String group, int course, Map<String, Integer> marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }

    public int averageMark(Map<String, Integer> marks) {
        Set<String> keySet = marks.keySet();
        int numberOfMarks = keySet.size();
        int average = 0;
        for (String key : keySet) {
            double mark = (int) marks.get(key);
            average += mark;
        }
        return average /= numberOfMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                '}';
    }


}
