package lesson2;

public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int strength;
    private int armor;

    public Jaeger() {
        this.modelName = null;
        this.mark = null;
        this.origin = null;
        this.height = 0;
        this.weight = 0;
        this.strength = 0;
        this.armor = 0;
    }

    public Jaeger(String modelName, String mark, String origin, float height,
            float weight, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    boolean drift() {
        return true;
    }

    void move() {
        System.out.println(modelName + " передвигается ");
    }

    String scanKaiju() {
        return "scanning Kaiju";
    }

    void useVortexCannon() {
        System.out.println(modelName + " activated VortexCannon");
    }

    void compareRobotsByStrength(Jaeger jaeger1, Jaeger jaeger2) {
        if (jaeger1.strength > jaeger2.strength) {
            System.out.println("Сила " + jaeger1.modelName + " больше чем у " + jaeger2.modelName );
        } else {
            System.out.println("Сила " + jaeger2.modelName + " больше чем у " + jaeger1.modelName);
        }
    }

    void compareRobotsByArmor(Jaeger jaeger1, Jaeger jaeger2) {
        if (jaeger1.armor > jaeger2.armor) {
            System.out.println("Броня " + jaeger1.modelName + " мощнее чем у " + jaeger2.modelName );
        } else {
            System.out.println("Броня " + jaeger2.modelName + " мощнее чем у " + jaeger1.modelName);
        }
    }

    void printAllParameters() {
        System.out.println("modelName " + modelName);
        System.out.println("mark " + mark);
        System.out.println("origin " + origin);
        System.out.println("height " + height);
        System.out.println("weight " + weight);
        System.out.println("strenght " + strength);
        System.out.println("armor " + armor);
    }
}
