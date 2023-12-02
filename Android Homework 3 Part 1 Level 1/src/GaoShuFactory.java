/**
 * ..
 *
 * @author 2023210515
 * @date 2023/11/11
 * 23:06
 */
public class GaoShuFactory extends Factory{
    public Exercise gaoShu = new GaoShu();
    @Override
    public void printHomework() {
        System.out.println(gaoShu.makeItPrint());
    }
}
