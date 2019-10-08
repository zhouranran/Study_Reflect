import model.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;

/**
 *Constructor<?> getConstructors();
 *Constructor<T> getConstructor(Class<?>... parameterTypes)
 *Constructor<?>[] getDeclaredConstructors();
 *Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
 */
public class ReflectConstuctor {
    public static void main(String[] args) throws Exception {
        //三种方式获得Class
        Class personClazz =  Class.forName("model.Person");
        Class personCLa =  Person.class;

        //通过Class获取public修饰的Constructor
        Arrays.stream(personClazz.getConstructors()).forEach(cons->System.out.println(cons));
        /**
         * 得到特定的Constructor
         * 首先得到无参的构造方法 并创建对象
         */
        Constructor constructor = personClazz.getConstructor();
        Object person = constructor.newInstance();
        System.out.println(person);

        //通过Class获取所有的Constructor
        Arrays.stream(personClazz.getDeclaredConstructors()).forEach(cons->System.out.println(cons));

        //得到一个拥有name 和 age 的constructor
        Constructor privateConstructor = personClazz.getDeclaredConstructor(String.class,int.class);
        //忽略访问权限修饰符
        privateConstructor.setAccessible(true);
        Object privatePerson = privateConstructor.newInstance("star",29);
        System.out.println(privatePerson);
    }
}
