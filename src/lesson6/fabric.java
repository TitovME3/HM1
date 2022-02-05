package lesson6;

public class fabric {
    public static void main (String[] args){
        Toyota toyota = new Toyota("Toyota", "White", 150, 1.5f, 4, 200);
        Mazda mazda = new Mazda("Mazda", "Black", 160, 1.6f, 300);
        Jeep jeep = new Jeep("Jeep", "Blue", 170, 1.7f, 5, 400, 700);

        toyota.move();
        mazda.goToCity(240);
        jeep.loading(450);
        toyota.refueling(150);

        toyota.passengers();
        mazda.passengers();
        jeep.passengers();
    }

}
