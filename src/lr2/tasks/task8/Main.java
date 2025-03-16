package lr2.tasks.task8;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Дружок", 3, "Овчарка");
        Cat cat = new Cat("Мурзик", 2, "Рыба");
        Bird bird = new Bird("Воробей", 1, true);


        dog.displayInfo();
        dog.makeSound();
        dog.fetch();

        cat.displayInfo();
        cat.makeSound();
        cat.sleep();

        bird.displayInfo();
        bird.makeSound();
        bird.fly();
    }
}
