public class Person {
    String name;
    String gender;
    double height;
    double weight;
    int age;

    {
        gender = "Мужской";
        name = "Антон";
        height = 183;
        weight = 96;
        age = 38;
    }

    void walk() {
        System.out.println(name + " идёт.");
    }

    void sit() {
        System.out.println(name + " сидит.");
    }

    void run() {
        System.out.println(name + " бежит.");
    }

    void speak() {
        System.out.println(name + " говорит.");
    }

    void learnJava() {
        System.out.println(name + " учит Java!");
    }
}