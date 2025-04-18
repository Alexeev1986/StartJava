public class Person {
    String gender;
    String name;
    int height;
    int weight;
    int age;

    public Person() {
        gender = "Мужской";
        name = "Антон";
        height = 183;
        weight = 96;
        age = 38;
    }

    public void walk() {
        System.out.println("Идет");
    }

    public void sit() {
        System.out.println("Сидит");
    }

    public void run() {
        System.out.println("Бежит");
    }

    public void teach() {
        System.out.println("Учит");
    }
}