package CJT;

public class AircraftChild extends AircraftParent {
    public static void main(String[] args) {
        AircraftChild c = new AircraftChild();
        c.engine();
        c.saftyGuidelines();
        c.bodyColor();
    }

    @Override
    public void bodyColor() {
        System.out.println("Red color");
    }
}