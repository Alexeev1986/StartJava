
public class User {
    String name;
    short age;
    int height;

    public User(String name, short age, int height) {
        count++;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User(String name, int height, short age) {
        count++;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User(int height, short age, String name) {
        count++;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User(int height, String name, short age) {
        count++;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User(short age, int height, String name) {
        count++;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User(short age, String name, int height) {
        count++;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    static int count = 0;

    public static void main(String[] args){
        User max = new User("Max", (short) 22, 180);
        User dan = new User("Dan", 178, (short) 17);
        User mat = new User(189, (short) 25, "Mat");
        User rat = new User(162, "Rat", (short) 30);
        User bob = new User((short) 21, "Bob", 177);
        User rob = new User((short) 31, 185, "Rob");
        System.out.println(" Имя " + max.name + " Возраст " + max.age + " Рост " + max.height);
        System.out.println(" Имя " + dan.name + " Возраст " + dan.age + " Рост " + dan.height);
        System.out.println(" Имя " + mat.name + " Возраст " + mat.age + " Рост " + mat.height);
        System.out.println(" Имя " + rat.name + " Возраст " + rat.age + " Рост " + rat.height);
        System.out.println(" Имя " + bob.name + " Возраст " + bob.age + " Рост " + bob.height);
        System.out.println(" Имя " + rob.name + " Возраст " + rob.age + " Рост " + rob.height);
        System.out.printf("%n Всего пользователей чата " + count);
    }
}