import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(main.place(arr));
    }
    public int place(int[] arr){
        int maxk = arr[0];
        int e = 0;
        for(int i = 0; i < arr.length; i++){
            if(maxk < arr[i]){
                maxk = arr[i];
                e = i;
            }
        }
        maxk = -1;
        for(int i = e + 1; i < arr.length - 1; i++){
            if(arr[i] % 10 == 5 && arr[i + 1] < arr[i] && maxk < arr[i]){
                maxk = arr[i];
            }
        }
        int count = 1;
         if(maxk != -1){
            for(int i = 0; i < arr.length; i++){
                if(arr[i] > maxk){
                    count++;
                }
            }
        }
         else{
             return 0;
         }
        return count;
    }
}