import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        
        System.out.println(sum);
    }
}