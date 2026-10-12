import java.util.*;
public class SelectionSort {
    public static  int[] Selection(int n, int[] arr){
        for(int i = 0; i < n ; i++){
            int min = arr[i];
            int id = i;
            for(int j = i +1; j < n ;j++){
                if(min > arr[j]){
                    id = j;
                    min = arr[j];

                }
                
            }
            arr[id] = arr[i]; 
            arr[i] = min;
            System.out.println("Bước " + (i + 1) + ": " + Arrays.toString(arr));
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
        Selection(n, arr);
        sc.close();
        
    }
    
}
