package lr7.tasks.task8;

import java.io.*;

public class task8 {
    public static void main(String[] args) {
        Person person = new Person("Иван Иванов", 30, "secret123");
        System.out.println("Объект до сериализации: " + person);

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("person.dat"))) {
            oos.writeObject(person);
            System.out.println("Объект записан в файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("person.dat"))) {
            Person restoredPerson = (Person) ois.readObject();
            System.out.println("Объект восстановлен из файла: " + restoredPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}