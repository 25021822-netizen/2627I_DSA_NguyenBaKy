package w3;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String text) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if(c == '('|| c == '{'|| c == '['){
                st.push(c);
            }
            else{
                if (st.isEmpty()){
                    return "NO";
                }
                if(c == ')' && st.peek() == '('){
                    st.pop();
                } else if(c == ']' && st.peek() == '['){
                    st.pop();

                }else if(c == '}' && st.peek() == '{') {
                    st.pop();
                }
                else return "NO";
            }
        }
        if(st.isEmpty()){
            return "YES";
        }
        return "NO";
    }

}

public class  b2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.isBalanced(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}