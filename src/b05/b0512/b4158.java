package b05.b0512;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class b4158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // CD수 N, M 100만, 숫자는 10억 미만

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            if (N == 0 && M==0) {
                break;
            }

            // 아니면 맵으로 해서 이 키가 있는지 확인?
            Map<Long,Integer> arr = new HashMap<>();
            for(int i =0; i<N; i++) {
                long cd = Long.parseLong(br.readLine());
                arr.put(cd,1);
            }

            int result = 0;

            for(int i =0; i<M; i++) {
                long findCD= Long.parseLong(br.readLine());
                if(arr.containsKey(findCD)) {
                    result++;
                }
            }
            System.out.println(result);
        }

        br.close();;
        bw.flush();
        bw.close();
    }
}
