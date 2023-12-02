package Level3;

/**
 * ..
 *
 * @author 2023210515
 * @date 2023/11/11
 * 23:50
 */
public class HelpTeacher implements IHandInHomework, IBack{
    private final StudentLeader studentLeader;
    public HelpTeacher(StudentLeader studentLeader){
        this.studentLeader = studentLeader;
    }
    @Override
    public void handInHomework() throws InterruptedException {
        StudentLeader studentLeader = new StudentLeader();
        if(studentLeader.allSorted()){
            System.out.println("HT: All handed in");
            Thread.sleep((long) (Math.random() * 1000));
            System.out.println("HT: Good Good");
        }else{
            Thread.sleep((long) (Math.random() * 5000));
            System.out.println("HT: Not all handed in.");
            System.out.println("HT: What are you doing?");
        }
    }

    public void call() throws InterruptedException {
        if(!studentLeader.isArranged()) {
            System.out.println("HT: Please rearrange the order of the homework");
            studentLeader.doPractice(this);
            Thread.sleep((long) (Math.random()*500));
        }
        else {
            back();
        }
    }

    @Override
    public void back() {
        System.out.println("All done.");
    }
}
