package lr4.examples;

public class example12 {
    public static void m(String str, double number) throws IllegalArgumentException {
        if (str == null) {
            throw new IllegalArgumentException("Строка не может быть null");
        }
        if (number > 0.001) {
            throw new IllegalArgumentException("Число слишком большое. Допустимо значение ≤ 0.001");
        }
    }

    public static void main(String[] args) {
        try {
            m(null, 0.000001);
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка валидации: " + e.getMessage());
        }
        try {
            m("Valid", 0.0005);
            System.out.println("Данные прошли валидацию успешно");
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка валидации: " + e.getMessage());
        }
    }
}