package lesson3;

public class Scenario {
    public static void main(String[] args) {
        Student st = new Student("Ame", 14, 8);
        Teacher tch = new Teacher("Unknown ", 47, "Psychology");
        tch.identifyYourself();
        tch.teach(st);

        Human[] people = new Human[5];
        people[0] = new Human("Human1", 19);
        people[1] = new Human("Human2", 17);
        people[2] = new Human("Human3", 45);
        people[3] = new Human("Human4", 49);
        people[4] = new Human("Human5", 6);
        for (int i = 0; i < people.length; i++) {
            people[i].goodBye();
        }

    }
    public static void Talk(Polite polite){
        polite.goodBye();
    }
}
