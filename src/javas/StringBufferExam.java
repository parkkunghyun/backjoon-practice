package javas;

public class StringBufferExam {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("world");

        String str = sb.toString();
        System.out.println(str);

        // method chaining-> 자기 자신을 리턴해서 자신의 메소드를 호출하는 방식
        String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
        System.out.println(str2);
    }
}
