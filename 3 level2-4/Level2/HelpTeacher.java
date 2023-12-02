package Level2;

/**
 * ..
 *
 * @author 2023210515
 * @date 2023/11/11
 * 23:50
 */
public class HelpTeacher implements IHandInHomework{
    @Override
    public void handInHomework() throws InterruptedException {
        StudentLeader studentLeader = new StudentLeader();
        if(studentLeader.AllSorted()){
            System.out.println("All handed in");
            Thread.sleep((long) (Math.random() * 1000));
            System.out.println("Goody Goody");
        }else{
            Thread.sleep((long) (Math.random() * 5000));
            System.out.println("Not all");
        }
    }
}
