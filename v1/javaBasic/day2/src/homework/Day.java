package homework;


import java.util.Scanner;


public class Day {
    public boolean isLeapYear(int year) {
//        Năm nhuận là năm chia hết cho 400.
//        Năm nhuận là năm chia hết cho 4 nhưng không chia hết cho 100.
        return ((year % 4) == 0) && ((year % 100) != 0 || (year % 400) == 0);
    }

    public int lengthOfMonth(int year, int month) {
        return switch (month) {
            case 2 -> isLeapYear(year) ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
    }

    // Driver Code
    public static void main(String[] args)
    {
        int year;
        int month;

        System.out.print("Nhap nam: ");
        Scanner input_year = new Scanner(System.in);
        year = input_year.nextInt();

        System.out.print("Nhap thang: ");
        Scanner input_month = new Scanner(System.in);
        month = input_month.nextInt();

        Day currentTime = new Day();
        int day = currentTime.lengthOfMonth(year, month);
        System.out.print("So ngay trong thang: ");
        System.out.print(day);
    }
}