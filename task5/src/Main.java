
public class Main {
    public static void main(String[] args) {
        int parni = 0;

        int[] array = new int[15];
        for (int i = 0; i < 15; i++) {
            array[i] = (int) Math.round(Math.random() * 10);
            if(array[i] % 2 == 0){
                parni++;
            }
        }



        System.out.println("Масив:");
        printArray(array);



        System.out.println("Кількість парних елементів у масиві: " + parni );
    }


    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }



}