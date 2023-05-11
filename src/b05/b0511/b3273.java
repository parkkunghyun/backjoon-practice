package b05.b0511;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int [] arr= new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int x = Integer.parseInt(br.readLine());

        // 정렬하고 맨 처음부터 꺼내서 각각을 맨 뒤에부터 돌리기! -> x보다 작아지면 stop
        //
        Arrays.sort(arr);
        int left = 0;
        int right = 0;

        int result = 0;

        for(int i =0; i<n-1; i++) {
            for(int j = n-1; j >i; j--) {
                if(arr[j] + arr[i] < x) {
                    // 더 낮아지면 나오기$
                    break;
                }
                if(arr[j] + arr[i] == x) {
                    result+=1;
                    break;
                }
            }
        }
        bw.write(result + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
