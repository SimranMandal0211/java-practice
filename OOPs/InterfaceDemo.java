interface Vehicle{
    void start();
    void stop();
}

class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("Car starts with a key ignition");
    }

    @Override
    public void stop(){
        System.out.println("Car stop with hydraulic brakes");
    }
}

class Bike implements Vehicle{
    @Override 
    public void start(){
        System.out.println("Bike start with self-start or kick");

    }

    @Override 
    public void stop(){
        System.out.println("Bike stops with disc breakes");
    }
}
public class InterfaceDemo {
    public static void main(String args[]){
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v1.stop();

        v2.start();
        v2.stop();
    }
}
