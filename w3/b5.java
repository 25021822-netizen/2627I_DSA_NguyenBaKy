package w3;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Results {

    /*
     * Complete the 'equalStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h1
     *  2. INTEGER_ARRAY h2
     *  3. INTEGER_ARRAY h3
     */

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        int tong1 = 0, tong2 =0, tong3=0;
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();
        for (int i = h1.size() - 1; i >= 0; i--) {
            tong1 += h1.get(i);
            st1.push(h1.get(i));
        }
        for (int i = h2.size() - 1; i >= 0; i--) {
            tong2 += h2.get(i);
            st2.push(h2.get(i));
        }
        for (int i = h3.size() - 1; i >= 0; i--) {
            tong3 += h3.get(i);
            st3.push(h3.get(i));
        }
        while(true){
            if(tong1 == tong2 && tong2 == tong3){
                return tong1;
            }
            if(tong1 >= tong2 && tong1 >= tong3){
                tong1 -= st1.pop();
            } else if (tong2 >= tong1 && tong2 >= tong3) {
                tong2 -= st2.pop();
            } else {
                tong3 -= st3.pop();
            }
        }

    }

}

public class b5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n1 = Integer.parseInt(firstMultipleInput[0]);

        int n2 = Integer.parseInt(firstMultipleInput[1]);

        int n3 = Integer.parseInt(firstMultipleInput[2]);

        List<Integer> h1 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> h2 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> h3 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Results.equalStacks(h1, h2, h3);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}