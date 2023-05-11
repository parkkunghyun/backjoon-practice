package javas;

public class WrapperExam {
    public static void main(String[] args) {
        int i =5;
        // Integer i3 = 5; 처럼
        // 기본타입이 객체 타입의 데이터로 형변환 -> 오토박싱

        //Integer i2 = new Integer(5);
        Integer i3 = 5;
        int i4 = i3;
        System.out.println(i4);
    }
}
