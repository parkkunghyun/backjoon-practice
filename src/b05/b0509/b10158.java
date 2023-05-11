package b05.b0509;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        int currentW = Integer.parseInt(st.nextToken());
        int currentH = Integer.parseInt(st.nextToken());

        int t =Integer.parseInt(br.readLine());

        int xCnt = (currentW + t) / w;
        int yCnt = (currentH + t) / h;
        int p,q;

        if(xCnt %2 ==0) {
            p = (currentW+t) % w;
        }else{
            p = w - ((currentW+t) % w);
        }
        if(yCnt %2 ==0) {
            q = (currentH+t) % h;
        }

        // 4 6 , 9
        // 13 % 6 -> 1
        System.out.println(p);



        br.close();
    }
}
