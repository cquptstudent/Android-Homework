import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ..
 *
 * @author 2023210515
 * @date 2023/11/19
 * 0:00
 */
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.



public class Main{



/*   public Main() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
//        Class<?> clazz = HelloWorld.class;
//        Method  method = clazz.getDeclaredMethod("Hello", String.class);
//        method.setAccessible(true);
//        Object instance = clazz.getDeclaredConstructor().newInstance();
//        method.invoke(instance, "String");
//    }*/

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = HelloWorld.class;
        Method method = clazz.getDeclaredMethod("Hello");
        method.setAccessible(true);
        Object instance = clazz.getDeclaredConstructor().newInstance();
        method.invoke(instance);
    }
}