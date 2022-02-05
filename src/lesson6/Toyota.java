package lesson6;

public class Toyota extends Car{


    private  int countDoor;


    public Toyota (String model, String color, int maxSpeed,
                   float acceleration, int countDoor, int countFuel){
        super(model, color, maxSpeed, acceleration, countFuel);
        this.countDoor = countDoor;

    }
    public void  voice(){
        System.out.println(model + "beep-beep");
    }

     public void goToCity(int distance){
        countFuel -= distance / 100 * 2;
        System.out.println(model + "Current fuel: " + countFuel);
     }


}
