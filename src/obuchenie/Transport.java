package obuchenie;

public abstract class Transport {

    // public - модификатор, показывающий, что класс(и не только) будет доступен отовсюду
    // protected - делает доступ только внутри самого класса или классов наследников
    // private - закрывает доступ внутри одного класса

    protected float speed;
    private int weight;
    private String color;
    private byte[] coordinate;

    public Transport() {}


    public Transport(float speed, int weight, String color, byte[] coordinate) {
        System.out.println("Object created");
        setValues(speed, weight, color, coordinate);
    }

    public Transport(int weight, byte[] coordinate) {
        this.weight = weight;
        this.coordinate = coordinate;
    }

    public abstract void moveObject(float speed);
    public abstract boolean stopObject();

    protected void setValues(float speed, int weight, String color, byte[] coordinate) { // сеттер - метод, позволяющий задать переменную без прямого ее участия, принцип инкапсуляции в этом и заключается, нужно для того, чтобы прописать ограничения использования полей для конечного пользователя
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

    protected String getValues() { // геттер - метод, возвращающий поля для использования конечным пользователем, принцип инкапсуляции
        String info = "Object speed: " + this.speed + ". Weight: " + this.weight + ".Color: " + this.color + ".\n";
        String infoCoordinates = "Coordinates:\n";
        for(int i = 0; i < coordinate.length; i++)
            infoCoordinates += coordinate[i] + "\n";
        return info + infoCoordinates;
    }

    class Engine {

        private boolean isReady;
        private int km;

        public void isReady(boolean isReady) {
            this.isReady = isReady;
        }

        public void setValues(boolean isReady, int km) {
            this.isReady = isReady;
            this.km = km;
        }

        public void info() {
            if(isReady)
                System.out.println("Двигатель исправен");
            else
                System.out.println("Нет, двигатель неисправен, он проехал уже " + km + " км");
        }
    }




}
