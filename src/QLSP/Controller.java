package QLSP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Controller implements IManage {
    Scanner sc = new Scanner(System.in);
    ArrayList<Product> list = new ArrayList<>();


    @Override
    public void disPlay() {
        for (Product pro: list) {
            System.out.println(pro.toString());
        }
    }

    public Product creat() {
        System.out.println("Nhập Tên Sản Phẩm");
        String name = sc.next();
        System.out.println("Nhập Giá Tiền");
        int cost = sc.nextInt();

        Product product = new Product(cost,name);
        return product;

    }

    @Override
    public void add() {
        Product product = creat();
        list.add(product);
    }

    @Override
    public void delete() {
        int index = find();
        if (index == -1){
            return;
        }
        list.remove(index);
    }

    @Override
    public void edit() {
        int index = find();
        if (index == -1){
            return;
        }
        list.set(index,creat());
    }

    @Override
    public int find() {
        System.out.println("Nhập id ");
        String name = sc.next();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)){
                return i;
            }
        }
        System.out.println("Không tìm thấy sản phẩm");
        return -1;
    }

    @Override
    public void sort() {
        Collections.sort(list, new CostComparator());
    }

}
