/**
 * ..
 *
 * @author 2023210515
 * @date 2023/11/11
 * 23:06
 */
public class EnglishFactory extends Factory{
    public Exercise English = new English();
    public void printHomework() {
        System.out.println(English.makeItPrint());;
    }
}
