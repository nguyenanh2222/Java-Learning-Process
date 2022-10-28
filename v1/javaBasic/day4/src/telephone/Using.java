package telephone;

import java.util.Scanner;

public class Using {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Khai bao doi tuong
            PhoneCheck phoneCheck = new PhoneCheck();

            // Nhap du lieu
            System.out.print("Nhap vao chuoi so dien thoai: ");
            String str = sc.nextLine();

            // Kiem tra dinh dang
            try {
                phoneCheck.checkPhone(str);
            } catch (PhoneException ex) {
                System.out.println(ex.getMessage());
            }

            sc.close();
        }
    }

