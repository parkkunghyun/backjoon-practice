package b05.b0512;

import java.io.*;
import java.util.*;

public class b23757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //박스에 들어가는 선물들
        PriorityQueue<Integer> boxes = new PriorityQueue<>();
        st = new StringTokenizer(br.readLine()," ");
        for(int i =0; i<N; i++) {
            int present = Integer.parseInt(st.nextToken());
            boxes.add(-present);
        }

        // 각 학생이 원하는 선물 수
        st = new StringTokenizer(br.readLine()," ");
        List<Integer> list = new ArrayList<>();
        for(int i =0; i<M; i++) {
            int present = Integer.parseInt(st.nextToken());
            list.add(present);
        }

        Collections.sort(list, Comparator.reverseOrder());

        int i =0;
        while (true) {
            if(i == list.size()) {
                System.out.println(1);
                break;
            }
            int p = list.get(i);
            int pbox = -boxes.poll();

            if(p > pbox) {
                System.out.println(0);
                break;
            }

            pbox -= p;
            boxes.add(-pbox);
            i +=1;
        }

        br.close();;
        bw.flush();
        bw.close();
    }
}
