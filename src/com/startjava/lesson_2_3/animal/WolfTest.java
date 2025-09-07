package com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "кабель";
        wolf.nickname = "Акелла";
        wolf.weight = 85.5f;
        wolf.age = 3;
        wolf.color = "Серый";
        System.out.println(
                """
                Пол: %s
                Кличка: %s
                Вес: %.2f
                Возраст: %d
                Окрас: %s
                """.formatted(wolf.gender, wolf.nickname, wolf.weight, wolf.age, wolf.color));
        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}