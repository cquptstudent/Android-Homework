
package Level2;

/**
 * ..
 *
 * @author 2023210515
 * @date 2023/11/11
 * 23:59
 */
public class Student implements IDoHomework, IHandInHomework{
    static int studentNumber;
    @Override
    public void DoHomework() throws InterruptedException {
        System.out.println("Student is doing homework......");
        Thread.sleep(100);
    }

    @Override
    public void handInHomework() throws InterruptedException {
        int error;
        int wrongNumber;

        error = (int) (Math.random() * 100);
        if(error >= 95){
            wrongNumber = (int) (Math.random() * 3);
        }else{
            wrongNumber = 0;
        }

        for(int i = 0; i < studentNumber-wrongNumber; i++) {
            System.out.println("Student hand in the homework " + (i + 1));
            Thread.sleep((long) (Math.random()*1000));
        }
    }
}
