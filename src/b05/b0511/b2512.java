package b05.b0511;

import java.io.*;
import java.util.StringTokenizer;

public class b2512 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n =Integer.parseInt(br.readLine());
        int [] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int left= 0;
        int right= -1;

        for(int i =0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            right = Math.max(right, arr[i]);
        }
        int m = Integer.parseInt(br.readLine());

        while(left <= right) {
            int mid = (left + right) / 2;
            long budget = 0;

            for(int i=0; i<n; i++) {
                if(mid < arr[i]) budget += mid;
                else {
                    budget += arr[i];
                }
            }

            if(budget <= m) {
                left = mid+1;
            }else {
                right = mid -1;
            }
        }
        bw.write(right + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
