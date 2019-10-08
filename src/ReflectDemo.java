import model.Person;

public class ReflectDemo {

    public static void main(String[] args) throws ClassNotFoundException {
        //1.全类名 Class.forName("全类名")
        Class personClazz = Class.forName("model.Person");
        System.out.println(personClazz);

        //类名.class
        Class personCla = Person.class;
        System.out.println(personCla);

        //对象.getClass
        Person person = new Person();
        Class personCl = person.getClass();
        System.out.println(personCla);

        //同一个字节码文件 在程序运行过程中只会加载一次 不论通过哪种方式获取Class对象都是同一个
        System.out.println(personCla == personCl && personCl == personClazz);

        Person person1 = new Person();
        Class personCl1 = person1.getClass();
        System.out.println(personCl1 == personCl);
    }
}
