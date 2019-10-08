import model.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 *Method[] getMethods();
 *Method getMethod(String name, Class<?>... parameterTypes)
 *Method[] getDeclaredMethods();
 *Method getDeclaredMethod(String name, Class<?>... parameterTypes)
 */
public class ReflectMethod {
    public static void main(String[] args) throws Exception {
        //获得Class
        Class personCLa =  Person.class;
        //通过Class获取public修饰的Method
        Arrays.stream(personCLa.getMethods()).forEach(method->System.out.println(method));
        Arrays.stream(personCLa.getMethods()).forEach(method->System.out.print(method.getName()));
        /**
         * 得到特定的Method
         * 执行方法invoke();
         */
        Method method = personCLa.getMethod("eat");
        method.invoke(personCLa.newInstance());

        Method method2 = personCLa.getMethod("eat",String.class);
        method2.invoke(personCLa.newInstance(),"rice");
    }
}
