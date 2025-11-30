package obuchenie;

public enum Animal { //создание перечисления животных
    DOG("dog"), CAT("cat"), FROG("frog"); //задание переменных, которые ведут себя как статичные. //Animal animal = Animal.CAT; - создание объекта, который имеет значение CAT
    // создание объектов перечисления с заданием какого то дополнительного поля из конструктора

    private String translation;

    Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    public String toString() {
        return "Перевод на русский язык:" + translation;

    }
}
