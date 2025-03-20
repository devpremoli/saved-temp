public class NoIocDI {

    public static void main(String[] args) {
        

    }


    
}


class Engine {

    private String fuelType;

    public Engine() {
        System.out.println("Engine instance created");
    }

    // Configuring the engine (setting the fuel type)
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
        System.out.println("Fuel type set to: " + fuelType);
    }

    // Method to initialize the Engine
    public void init() {
        System.out.println("Engine: Initialized");
    }

    // Method to destroy/cleanup the Engine
    public void destroy() {
        System.out.println("Engine: Destroyed");
    }

    public void start() {
        System.out.println("Engine started with fuel type: " + fuelType);
    }

    public void stop() {
        System.out.println("Engine stopped");
    }
}

class Car {
    private Engine engine;

    public Car() {
        engine = new Engine(); // Instantiating Engine Dependency
        engine.setFuelType(); // Configuring Enginer Dependency
        engine.init();  // Initializing the Engine dependency manually
    }

    public void shutDown() {
        engine.destroy(); // Manually destroying the Engine Dependency
    }

    public void drive() {
        engine.start();
        System.out.println("Car is driving");
    }

    public void stopCar() {
        engine.stop();
    }
}