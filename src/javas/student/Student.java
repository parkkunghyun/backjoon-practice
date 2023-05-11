package javas.student;

public class Student {
    String name;
    String number;
    int birthYear;

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return  false;
        }
        if(getClass() != obj.getClass()) {
            // class의 정보 즉 둘의 클래스가 다르면 의미 없으니까!!
            return false;
        }
        Student other = (Student) obj;
        if(number == null) {
            if(other.number != null) {
                return false;
            }
        } else if(!number.equals(other.number)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        // 일종의 수학식!
        // number 자체의 숫자는 같아서!! 해쉬도 같아진다!!
        final int prime = 3;
        int result =1;
        result = prime * result + ((number == null) ? 0: this.getClass().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Student [name="+ name + ", number="+number;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "홍";
        s1.number = "1234";
        s1.birthYear = 1995;

        Student s2 = new Student();
        s2.name = "홍";
        s2.number = "1234";
        s2.birthYear = 1995;

        if(s1.equals(s2)) {
            System.out.println("s1과 s2가 값이 같다!");
        }
        else{
            System.out.println("s1과 s2가 다르다!");
        }

        // equals와 hashcode를 object꺼를 사용중이다!
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1.toString());
    }
}
