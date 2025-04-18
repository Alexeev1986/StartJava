public class Jaeger {
    String modelName;
    String mark;
    String origin;
    String location;
    float height;
    float weight;
    int strength;
    int armor;

    public Jaeger() {
        this.modelName = " ";
        this.mark = " ";
        this.origin = " ";
        this.height = 0;
        this.weight = 0;
        this.strength = 0;
        this.armor = 0;
        this.location = "A 1";
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

    public void setLocation(String location) {
        this.location = location;
    }

    public Jaeger(String modelName, String mark, String origin, float height,
         float weight, int strength, int armor, String location) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.armor = armor;
        this.location = location;
    }

    boolean drift() {
        return true;
    }

    void move() {
        System.out.println("moving");
    }

    void moveToLocation(String location) {
        this.location = location;
        System.out.println(this.modelName + " находится в квадрате " + location);
    }

    void getGeoLocation() {
        System.out.println("Текущее местоположение " + this.location);
    }

    String scanKaiju() {
        return "scanning";
    }

    void useVortexCannon() {
        System.out.println("activated");
    }

    void printAllParameters() {
        System.out.println("modelName " + this.modelName);
        System.out.println("mark " + this.mark);
        System.out.println("origin " + this.origin);
        System.out.println("height " + this.height);
        System.out.println("weight " + this.weight);
        System.out.println("strength " + this.strength);
        System.out.println("armor " + this.armor);
        System.out.println("location" + this.location);
    }
}