package b05.stringPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String words = br.readLine();
        StringBuilder result = new StringBuilder();

        for(int i =0; i<words.length(); i++) {
            if('A'<= words.charAt(i) && words.charAt(i) <= 'Z' ) {
                char a = (char) (words.charAt(i) - 65 + 97);
                result.append(a);
            }else {
                char a = (char) (words.charAt(i) + 65 - 97);
                result.append(a);
            }
        }
        System.out.println( result.toString());

        br.close();

    }
}
