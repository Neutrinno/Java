package lr2.tasks.task4;

public class task4 {
    public static void main(String[] args) {
        Person person = new Person("Константин", 22, "мужской");
        System.out.println("Имя: " + person.getName());
        System.out.println("Возраст: " + person.getAge());
        System.out.println("Пол: " + person.getGender());

        person.setName("Петр");
        person.setAge(33);
        person.setGender("Мужской");

        System.out.println("Обновленное имя: " + person.getName());
        System.out.println("Обновленный возраст: " + person.getAge());
        System.out.println("Обновленный пол: " + person.getGender());

    }
}
