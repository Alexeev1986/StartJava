public class WolfTest {
    public static void main(String[] args) {
        Wolf akella = new Wolf("кабель", "Акелла", 55, 7, "Серый");
        System.out.println("Пол: " + akella.gender);
        System.out.println("Кличка: " + akella.name);
        System.out.println("Вес: " + akella.weight);
        System.out.println("Возраст: " + akella.age);
        System.out.println("Цвет: " + akella.color);

        akella.walk();
        akella.sit();
        akella.run();
        akella.howl();
        akella.hunt();
    }
}