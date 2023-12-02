/**
 * ..
 *
 * @author 2023210515
 * @date 2023/11/11
 * 23:04
 */
public class ThreeFactory extends Factory{
    public Exercise exercise = new GaoShu();
    public Exercise exercise2 = new XianDai();
    public Exercise exercise3 = new English();
    @Override
    public void printHomework() {
        System.out.println(exercise.makeItPrint());
        System.out.println(exercise2.makeItPrint());
        System.out.println(exercise3.makeItPrint());
    }
}
