
package Level2;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * ..
 *
 * @author 2023210515
 * @date 2023/11/11
 * 23:49
 */
public class StudentLeader implements IGetHomework, IHandInHomework{

    static int homeworkHandedIn;
    @Override
    public boolean AllSorted() {
        return SortHomework() == Student.studentNumber;
    }
    

    @Override
    public int SortHomework(){
        int isAll = (int) (Math.random() * 100);//有1%概率学委数错了
        int lostHomework = (int) (Math.random() * 3);//最多3人
        if(isAll >= 99){
            homeworkHandedIn = Student.studentNumber - lostHomework;
        }else{
            homeworkHandedIn = Student.studentNumber;
        }
        return homeworkHandedIn;
    }

    @Override
    public void handInHomework() throws InterruptedException {
        System.out.println("Student leader handed in the homework, total " + homeworkHandedIn);
        Thread.sleep(200);
    }
}
