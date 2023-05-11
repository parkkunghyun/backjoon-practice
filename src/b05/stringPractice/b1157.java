package b05.stringPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 일단 대문자 소문자로 바꾸자!
        int [] alpha = new int[26];

        String word = br.readLine();
        for(int i =0; i<word.length(); i++){
            if('A' <= word.charAt(i) && word.charAt(i)<='Z') {
                alpha[(int)(word.charAt(i)-'A')]++;
            }else{
                alpha[(int)(word.charAt(i)-'a')]++;
            }
        }

        Arrays.sort(alpha);
        if(alpha[alpha.length-1] == alpha[alpha.length-2]) {
            System.out.println("?");
        }else{
            System.out.println((char) (alpha[alpha.length-1] + 'A'));
        }

        br.close();
    }
}
