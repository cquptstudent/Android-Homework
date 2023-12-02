
package Level2;
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
        System.out.println("Teacher get " + StudentLeader.homeworkHandedIn +  " homework");
        Thread.sleep((long) (Math.random()*500*StudentLeader.homeworkHandedIn));
        System.out.println("All checked!");
    }

}
