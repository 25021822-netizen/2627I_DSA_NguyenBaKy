import java.io.*;
import java.util.*;

public class b6 {
    public static int partition(int[]  a, int l, int r){
        int pivot = a[r];
        int i = l-1;
        for(int j = l; j < r; j++){
            if(a[j] < pivot){
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        i++;
        a[r] =a[i];
        a[i] = pivot;
        return i;
    }
    public void print(int[] a){
        for(int x : a){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public void quickSort(int[] a, int l, int r){
        if(l< r){
            int p = partition(a, l, r);
            print(a);
            quickSort(a, l, p-1);
            quickSort(a, p+1, r);
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++){
            a[i]= sc.nextInt();
            
        }
        b6 acc = new b6();
        acc.quickSort(a, 0, n-1);

    }
}