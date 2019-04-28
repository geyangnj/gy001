package cn.oop;

public class Person {
    public String name;
    public int age;

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
        if(age<0) {
            this.age=0;
        } else {this.age=age;}

    }

    public void show() {
        System.out.println("姓名为：" + this.name + "年龄为：" + this.age);
    }

    public static void demo(String name)
    { System.out.println("name:"+ name);}

}
