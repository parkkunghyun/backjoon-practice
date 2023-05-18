package b05.b0515;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

public class b2961 {

    // 백트래킹
    //
    static int [][] materials;
    static boolean [] visited;
    static int res = Integer.MAX_VALUE;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        materials = new int[N][2];
        visited = new boolean[N];
        StringTokenizer st;
        for(int i =0; i< N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            materials[i][0] = Integer.parseInt(st.nextToken());
            materials[i][1] = Integer.parseInt(st.nextToken());
        }

        makingFood(0);
        System.out.println(res);
        br.close();
    }
    public static void makingFood(int cnt) {
        if(cnt == N) {
            int sour = 1;
            int bitter = 0;
            boolean isFlag= false;
            for(int i =0; i<N; i++) {
                if(visited[i]) {
                    isFlag = true;
                    sour *= materials[i][0];
                    bitter += materials[i][1];
                }
            }
            if(isFlag ==false) return;
            if(res > Math.abs(sour -bitter)) {
                res = Math.abs(sour -bitter);
                return;
            }
            return;
        }
        visited[cnt] = true;
        makingFood(cnt+1);
        visited[cnt] = false;
        makingFood(cnt+1);
    }


}
