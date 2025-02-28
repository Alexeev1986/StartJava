public class Wolf {
    String gender;
    String name;
    int weight;
    int age;
    String color;

    public Wolf(String gender, String name, int weight, int age, String color) {
        this.gender = gender;
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
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

    public void howl() {
        System.out.println("Ауууу!");
    }

    public void hunt() {
        System.out.println("Охотится");
    }
}