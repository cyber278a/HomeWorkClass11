package class11HW;

public class DogTester {
    public static void main(String[] args) {
        Dog husky=new Dog();
        husky.color="black";
        husky.gender="male";
        husky.age=5;
        husky.weight=10;
        System.out.println(husky.weight);
        husky.drink();

        Dog bulldog=new Dog();
        bulldog.name="Buddy";
        bulldog.age=8;
        bulldog.color="grey";
        System.out.println(bulldog.color);
        bulldog.defend();

        Dog labrador=new Dog();
        labrador.weight=60;
        labrador.name="Pirate";
        labrador.age=6;
        labrador.color="brown";
        System.out.println(labrador.name);
        labrador.breath();
    }
}
