import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> arr) {
        int temp = arr.get(n-1);
        for(int i = n-2 ; i > -1; i--){
            if(temp < arr.get(i)){
                arr.set(i+1, arr.get(i));
                for(int j = 0; j < n; j++){
                    System.out.print(arr.get(j) + " ");
                }
                System.out.println();
                if(i==0){
                arr.set(0, temp);
                for(int j = 0; j < n; j++){
                    System.out.print(arr.get(j) + " ");
                }
                System.out.println();
            }}
            
            else{
                arr.set(i+1, temp);
                for(int j = 0; j < n; j++){
                    System.out.print(arr.get(j) + " ");
                }
                System.out.println();
                break;

            }
        }

    }

}

public class b3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.insertionSort1(n, arr);

        bufferedReader.close();
    }
}