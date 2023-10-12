package CJT;

public abstract class AircraftParent {
    public void engine() {
        System.out.println("Follow engine guidlines");
    }

    public void saftyGuidelines() {
        System.out.println("Follow safty guidelines");
    }

    public abstract void bodyColor();
}
