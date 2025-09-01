public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "кабель";
        wolf.nickname = "Акелла";
        wolf.weight = 85.5;
        wolf.age = 3;
        wolf.color = "Серый";
        String wolfReport = """
                    Пол: %s
                    Кличка: %s
                    Вес: %.2f
                    Возраст: %d
                    Окрас: %s
                    """.formatted(
                    wolf.gender,
                    wolf.nickname,
                    wolf.weight,
                    wolf.age,
                    wolf.color);
        System.out.println(wolfReport);
        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}