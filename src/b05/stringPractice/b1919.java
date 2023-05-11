package b05.stringPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class b1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 서로 겹치는거 제외! set인가?
        String first = br.readLine();
        String second = br.readLine();
        int result = 0;

        int [] f = new int[26];
        int [] l = new int[26];

        for(int i =0; i<first.length(); i++) {
            f[first.charAt(i)-'a']++;
        }

        for(int i =0; i<second.length(); i++) {
            l[second.charAt(i)-'a']++;
        }


        for(int i =0; i<26; i++) {
            result += Math.abs(f[i]-l[i]);
        }
        System.out.println(result);

        br.close();
    }
}
