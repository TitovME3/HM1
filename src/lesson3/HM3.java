package lesson3;

public class HM3 {
    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int arrll = arr.length;
        for (int i = 0; i < arrll; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        System.out.print("Answer 1 :");
        for (int i = 0; i < arrll; i++) {
            System.out.print(" " + arr[i]);
        }


        int[] array = new int[100];
        int j = 0;
        int fill = array.length;
        System.out.println(" ");
        System.out.println("*****");
        System.out.println("Answer 2:");
        for (int i = 0; i < fill; ++i, j = j + 1) {
            array[i] = j;
            System.out.print(+array[i] + " ");
            System.out.print(" ");
        }


        int[] array3 = {3, 5, 3, 2, 11, 4, 5, 3, 4, 8, 9, 1};
        int arr3 = array3.length;
        for (int i = 0; i < arr3; i++) {
            if (array3[i] < 6)
                array3[i] = array3[i] * 2;
        }
        System.out.println(" ");
        System.out.println("******");


        System.out.print("Answer 3:  ");
        for (int i = 0; i < arr3; i++) {
            System.out.print(+array3[i] + ", ");
        }
        int[][] sqArr = new int[10][10];
        System.out.println("");
        System.out.println("*******");
        System.out.println("Answer 4:");
        for (int i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {

                if (i < j) {
                    sqArr[i][j] = 0;
                } else if (i > j) {
                    sqArr[i][j] = 0;
                } else {
                    sqArr[i][j] = 1;
                }
                System.out.print(sqArr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("******");


        int[] returnArrayFromMethod = returnArray(10, 999);
        printArray1("Answer 5 :", returnArrayFromMethod);

    } public static void printArray1(String msg, int[] inputArray) {
        System.out.println(msg);
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }
    public static int[] returnArray(int len, int initValue) {
        int[] tempArray = new int[len];

        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = initValue;
        }
        return tempArray;
    }

}








