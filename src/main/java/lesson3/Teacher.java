package lesson3;

public class Teacher extends Human implements Polite {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    public String getSubject() {
        return subject;
    }
    public void identifyYourself()
    {
        System.out.println("Welcome. My name is " + name);
        System.out.println("I'm " + age + " and I'm teaching " + subject);
    }
    public void teach(Student a) {
        a.identifyYourself();
    }
    public void goodBye() {
        System.out.println("Goodbye.");
    }

}
