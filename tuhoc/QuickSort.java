import  java.util.*;
public class QuickSort {
    public int  partition(int[] a, int l, int r){
        int pivot = a[r];
        int i = l - 1;
        for(int j = l; j < r ; j ++){
            if(a[j] <= pivot){
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
    public void quickSort(int[]a, int l, int r){
        if(l<r){
            int pivot = partition(a, l, r);
            quickSort(a, l, pivot-1);
            quickSort(a, pivot+1, r);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        new QuickSort().quickSort(a, 0, n - 1);
        for(int x :a){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    
}
