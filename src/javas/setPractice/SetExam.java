package javas.setPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("sss");
        set1.add("dds");

        Iterator<String> iter = set1.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            System.out.println(str);
        }

    }
}
