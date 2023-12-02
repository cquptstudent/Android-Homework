package Level2;

import java.util.Scanner;

/**
 * ..
 *
 * @author 2023210515
 * @date 2023/11/11
 * 23:43
 */
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    //static ArrayList<Student> student = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        StudentLeader studentLeader = new StudentLeader();
        HelpTeacher helpTeacher = new HelpTeacher();
        Student student = new Student();
        Teacher teacher = new Teacher();
        System.out.println("Please enter the number of the student:");
        Student.studentNumber = new Scanner(System.in).nextInt();
        student.DoHomework();
        student.handInHomework();
        studentLeader.SortHomework();
        studentLeader.handInHomework();
        helpTeacher.handInHomework();
        teacher.getHomework();
/*

 */

    }
}