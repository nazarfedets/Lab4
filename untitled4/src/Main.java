public class Main {
    public static void main(String[] args) {
        int[] array1 = new int [10];
        int[] array2 = new int [10] ;

        for (int i = 0; i < 10; i++) {
            array1[i] = (int) Math.round(Math.random() * 10);

        }
        for (int i = 0; i < 10; i++) {
            array2[i] = (int) Math.round(Math.random() * 10);

        }

        System.out.println("Перший масив:");
        printArray(array1);
        System.out.println("Другий масив:");
        printArray(array2);

        int[] array3 = new int[10];


        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[i] + array2[i];
        }

        System.out.println("Третій масив (сума перших двох масивів):");
        printArray(array3);
    }


    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}