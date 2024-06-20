package Week1.Tutorial;

public abstract class Vehicle {
    private double maxSpeed;
    protected double currentSpeed;

    public Vehicle(double maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public abstract void accelerate();

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public double getMaxSpeed(){
        return maxSpeed;
    }

    public void pedalToTheMetal() {
        while (currentSpeed < maxSpeed) {
            accelerate();
        }
    }
}

class Car extends Vehicle {
    // Constructor
    public Car(double maxSp) {
        super(maxSp);
    }

    // Implementation of the abstract method accelerate
    @Override
    public void accelerate() {
        currentSpeed += 10; // Just a simple acceleration logic for demonstration
    }
}

class Main {
    public static void main(String[] args) {
        Car car = new Car(200.0); // Creating an instance of Car
        System.out.println("Max Speed: " + car.getMaxSpeed());
        car.pedalToTheMetal();
        System.out.println("Current Speed: " + car.getCurrentSpeed());
    }
}
