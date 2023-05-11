package javas.part3;

import javas.part3.model.CarDTO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        // Q. 자동차 정보 키보드로 입력받아서 다른 메소도로 이동!
        Scanner sc = new Scanner(System.in);
        // scanner가 유틸리티 즉 자바가 미리 만든 필요할때 도와주는 클래스!
        // keybord 장치를 연결할때 -> System.in임!
        System.out.print("자동차 일련 번호: ");
        int carSn = sc.nextInt();

        sc.nextLine(); // enter가 남아있어서 버퍼를 비우는 법!

        System.out.print("자동차 이름: ");
        String carName = sc.nextLine();

        System.out.print("자동차 기간: ");
        int carPrice = sc.nextInt();

        sc.nextLine(); // enter가 남아있어서 버퍼를 비우는 법!

        System.out.print("자동차 년식: ");
        int carYear = sc.nextInt();

        sc.nextLine();

        System.out.print("자동차 타입: ");
        String carType = sc.nextLine();

        System.out.println(carSn+"\t" + carName + "\t" + carPrice);

        CarDTO carDTO = new CarDTO();
        carDTO.carSn = carSn;
        carDTO.carOwner = carName;
        carDTO.carPrice = carPrice;

    }
}
