package obuchenie;

public class Person {

    public static int count; // статик позволяет полю быть статичным - привязанным к классу и сохранять значение

    public Person() {
        count++;
    }

    public static void getCount() { // в статичном методе работаем только со статичными полями
        System.out.println("Количество: " + count);
    }

}
