package lesson3;

public class Human {
    protected String name;
    protected int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void identifyYourself() {
        System.out.println("Hello! My name is " + name);
        System.out.println("I'm " + age + " years old");
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void goodBye() {
        System.out.println("Byee");
    }
}
