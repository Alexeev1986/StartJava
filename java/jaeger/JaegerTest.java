public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Bracer Phoenix");
        jaeger1.setMark("Mark-5");
        jaeger1.setOrigin("USA");
        jaeger1.setHeight(70.7f);
        jaeger1.setWeight(2.1f);
        jaeger1.setStrength(8);
        jaeger1.setArmor(9);
        jaeger1.setLocation("A 2");
        jaeger1.printAllParameters();
        Jaeger jaeger2 = new Jaeger("Crimson Typhoon", "Mark-4",
             "China", 76.2f, 1.722f, 8, 6, "A 5");
        jaeger2.printAllParameters();

        jaeger1.move();
        System.out.println(jaeger2.scanKaiju());
        jaeger1.useVortexCannon();

        jaeger1.getGeoLocation();
        jaeger2.getGeoLocation();
    }
}
