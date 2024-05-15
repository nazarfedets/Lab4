public class Main {
    public static void main(String[] args) {
        int[] masuv = new int[20];


        for (int i = 0; i < masuv.length; i++) {
            masuv[i] = i % 10;
        }


        System.out.println("Початковий масив:");
        printArray(masuv);


        for (int i = 1; i < masuv.length; i += 2) {
            masuv[i] = 0;
        }


        System.out.println("Оновлений масив:");
        printArray(masuv);
    }


    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}