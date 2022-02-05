package lesson6;

public abstract class Car {

    protected String model;
    protected String color;
    protected int maxSpeed;
    protected float acceleration;
    protected int countFuel;

    public  Car(String model, String color, int maxSpeed, float acceleration, int countFuel){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.countFuel = countFuel;
    }
    public void move() {
        System.out.println(model + "has moved with speed" + maxSpeed);
    }
    public void refueling(int count){
        countFuel += count;
        System.out.println("Refueling :" + count + " 1. Current fuel : " + countFuel);
    }
    public void passengers(){
        System.out.println(model + " transport passengers");
    }
    public abstract void voice();


}
