package Level3;

import java.util.Scanner;

/**
 * ..
 *
 * @author 2023210515
 * @date 2023/11/12
 * 18:34
 */
public class Main {


    public static void main(String[] args) throws InterruptedException {
        StudentLeader studentLeader = new StudentLeader();
        HelpTeacher helpTeacher = new HelpTeacher(new StudentLeader());
        Student student = new Student();
        Teacher teacher = new Teacher();
        System.out.println("Please enter the number of the student:");
        Student.studentNumber = new Scanner(System.in).nextInt();
        student.doHomework();
        student.handInHomework();
        studentLeader.sortHomework();
        studentLeader.handInHomework();
        helpTeacher.call();
        helpTeacher.handInHomework();
        teacher.getHomework();
/*

 */
    }
}