package b05.b0518;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b1246 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N - M i번째 고객은 달걀 하나를 P이하로
        // p가 a보다 크거나 같은 고객은 달걀을 산다

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [] p = new int[M];
        for(int i =0; i< M; i++) {
            p[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(p);

        // 달걀의 가장 작은값부터 중간값까지 계산해봐야할듯?
        // 만약 달걀이 사람보다 적다면? ->

        br.close();

    }
}
