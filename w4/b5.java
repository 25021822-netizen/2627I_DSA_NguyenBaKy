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

class Resultb5 {

    public static void insertionSort2(int n, List<Integer> arr) {
        for(int i = 1; i < n; i++){
            int key = arr.get(i);
            for(int j = i-1; j >=0; j--){
                if(arr.get(j) > key){
                    arr.set(j+1, arr.get(j));
                    arr.set(j, key);

                }
            }
            for (int k = 0; k < n; k++) {
            System.out.print(arr.get(k) + (k == n - 1 ? "" : " "));
        }
        System.out.println();
        }

    }

}

public class b5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Resultb5.insertionSort2(n, arr);

        bufferedReader.close();
    }
}