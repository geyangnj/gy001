import cn.oop.Person;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("张三");
        p1.setAge(-30);
        p1.show();
        Person.demo("张三");
    }
}
