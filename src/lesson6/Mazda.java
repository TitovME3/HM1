package lesson6;

public class Mazda extends Car {



    public Mazda (String model, String color, int maxSpeed,
                  float acceleration, int countFuel) {

        super(model, color, maxSpeed, acceleration, countFuel);

    }
    @Override
    public void  voice(){
        System.out.println(model + "beep-beep-beep");
    }

    public void goToCity(int distance){
        countFuel -= distance / 50 * 2;
        System.out.println(model + " Current fuel: " + countFuel);
    }

}
