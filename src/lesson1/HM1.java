package lesson1;

public class HM1 {
        public static void main(String[] args) {
            printThreeWorlds();
            checkSumSign();
            printColor();
            compareNumbers();
        }

        public static void printThreeWorlds() {
            System.out.println("**************");
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }
        public static void checkSumSign() {
            System.out.println("**************");
            int a = 10;
            int b = -20;
            int summ = (a + b);
            if (a + b >= 0){
                System.out.println("����� �������������");
            }else {
                System.out.println("����� �������������");
            }
        }
        public static void printColor() {
            System.out.println("***************");
            int value = -100;
            if (value <= 0) {
                System.out.println("�������");
            } else if (value >= 0 && value <= 100) {
                System.out.println("������");
            } else {
                System.out.println("�������");
            }

        }
        public static void compareNumbers(){
            System.out.println("*************");
            int a = 10;
            int b = 20;
            if (a >= b){
                System.out.println (" a >= b");
            }
            else {
                System.out.println ("a < b");
            }
            System.out.println(" Thank you");

        }
    }


