package lr2.tasks.task8;

class Cat extends Animal {
    private final String foodType;

    public Cat(String name, int age, String foodType) {
        super(name, age);
        this.foodType = foodType;
    }


    @Override
    public void makeSound() {
        System.out.println("Мяу-мяу!");
    }

    public void sleep() {
        System.out.println(getName() + " спит.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тип корма: " + foodType);
    }
}