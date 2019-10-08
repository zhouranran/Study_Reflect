import model.Person;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * Field[] getFields(); //获取public修饰的成员变量
 * Field[] getField(String name);
 * Field[] getDeclaredFileds();//获取所有的成员变量
 * Field[] getDeclaredField(String name);
 */
public class ReflectField {
    public static void main(String[] args) throws Exception {
        //三种方式获得Class
        Class personClazz =  Class.forName("model.Person");
        Class personCLa =  Person.class;
        Person person = new Person();
        Class personCl = person.getClass();

        //通过Class获取public修饰符的Filed
        Arrays.stream(personClazz.getFields()).forEach(e->System.out.println(e));

        /**
         *得到 特定的Field name='sex' 区分大小写
         * 为该field设值
         */
        Field field = personClazz.getField("sex");
        field.set(person,"男");
        System.out.println(field.get(person));

        //通过Class 得到该类的所有属性
        Arrays.stream(personCLa.getDeclaredFields()).forEach(e->System.out.println(e));

        /**
         *得到private修饰的Field name='name' 区分大小写
         * 为该field设值
         */
        Field deField = personClazz.getDeclaredField("name");
        //忽略访问权限修饰符,暴力反射
        deField.setAccessible(true);
        deField.set(person,"star");
        System.out.println(deField.get(person));
    }
}
