package CJT;

public class UsaTraffic implements CentralTraffic {

    @Override
    public void go() {
        System.out.println("Going");
        // throw new UnsupportedOperationException("Unimplemented method 'go'");
    }
    
    @Override
    public void stop() {
        System.out.println("Stoping");
        // throw new UnsupportedOperationException("Unimplemented method 'stop'");
    }
    
    @Override
    public void yield() {
        System.out.println("Yielding");
        // throw new UnsupportedOperationException("Unimplemented method 'yield'");
    }

    public void walking() {
        System.out.println("I am walking");
    }
    
}
