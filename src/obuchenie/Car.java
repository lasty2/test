package obuchenie;

public class Car extends Transport implements ILights{

    private boolean isOn;
    public Engine engine = new Engine();

    public Car() {}

    public Car(float speed, int weight, String color, byte[] coordinate) {
        super(speed, weight, color, coordinate);
    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Наш объект двигается со скоростью: " + speed);
    }

    @Override
    public boolean stopObject() {
        this.speed = 0;
        return true;
    }

    @Override
    public void setLight(boolean set) {
        this.isOn = set;
    }

    @Override
    public void blinkLight() {
        System.out.println("Мы моргаем фарами");
    }
}
