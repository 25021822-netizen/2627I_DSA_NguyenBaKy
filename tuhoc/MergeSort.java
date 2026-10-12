import java.util.*;
public class MergeSort {
    public static void mergeSort(int[] A,int  l, int r){
        if(l >= r){
            return;
        }
        int m = (l+r)/2;
        mergeSort(A, l, m);
        mergeSort(A, m+1, r);
        merge(A,l,m,r);

    }
    public static void merge(int[] A, int l, int m, int r){
        int n1 = m - l +1;
        int n2 = r - m;
        
        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i = 0; i < n1 ; i++){
            L[i] = A[l+i];
        }
        for(int i = 0; i <n2; i++){
            R[i] = A[m+i+1];
        }

        int i = 0, j = 0;
        while(i < n1 && j < n2){
            if(L[i] < R[j]){
                A[l] = L[i];
                ++l;
                ++i;
            }
            else{
                A[l] = R[j];
                ++l;
                ++j;

            }
        }
        while(i < n1 ){
            A[l] = L[i];
            l++;
            i++;
        }
        while(j < n2 ){
            A[l] = R[j];
            l++;
            j++;
        }
 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i <n; i++){
            arr[i] = sc.nextInt();

        }
        mergeSort(arr, 0, n-1);
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();

    }
    
}
