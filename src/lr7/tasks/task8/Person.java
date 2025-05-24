package lr7.tasks.task8;

import java.io.Serializable;

class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    private final String name;
    private final int age;
    private final transient String password;

    public Person(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + ", password='" + password + '\'' + '}';
    }
}
