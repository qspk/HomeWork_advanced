package test1_2;

import java.util.Scanner;

public class Test {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("请输入学生姓名: ");
        String name = sc.next();
        System.out.println("请输入学生性别: ");
        String sex = sc.next();
        System.out.println("请输入学生生日: ");
        String birthday = sc.next();
        System.out.println("请输入学生学号: ");
        String sId = sc.next();
        System.out.println("请输入学生专业: ");
        String speciality = sc.next();

        student.setData(name, sex, birthday);
        student.setInfo(sId, speciality);

        System.out.println(student.getData());
        System.out.println(student.getInfo());

    }

}
