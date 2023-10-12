package CJT;

public class Variables {
    String name;
    String address;
    static String city = "Loomis";

    public Variables (String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address + ", " + city;
    }

    public static void showStatic() {
        System.out.println("Static method can only use static variables and are called by class name not new obj");
    }

    public static void main(String[] args) {
        Variables vars = new Variables("Dan", "101 Street");
        Variables vars1 = new Variables("Alisa", "222 Street");

        System.out.println(vars.getAddress());
        Variables.city = "new city";
        System.out.println(vars1.getAddress());
        Variables.showStatic();
    }
    
}
