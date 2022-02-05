package lesson6;

public class Jeep extends Car{

    private  int countDoor;
    private  float maxCargo;
    private float currentCargo;

    public Jeep (String model, String color, int maxSpeed,
                   float acceleration, int countDoor, int countFuel, float maxCargo) {

        super(model, color, maxSpeed, acceleration, countFuel);
        this.countDoor = countDoor;
        this.maxCargo = maxCargo;
        this.currentCargo = 0;

    }
    public void  voice(){
        System.out.println(model + "beeeeeeeeeeeeeep");
    }

    public void goToCity(int distance){
        countFuel -= distance / 75 * 2;
        System.out.println(model + "Current fuel: " + countFuel);
    }
    public void loading(float countCargo){
        if (currentCargo + countCargo < maxCargo){
            currentCargo += countCargo;
            System.out.println("Cargo " + countCargo + " success");
        }else {
            System.out.println("Not enough cargo");
        }
    }



}
