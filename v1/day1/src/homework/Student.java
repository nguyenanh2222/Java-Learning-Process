//Bài 1
//        Nhập và hiển thị thông tin cá nhân từ bàn phím bao gồm:
//         Nhập họ và tên:
//         Nhập ngày tháng năm sinh
//         Nhập quê quán:
//         Nhập trường học
//        a) In ra màn hình:
//        Xin chào {họ và tên} đến từ {quê quán}, sinh ngày {ngày tháng năm sinh}, học tại
//        trường {trường học}
//        b) Build file sang dạng .class và chạy bằng command line java
package homework;
import java.util.Scanner;

public class Student {
    public String name;
    public String DOB;
    public String address;
    public String school;

    public void input_info() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        this.name = input.nextLine();
        System.out.println("Nhập ngày tháng năm sinh: ");
        this.DOB = input.nextLine();
        System.out.println("Nhập quê quán: ");
        this.address = input.nextLine();
        System.out.println("Nhập trường học: ");
        this.school = input.nextLine();
    }

    public String get_info() {
        return "Xin chào " + this.name + "đến từ " + this.address + ", sinh ngày " + this.DOB + ", học tại trường " + this.school;
    }

        public static void main(String[] args) {
            Student student = new Student();
            student.input_info();
            System.out.println(student.get_info());
        }
    }

