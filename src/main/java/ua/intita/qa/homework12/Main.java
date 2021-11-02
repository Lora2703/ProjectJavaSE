package ua.intita.qa.homework12;

import javax.security.auth.Subject;

public class Main {
    public static void main(String[] args) throws NoGroupOnFacultyException, MarkInvalidException, NoFacultyInUniversity {
        University university = new University("VDPU");

        Faculty[] faculties = new Faculty[2];
        faculties[0] = new Faculty(university.getuName(), "math");
        faculties[1] = new Faculty(university.getuName(), "language");

        String[] subjectsMath = new String[]{"history", "math", "physics", "ukrainian"};
        String[] subjectsLang = new String[]{"history", "ukrainian", "english", "german"};

        Group[] groups = new Group[5];
        groups[0] = new Group(university.getuName(), faculties[0].getfName(), "m1");
        groups[1] = new Group(university.getuName(), faculties[0].getfName(), "m2");
        groups[2] = new Group(university.getuName(), faculties[1].getfName(), "l1");
        groups[3] = new Group(university.getuName(), faculties[1].getfName(), "l2");
        groups[4] = new Group(university.getuName(), faculties[1].getfName(), "l3");

        Student[] students = new Student[10];
        students[0] = new Student(groups[0].getuName(), groups[0].getfName(), groups[0].getgName(),
                "Shevchenko", "Taras");
        students[0].setSubjects(subjectsMath);
        students[0].setMarks(new int[]{8, 10, 9, 8});
        students[1] = new Student(groups[0].getuName(), groups[0].getfName(), groups[0].getgName(),
                "Bulba", "Taras");
        students[1].setSubjects(subjectsMath);
        students[1].setMarks(new int[]{5, 9, 8, 6});
        students[2] = new Student(groups[1].getuName(), groups[1].getfName(), groups[1].getgName(),
                "Nechuy-Levytsky", "Ivan");
        students[2].setSubjects(subjectsMath);
        students[2].setMarks(new int[]{8, 6, 9, 4});
        students[3] = new Student(groups[1].getuName(), groups[1].getfName(), groups[1].getgName(),
                "Kotsiubynsky", "Mykola");
        students[3].setSubjects(subjectsMath);
        students[3].setMarks(new int[]{6, 9, 5, 7});
        students[4] = new Student(groups[2].getuName(), groups[2].getfName(), groups[2].getgName(),
                "Shevchenko", "Vasyl");
        students[4].setSubjects(subjectsLang);
        students[4].setMarks(new int[]{10, 9, 7, 8});
        students[5] = new Student(groups[2].getuName(), groups[2].getfName(), groups[2].getgName(),
                "Shevchenko", "Vasyl");
        students[5].setSubjects(subjectsLang);
        students[5].setMarks(new int[]{9, 8, 6, 7});
        students[6] = new Student(groups[3].getuName(), groups[3].getfName(), groups[3].getgName(),
                "Shevchenko", "Vasyl");
        students[6].setSubjects(subjectsLang);
        students[6].setMarks(new int[]{8, 6, 9, 4});
        students[7] = new Student(groups[3].getuName(), groups[3].getfName(), groups[3].getgName(),
                "Shevchenko", "Vasyl");
        students[7].setSubjects(subjectsLang);
        students[7].setMarks(new int[]{6, 9, 10, 8});
        students[8] = new Student(groups[4].getuName(), groups[4].getfName(), groups[4].getgName(),
                "Shevchenko", "Vasyl");
        students[8].setSubjects(subjectsLang);
        students[8].setMarks(new int[]{10, 8, 7, 9});
        students[9] = new Student(groups[4].getuName(), groups[4].getfName(), groups[4].getgName(),
                "Shevchenko", "Vasyl");
        students[9].setSubjects(subjectsLang);
        students[9].setMarks(new int[]{9, 7, 8, 6});

//        for(Student student: students) {
//            System.out.println(student.toString());
//        }

        System.out.println("\nSTUDENT AVG:");
        for (Student student : students) {
            try {
                System.out.println("STUDENT " + student.getFirstName() + " " + student.getLastName() +
                        " AVG: " + student.avgMark());
            } catch (MarkInvalidException e) {
                System.out.println("STUDENT " + student.getFirstName() + student.getLastName() + " " + e.toString());
            }
        }

        System.out.println("\nGROUP AVG:");
        for (Group group : groups) {
            System.out.println("Group " + group.getgName());
            double avgG = 0;
            for (int i = 0; i < 4; i++) {
                try {
                    avgG = group.avgGroup(students, group.getgName(), i);
                } catch (NoStudentsInGroupException e) {
                    System.out.println(e.toString());
                } catch (MarkInvalidException e) {
                    System.out.println(e.toString());
                }
                if (group.getfName().equals(faculties[0].getfName())) {
                    System.out.println(" subject " + (i + 1) + " " + subjectsMath[i] + " AVG: " + avgG);
                } else {
                    System.out.println(" subject " + (i + 1) + " " + subjectsLang[i] + " AVG: " + avgG);
                }
            }
        }

        System.out.println("\nFACULTY AVG:");
        for (int i = 0; i < 4; i++) {
            for (Faculty faculty : faculties) {
                double avgF = 0;
                try {
                    avgF += faculty.avgFaculty(students, faculty.getfName(), i);
                } catch (NoGroupOnFacultyException e) {
                    System.out.println(e.toString());
                } catch (MarkInvalidException e) {
                    System.out.println(e.toString());
                }
                if (faculty.getfName().equals(faculties[0].getfName())) {
                    System.out.println("FACULTY " + faculty.getfName() + " AVG SUBJECT " + (i + 1) + " "
                            + subjectsMath[i] + " = " + avgF);
                } else {
                    System.out.println("FACULTY " + faculty.getfName() + " AVG SUBJECT " + (i + 1) + " "
                            + subjectsLang[i] + " = " + avgF);
                }
            }
        }


        System.out.println("\nUNIVERSITY AVG:");

        double[] avg = new double[8];
        String[] subUniversity = new String[8];
        int k = 0;
        int[] mask = new int[4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (subjectsMath[i].equals(subjectsLang[j])) {
                    try {
                        avg[k] += faculties[0].avgFaculty(students, faculties[0].getfName(), i);
                    } catch (NoGroupOnFacultyException e) {
                        System.out.println(e.toString());
                    } catch (MarkInvalidException e) {
                        System.out.println(e.toString());
                    } catch (NoFacultyInUniversity e) {
                        System.out.println(e.toString());
                    }
                    try {
                        avg[k] += faculties[1].avgFaculty(students, faculties[1].getfName(), j);
                    } catch (NoGroupOnFacultyException e) {
                        System.out.println(e.toString());
                    } catch (MarkInvalidException e) {
                        System.out.println(e.toString());
                    }

                    mask[j] = 1;
                    subUniversity[k] = subjectsMath[i];
                    k++;
                    break;
                }
            }
            if (subUniversity[k - 1] != subjectsMath[i]) {
                try {
                    avg[k] = faculties[0].avgFaculty(students, faculties[0].getfName(), i);
                } catch (NoGroupOnFacultyException e) {
                    System.out.println(e.toString());
                } catch (MarkInvalidException e) {
                    System.out.println(e.toString());
                }
                subUniversity[k] = subjectsMath[i];
                k++;
            }
        }

        for (int i = 0; i < 4; i++) {
            if (mask[i] == 0) {
                try {
                    avg[k] += faculties[1].avgFaculty(students, faculties[1].getfName(), i);
                } catch (NoGroupOnFacultyException e) {
                    System.out.println(e.toString());
                } catch (MarkInvalidException e) {
                    System.out.println(e.toString());
                }
                subUniversity[k] = subjectsLang[i];
                k++;
            }
        }


        int len = avg.length;
        for (int i = 0; i < len; i++) {
            if (avg[i] != 0)
                System.out.println(subUniversity[i] + " " + avg[i]);
        }
    }
}
