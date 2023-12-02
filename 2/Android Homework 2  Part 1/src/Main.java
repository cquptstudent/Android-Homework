/**
 * ..
 *
 * @author 2023210515
 * time 2023/11/4 周六 21:01
 */
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main{
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Elephant elephant = new Elephant();
        Monkey monkey = new Monkey();

        System.out.println(Refrigerator.refrigerator(elephant.elephant));
        System.out.println(Washer.washer(elephant.elephant));
        System.out.println(Oven.oven(elephant.elephant));
        System.out.println(Closet.closet(elephant.elephant));
        System.out.println(Refrigerator.refrigerator(tiger.tiger));
        System.out.println(Closet.closet(tiger.tiger));
        System.out.println(Oven.oven((monkey.monkey)));
        System.out.println(Oven.roast(elephant.elephant));
        System.out.println(Washer.wash(tiger.tiger));
    }
}