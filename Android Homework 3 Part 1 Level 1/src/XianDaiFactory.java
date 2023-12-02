/**
 * ..
 *
 * @author 2023210515
 * @date 2023/11/11
 * 23:06
 */
public class XianDaiFactory extends Factory{
    public Exercise xianDai = new XianDai();
    @Override
    public void printHomework() {
        System.out.println(xianDai.makeItPrint());;
    }
}
