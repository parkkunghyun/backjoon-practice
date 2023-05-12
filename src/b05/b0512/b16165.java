package b05.b0512;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class b16165 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // N 0-100 /
        // 팀이름 걸그룹인원수 멤버이름, 중복 없음
        // M개의 퀴즈 -0> 0이면 팀이름  1이면 멤버이름
        // 0이면 멤버이름 사전순 출력
        // 1인경우 해당멤바가 속한 팀의 이름을 출력!

        // 여러개의 맵이나 set을 만들어서 빠르게 찾아서 답 주기!
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 2차원 배열 느낌으로 만들기? 팀: 멤버1,멤버2 등 이렇게
        String [][] arr = new String[N][];

        for(int i =0; i<N; i++) {
            String team =  br.readLine();
            int teamNumber = Integer.parseInt(br.readLine());

            arr[i] = new String[teamNumber+1];
            arr[i][0] = team;
            for (int j =1; j<teamNumber+1; j++) {
                arr[i][j] = br.readLine();
            }

        }

        for(int i =0; i<M; i++) {
            String question = br.readLine();
            int oneZero = Integer.parseInt(br.readLine());
            if(oneZero == 1) {
                //1 일때는 이 멤버 들어간 팀이름 출력!
                for(int j =0; j<arr.length; j++) {
                    for(int z = 0; z< arr[j].length; z++) {
                        if(arr[j][z].equals(question)) {
                            System.out.println(arr[j][0]);
                            break;
                        }
                    }
                }

            }else {
                // 0 일때는 멤버이름 사전순 출력!
                // team이름 찾아보기!
                List<String> list = new ArrayList<>();
                for(int j =0; j<N; j++) {
                    if(arr[j][0].equals(question)) {
                        for(int z = 1; z<arr[j].length; z++) {
                            list.add(arr[j][z]);
                        }
                    }
                }
                list.sort((o1,o2) -> {
                    return o1.compareTo(o2);
                });
                for (int j =0; j< list.size(); j++) {
                    System.out.println(list.get(j));
                }

            }
        }


        br.close();;
        bw.flush();
        bw.close();
    }
}
