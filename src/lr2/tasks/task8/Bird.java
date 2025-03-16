package lr2.tasks.task8;

class Bird extends Animal {
    private final boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.println("Чик-чирик!");
    }

    public void fly() {
        if (canFly) {
            System.out.println(getName() + " летает.");
        } else {
            System.out.println(getName() + " не может летать.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Может летать: " + (canFly ? "Да" : "Нет"));
    }
}
