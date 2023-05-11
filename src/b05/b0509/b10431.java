package b05.b0509;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b10431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int P = Integer.parseInt(br.readLine());

        for(int k = 0; k<P; k++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int tNumber = Integer.parseInt(st.nextToken());
            ArrayList<Integer> arrayList = new ArrayList<>();
            int move= 0;
            for (int i =0; i<20; i++) {
                Integer student = Integer.parseInt(st.nextToken());
                arrayList.add(student);
            }
            for (int i =0; i< arrayList.size(); i++) {
                for(int j = 0; j<i; j++) {
                    if (arrayList.get(j) > arrayList.get(i)) {
                        move++;
                    }
                }
            }

            System.out.println(tNumber + " " + move);
        }


        br.close();
    }
}
