public class Cat {

    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Cat() {
        count++;
        this.name = "Уличный кот номер " + count;
    }

    static int count = 0;

    public void sayMeow() {
        System.out.println("Мяу!");
    }

    public void jump() {
        System.out.println("Прыг-скок!");
    }

    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", 5);
        
        count++;

        Cat vasia = new Cat(2, "Vasia");

        count++;

        Cat streetCat1 = new Cat();
        Cat streetCat2 = new Cat();

        System.out.println(streetCat1.name);
        System.out.println(streetCat2.name);

        System.out.println("Мы создали кота по имени " + barsik.name + ", его возраст - " + barsik.age);
        System.out.println("Мы создали кота по имени " + vasia.name + ", его возраст - " + vasia.age);

        System.out.println("Общее количество котов = " + count);

        barsik.sayMeow();
        barsik.jump();
    }
}