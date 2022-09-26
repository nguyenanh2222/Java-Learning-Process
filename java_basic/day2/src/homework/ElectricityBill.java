package homework;

import java.util.Scanner;

import static java.util.stream.IntStream.range;

interface ElectricityBill {
    Integer level = null;
    Double kWh = null;

    public default void electric_bill(){}; // interface method (does not have a body)
}

class ElectricityBillOld implements ElectricityBill {
    Integer level = null;
    Double kWh = null;
    @Override
    public void electric_bill(){
        Scanner input_kWh = new Scanner(System.in);
        System.out.println("Nhap so kWh tieu thu");
        this.kWh = input_kWh.nextDouble();
        Double elec_bill = this.kWh;

        if (elec_bill <= 0){
            System.out.println("Khong the tinh tieu thu kWh = 0");
        }
        if (elec_bill <= 50){
            this.level = 1;
        }
        else {
            this.level = 2;
        }
        switch (this.level) {
            case 1 -> {
                elec_bill = this.kWh * 1000;
            }
            case 2 -> {
                elec_bill = this.kWh * 1000 + (this.kWh-51) * 1200;
                }
        }
        System.out.println("Tien dien(VND): ");
        System.out.println(elec_bill);

    }
}

class ElectricityBillNew implements ElectricityBill {
    Integer level = null;
    Double kWh = null;
    @Override
    public void electric_bill(){
        Scanner input_kWh = new Scanner(System.in);
        System.out.println("Nhap so kWh tieu thu");
        this.kWh = input_kWh.nextDouble();
        Double elec_bill = null;
        for (this.level = 0; this.level < 7; this.level++) {
            if (this.kWh == 0){
                System.out.println("Khong the tinh tieu thu kWh = 0");
                break;
            }
            if (this.kWh <= 50){
                elec_bill = this.kWh * 1.678;
            }
            if (this.kWh > 50 && this.kWh < 100){
                elec_bill = (this.kWh-50) * 1.734;
            }
            if (this.kWh > 101 && this.kWh <201){
                elec_bill = (this.kWh-100) * 2.014;
            }
            if (this.kWh > 201 && this.kWh <301){
                elec_bill = (this.kWh-200) * 2.536;
            }
            if (this.kWh > 301 && this.kWh <401){
                elec_bill = (this.kWh-300) * 2.834;
            }
            if (this.kWh >= 500){
                elec_bill = (this.kWh-400) * 2.927;
            }
        }

        System.out.println("Tien dien(VND): ");
        System.out.println(elec_bill);

    }
}

class Main {
    public static void main(String[] args) {
        ElectricityBillOld electricityBillOld = new ElectricityBillOld();
        electricityBillOld.electric_bill();
        ElectricityBillNew electricityBillNew = new ElectricityBillNew();
        electricityBillNew.electric_bill();

    }
}
