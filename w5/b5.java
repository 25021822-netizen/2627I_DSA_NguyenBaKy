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
    

    public static List<Integer> quickSort1(List<Integer> arr) {
        int pivot = arr.get(0);
        List<Integer> a1 = new ArrayList<>(); 
        List<Integer> a2 = new ArrayList<>();
        List<Integer> a3 = new ArrayList<>();
        for(int j = 0; j < arr.size(); j++){
            if(arr.get(j) < pivot){
                a1.add(arr.get(j));
            }
            if(arr.get(j) > pivot){
                a3.add(arr.get(j));
            }
            if(arr.get(j) == pivot){
                a2.add(arr.get(j));
            }
        }
        List<Integer> result = new ArrayList<>();

        result.addAll(a1);
        result.addAll(a2);
        result.addAll(a3);

        return result;
    }

}

public class b5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.quickSort1(arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}