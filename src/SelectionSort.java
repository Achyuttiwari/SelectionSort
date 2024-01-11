import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int[] array = new int[scanner.nextInt()];
        System.out.println("Enter array value: ");
        for(int i = 0; i < array.length;i++){
            array[i] = scanner.nextInt();
        }
        int index = -1;
        for(int i = 0; i < array.length; i++){
            index = i;
            for(int j = i; j < array.length; j++){
                if(array[j] < array[index])   index = j;
            }
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
}