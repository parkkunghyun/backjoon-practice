package javas.genericPractice;

public class BoxExam {
    public static void main(String[] args) {
        /*
        Box box = new Box();
        box.setObj(new Object());
        Object obj = box.getObj();
        box.setObj("hello");
        String s = (String) box.getObj();
        box.setObj(1);
        Integer in = (Integer) box.getObj();
*/
        // Generic으로 저것보다 편하게 가능!
        // Object로 받기 때문에 줄때도 obj여서 형변환 해줘야함!!

        Box<Object> box = new Box<>();
        box.setObj(new Object());

        Box<String> boxString = new Box<>();
        boxString.setObj("hello");
        String s1 = boxString.getObj();




    }
}
