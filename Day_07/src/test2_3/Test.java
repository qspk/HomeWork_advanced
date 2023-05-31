package test2_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("2020212201", "小王", 22, "计算机科学与技术1班"));
        students.add(new Student("2020213201", "小刘", 20, "软件工程1班"));
        students.add(new Student("2020212511", "小李", 21, "土木工程1班"));
        students.add(new Student("2020217251", "小李", 22, "电子商务1班"));
        while (true) {
            System.out.println("请输入要查找的学生学号: ");
            String id = sc.next();

            Student student = getStudentById(students, id);
            if (student == null) {
                System.out.println("没有找到该学号,请检查后重试");
            } else {
                System.out.println("查询到的学生信息为: ");
                System.out.println(student);
            }
        }
    }

    private static Student getStudentById(ArrayList<Student> students, String id) {
        for (Student student : students) {
            if (student.getStudentId().equals(id)) {
                return student;
            }
        }
        return null;
    }
}
