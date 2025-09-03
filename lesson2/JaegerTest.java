package lesson2;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Cherno Alpha");
        jaeger1.setMark("Mark-1");
        jaeger1.setOrigin("Russia");
        jaeger1.setHeight(85.34f);
        jaeger1.setWeight(2.214f);
        jaeger1.setStrength(10);
        jaeger1.setArmor(10);
        Jaeger jaeger2 = new Jaeger("Crimson Typhoon", "Mark-4", "China", 76.2f, 1.722f, 8, 6);
        jaeger1.printAllParameters();
        jaeger2.printAllParameters();
        jaeger1.compareRobotsByStrength(jaeger1,jaeger2);
        jaeger1.compareRobotsByArmor(jaeger1,jaeger2);
        jaeger1.move();
        jaeger2.useVortexCannon();
        System.out.println(jaeger2.getModelName() + " " + jaeger2.scanKaiju());
        if (jaeger1.drift()) System.out.println(jaeger1.getModelName() + " дрейфует");
    }
}

