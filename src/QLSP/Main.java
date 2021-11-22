package QLSP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Controller controller = new Controller();

        while (true){
            System.out.println("1.Thêm Sản Phẩm");
            System.out.println("2.Sửa sản phẩm");
            System.out.println("3.Xóa Sản phẩm");
            System.out.println("4.Hiển Thị Sản Phẩm");
            System.out.println("5.Tìm Kiếm Sản Phẩm");
            System.out.println("6.Sắp Xếp Theo Giá Sản Phẩm");
            int number = sc.nextInt();

            switch (number){
                case 1:
                    controller.add();
                    break;
                case 2:
                    controller.edit();
                    break;
                case 3:
                    controller.delete();
                    break;
                case 4:
                    controller.disPlay();
                    break;
                case 5:
                    controller.find();
                    break;
                case 6:
                    controller.sort();
                    break;
                default:
                    System.out.println("Nhập từ 1-6");
            }
        }










    }
}
