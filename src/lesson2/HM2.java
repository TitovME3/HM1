package lesson2;


public class HM2 {
    public static void main(String[] args) {
        System.out.println("Результат задания - " + checkNumbers(25, 10));
        System.out.println("*********");

        isPositiveOrNegative(-15);
        System.out.println("*********");

        System.out.println("Результат задания - " + isPositive(-15));
        System.out.println("*********");

        printMethod("Moscow", 3);
        System.out.println("The end");
    }

    public static boolean checkNumbers(int a, int b) {
        int summ = a + b;
        return (summ <= 20) && (summ >= 10);
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
    public static boolean isPositive(int y){
        return y <= 0;
    }
    public static void printMethod (String city, int qantity) {
        for (int i = 1; i <= qantity; i ++) {
            System.out.println("City" + i + "-" + city);
        }
    }

}