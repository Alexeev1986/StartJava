package modifiedwolf;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("кабель");
        wolf.setNickname("Акелла");
        wolf.setWeight(85.5f);
        wolf.setAge(3);
        wolf.setColor("Серый");
        String wolfReport = """
                    Пол: %s
                    Кличка: %s
                    Вес: %.2f
                    Возраст: %d
                    Окрас: %s
                    """.formatted(wolf.getGender(), wolf.getNickname(), wolf.getWeight(), wolf.getAge(), wolf.getColor());
        System.out.println(wolfReport);
        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}