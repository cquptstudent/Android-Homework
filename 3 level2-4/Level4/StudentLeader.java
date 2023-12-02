package Level4;

/**
 * ..
 *
 * @author 2023210515
 * @date 2023/11/11
 * 23:49
 */
public class StudentLeader implements IGetHomework, IHandInHomework {

    static int homeworkHandedIn;
    @Override
    public boolean allSorted() {
        return sortHomework() == Student.studentNumber;
    }

    @Override
    public int sortHomework(){
        int isAll = (int) (Math.random() * 1000);//有0.1%概率学委数错了
        int lostHomework = (int) (Math.random() * 3) + 1;//最多3人
        if(isAll >= 999){
            homeworkHandedIn = Student.studentNumber - lostHomework;
        }else{
            homeworkHandedIn = Student.studentNumber;
        }
        return homeworkHandedIn;
    }

    @Override
    public void handInHomework() throws InterruptedException {
        System.out.println("SL: I handed in the homework, total " + homeworkHandedIn);
        Thread.sleep(200);
    }

    public void doPractice(IBack IBack) throws InterruptedException {
        System.out.println("(Student leader is rearranging the homework......)");
        Thread.sleep((long) (Math.random()*1000));
        System.out.println("SL: Rearranged");
        Thread.sleep((long) (Math.random()*1000));
        IBack.back();
    }
//0.95的概率没有整理
    public boolean isArranged(){
        int isSorted = (int)(Math.random()*100);
        return isSorted <= 95;
    }
}
