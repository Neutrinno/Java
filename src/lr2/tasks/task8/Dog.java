package lr2.tasks.task8;

class Dog extends Animal {
    private final String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Гав-гав!");
    }

    public void fetch() {
        System.out.println(getName() + " принес мяч.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Порода: " + breed);
    }
}
