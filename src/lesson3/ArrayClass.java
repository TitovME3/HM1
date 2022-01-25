package lesson3;


import java.util.Random;
import java.util.Scanner;

public class ArrayClass {

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();


    public static void main(String[] args) {

        int[] myArrayInt = new int[5];
        myArrayInt[0] = 6;
        myArrayInt[1] = 10;
        myArrayInt[3] = 12;
        myArrayInt[2] = 5;

        System.out.println("myArrayInt[5]");

        String [] myArrayString = new String[500];
        for (int i = 0; i < myArrayString.length; i++){
            myArrayString[i] = "String" + (i + 1);
        }
        System.out.println(myArrayString[333]);




        for (int i = 0; i < 10; i++)
        randomAnyValue(-10,5);

        for (int i = 0; i < 10; i++) {

            System.out.println(random.nextInt());
            System.out.println(random.nextInt(50));
            System.out.println(random.nextFloat());
            System.out.println(random.nextDouble());
        }

        String abc = studyScannerString("Enter your name", "Welcome");
        System.out.println(abc);
        System.out.println("*************");

        System.out.println(studyScannerString("Enter your phone", "Your phone is"));
        System.out.println("*************");
        studyScannerNumberint();
    }


        public static String studyScannerString (String systemMsg, String welcomeMsg){
            System.out.print(systemMsg + " - ");
            return welcomeMsg + " " + scanner.next();

        }
        public static void studyScannerNumberint () {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(a + b);
        }
        public static void randomAnyValue(int min, int max){
        if (max > min) {
            int value = max - min;
            System.out.println((min + random.nextInt(value + 1)));
        }else {
            System.out.println("Incorrect data");
        }
        }
    }


