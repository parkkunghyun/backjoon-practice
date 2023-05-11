package b05.stringPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 앞에서 부터 이게 등장하면 등장까지 전부 없애기?d
        String line = br.readLine();
        String word = br.readLine();

        int answer = 0;
        int i =0;
        String result;

        while(true) {
            if(i==line.length()) {
                System.out.println(answer);
                break;
            }

            result = "";
            int j = 0;
            for(j=i; j<i + word.length(); j++) {
                if( j >= line.length()) {
                    break;
                }
                result += line.charAt(j);
                // a b a b a b a b a
                //
            }

            //System.out.println("result :" + result + " - j -> " +j);

            if(result.equals(word)) {
                answer+=1;
                i = j;
            }

            else {
                i+=1;
            }
        }

        br.close();
    }
}
