package b05.b0509;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1236 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        String [][] c = new String[h][w];

        for(int i =0; i< h; i++) {
            String [] s = br.readLine().split("");
            for(int j =0; j<w; j++) {
                c[i][j] = s[j];
            }
        }

        int maxw = 0;
        int maxh = 0;

        for(int i =0; i< h; i++) {
            boolean isEx = false;
            for(int j =0; j<w; j++) {
                if(c[i][j].equals("X")) {
                    isEx = true;
                    break;
                }
            }
            if(isEx ) {
                maxw+=1;
            }
        }

        for(int i =0; i< w; i++) {
            boolean isEx = false;
            for(int j =0; j<h; j++) {
                if(c[j][i].equals("X")) {
                    isEx = true;
                    break;
                }
            }
            if(isEx) {
                maxh+=1;
            }
        }

        if (maxw < maxh) {
            System.out.println(h - maxw);
        }else {
            System.out.println(w - maxh);
        }



        br.close();
    }
}
