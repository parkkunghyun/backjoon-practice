package b05.b0518;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class b1972 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String [] line = br.readLine().split("");
            if(line.length == 1 && line[0].equals("*")) {
                break;
            }

            if(line.length <=2) {
                String l = "";
                for(int i =0; i< line.length; i++) {
                    l += line[i];
                }
                System.out.println(l + " is surprising.");
                continue;
            }

            boolean isFlag = false;
            int D = line.length-2;
            ArrayList<String> words = new ArrayList<>();

            for(int i =1; i<=D; i++) {
                isFlag = false;
                for(int j =0; j<line.length; j++) {
                    int index = i+j;
                    if(index >= line.length) {
                        break;
                    }
                    else{
                        String word =line[j] + line[index];
                        if(!words.isEmpty() && words.contains(word)) {
                            isFlag = true;
                            break;
                        }else {
                            words.add(word);
                        }
                    }
                }
                if(isFlag == true) {
                    String l = "";
                    for(int k =0; k< line.length; k++) {
                        l += line[k];
                    }
                    System.out.println(l + " is NOT surprising.");
                    break;
                }
                words.clear();
            }

            if(isFlag==false) {
                String l = "";
                for(int i =0; i< line.length; i++) {
                    l += line[i];
                }
                System.out.println(l + " is surprising.");
            }

        }
        br.close();

    }
}
