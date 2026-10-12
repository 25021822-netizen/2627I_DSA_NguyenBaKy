import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {
    public static int[] Bubble(int n, int[] arr){
        for(int i = 0; i <n-1; i++){
            for(int j = 0; j<n-1; j++){
                if(arr[j+1] < arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]= temp;
                }
                System.out.println("Buoc " + (i + 1) + ": " + Arrays.toString(arr));
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        Bubble(n, arr);
        sc.close();
        
    
    }
}
