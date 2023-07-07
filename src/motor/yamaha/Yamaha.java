package motor.yamaha;

import motor.Motor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Yamaha {
    static void menu(List<Motor> motors, int n) {
        do {
            System.out.println("=====Danh sách chức năng=====");
            System.out.println("1.Thêm thông tin");
            System.out.println("2.Hiển thị danh sách");
            System.out.println("3.Sắp xếp danh sách");
            System.out.println("4.Tìm kiếm thông tin");
            System.out.println("5.Thoát chương trình");
            System.out.println("CHọn menu");
            n = Integer.parseInt(new Scanner(System.in).nextLine());
            if (n == 5) {
                System.out.println("Kết thúc!");
            }
            handleMenu(motors, n);
        } while (n != 5);
    }
    static void handleMenu(List<Motor> motors, int n) {
        switch (n) {
            case 1:
                input(motors);
                break;
            case 2:
                display(motors);
                break;
            case 3:
                sort(motors);
                break;
            case 4:
                searchModel(motors);
                break;
            default:
                break;
        }
    }
    static void input(List<Motor> motors) {
        System.out.println("Nhap jupiter:");
        for (int i = 0; i < 2; i++) {
            Jupiter jupiter= new Jupiter();
            jupiter.inputInfor();
            motors.add(jupiter);

        }
        System.out.println("Nhap 3 truck:");
        for (int i = 0; i < 2; i++) {
            Serius serius=  new Serius();
            serius.inputInfor();
            motors.add(serius);

        }
    }

    static void display(List<Motor> motors) {
        for (int i = 0; i < motors.size(); i++) {
            motors.get(i).displayInfor();
//            List<Serius> listSerius = new ArrayList<>();
//            List<Jupiter> listJupiter = new ArrayList<>();
//            System.out.println("Danh sách thông tin Serius:");
//            for (Serius serius : listSerius) {
//                serius.displayInfor();
//            }
//            System.out.println("Danh sách thông tin Jupiter:");
//            for (Jupiter jupiter : listJupiter) {
//                jupiter.displayInfor();
//            }
        }
    }

    static void sort(List<Motor> motors) {
        System.out.println("Truoc sap xep:");
        motors.forEach(Motor::displayInfor);
        System.out.println("Sau sap xep:");
        motors.sort((o1, o2) -> (int) (o1.getCapacity() - o2.getCapacity()));
        motors.forEach(Motor::displayInfor);
    }

    static void searchModel(List<Motor> motors) {
        System.out.println("Nhap model can tim:");
        String model =new Scanner(System.in).nextLine();
        boolean flag = false;

        for (int i = 0; i < motors.size(); i++) {
            if (motors.get(i).getModel().equals(model)) {
                motors.get(i).displayInfor();
                flag = true;
            }
        }
        if (flag == false) System.out.println("Không tìm thấy");
    }

    public static void main(String[] args) {
        int n = 0;
        List<Motor> motors = new ArrayList<>();
        menu(motors, n);
    }
}