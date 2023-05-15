package b05.b0515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class b11508 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i =0; i<N; i++) {
            queue.add(-Integer.parseInt(br.readLine()));
        }

        long res = 0;
        int cnt = 0;

        // 6 5 5 5 5 4
        for(int i =0; i<N; i++) {
            //System.out.println("res is " + res);
            int item = -queue.poll();
            cnt +=1;
            if(cnt == 3) {
                cnt = 0;
                continue;
            }
            res += item;
        }
        System.out.println(res);


        br.close();
    }
}
