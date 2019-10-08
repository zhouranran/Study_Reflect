package model;

public class Person {
    private int age;

    public String sex;
    protected String address;
    String telephone;
    private String name;

    public Person(){

    }

    private Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    Person(int age, String sex, String name) {
        this.age = age;
        this.sex = sex;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void eat(){
        System.out.println("eat....");
    }

    public void eat(String thing){
        System.out.println("eat...." + thing);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
