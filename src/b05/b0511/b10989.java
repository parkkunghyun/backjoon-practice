package b05.b0511;

import java.io.*;
import java.util.ArrayList;

public class b10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 이분탐색?>
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];
        for(int i =0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int [] num = new int[10001];
        for(int i =0; i<n; i++) {
            num[arr[i]]++;
        }

        for(int i =0; i<num.length; i++) {
            if(num[i] >0) {
                for(int j =0; j<num[i]; j++) {
                    bw.write(i + "\n");
                }
            }
        }
        bw.flush();
        bw.close();

        br.close();
    }
}
