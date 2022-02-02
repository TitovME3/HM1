package lesson5.less5;

public class Gamer {

    private String name;
    private int age;
    private float speed;
    private String color;

    Coordinate coordinate = new Coordinate();
//    Weapon weapon = new Weapon();

    public Gamer(){
        System.out.println("Hello i'm constructor");
        run();

    }
    public Gamer(String data){
        System.out.println("Your data is" + data);
    }

    public Gamer (String name, int age,float speed, String color){
        this.name = name;
        this.age = age;
        this.speed = speed;
        this.color = color;
    }

    int xFromGamerClass;
    int yFromGamerClass;

     void  run(){
         System.out.println(name + " run ...");
         speak();
     }
     void speak(){
         System.out.println(name + " speak");
     }
     void welcome(String nameOpponent){
         System.out.println("Hello " + nameOpponent);
     }
     int getSum(int a, int b){
         return a + b;
     }
     // Getter
     public int getAge(){
         return age;
     }
     //Setter
     public String getName(){
         return name;
     }
     public void setColor(String name){
        this.name = name;
     }

     public class Weapon {
         int damage;
         String color;
         Bullet bullet = new Bullet();


         void fire(){
             System.out.println("This weapon get fire");
         }
         public class Bullet {
             int speed;

         }
     }

}
