package b05.b0515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2669 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        // 일단 구하고 겹치는 부분 빼주는 방식으로 해보자!
        // 배열로 놔두기?
        int [][] arr = new int[101][101];

        for(int i =0; i<4; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int underX = Integer.parseInt(st.nextToken());
            int underY = Integer.parseInt(st.nextToken());
            int topX = Integer.parseInt(st.nextToken());
            int topY = Integer.parseInt(st.nextToken());

            for(int j =underY; j<topY; j++) {
                for(int k = underX; k<topX; k++) {
                    if(arr[j][k] ==0) {
                        arr[j][k] = 1;
                    }
                }
            }
        }
        int sum =0;

        for(int i =0; i<101; i++) {
            for(int j = 0; j<101; j++) {
                if(arr[i][j] == 1) {
                    sum+=1;
                }
            }
        }
        System.out.println(sum);
        br.close();
    }
}
