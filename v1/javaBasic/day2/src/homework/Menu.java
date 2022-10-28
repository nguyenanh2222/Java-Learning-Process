package homework;

import java.util.Scanner;


public class Menu {
    public Integer idx;

    public void getMenu() {
        boolean flag_menu_parent;
        flag_menu_parent = Boolean.TRUE;

        while (flag_menu_parent == Boolean.TRUE) {
            System.out.println("=== Welcome ===");
            System.out.println("=== please choosing index to see contents ===");
            System.out.println("1. Equation");
            System.out.println("2. Quadratic");
            System.out.println("3. Electricity Bill");
            System.out.println("4. Exit");

            Scanner input = new Scanner(System.in);
            this.idx = input.nextInt();

            switch (idx) {
                case 1 -> {
                    Equation equation = new Equation();
                    equation.calculation();
                }
                case 2 -> {
                    Quadratic quadratic = new Quadratic();
                    quadratic.calculation();
                }
                case 3 -> {
                    boolean flag_menu_child;
                    flag_menu_child = Boolean.TRUE;
                    while (flag_menu_child == Boolean.TRUE) {
                        System.out.println("=== There are 2 ways calculations electricity===");
                        System.out.println("=== please choosing index to see contents ===");
                        System.out.println("3.1 Electricity Bill ");
                        System.out.println("3.2 Electricity Bill ");
                        System.out.println("3.3 Exit ");

                        Scanner scanner = new Scanner(System.in);
                        String idx_electric = scanner.nextLine();

                        switch (idx_electric) {
                            case "3.1" -> {
                                ElectricityBillOld electricityBillOld = new ElectricityBillOld();
                                electricityBillOld.electric_bill();
                            }
                            case "3.2" -> {
                                ElectricityBillNew electricityBillNew = new ElectricityBillNew();
                                electricityBillNew.electric_bill();
                            }
                            case "3.3" -> {
                                System.out.println("=== GoodBye ===");
                                flag_menu_child = Boolean.FALSE;
                            }
                        }
                    }
                }
                case 4 -> {
                    flag_menu_parent = Boolean.FALSE;
                    System.out.println("=== GoodBye ===");
                }
            }
        }
    }
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.getMenu();
        ;
    }
}