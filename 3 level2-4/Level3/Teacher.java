package Level3;

/**
 * ..
 *
 * @author 2023210515
 * @date 2023/11/11
 * 23:49
 */
public class Teacher {

    public void getHomework() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Teacher: I get " + StudentLeader.homeworkHandedIn +  " homework");
        Thread.sleep((long) (Math.random()*500*StudentLeader.homeworkHandedIn));
        System.out.println("Teacher: All checked!");
    }

}
