

import java.util.Scanner;

public class Confirmation2 {
    private Rental2 rental2;
    private double totalAmount;

    public Confirmation2(Rental2 rental2) {
        this.rental2 = rental2;
        this.totalAmount = rental2.getCar2().getPrice()* rental2.getDays();
    }

    public Rental2 getRental2() {
        return rental2;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public boolean confirmation(){
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("-------Confirmation-------");
        System.out.println();
        System.out.println("customer_name: "+rental2.getCustomer2().getName());
        System.out.println("customer_id: "+rental2.getCustomer2().getCustomerId());
        System.out.println("customer_phone: "+rental2.getCustomer2().getPhoneNo());
        System.out.println("carId: "+rental2.getCar2().getCarId());
        System.out.println("carModel: "+rental2.getCar2().getModel());
        System.out.println("carNumber: "+rental2.getCar2().getCarNumber());
        System.out.println("Days: "+rental2.getDays());
        System.out.println("Car_price: "+rental2.getCar2().getPrice());
        System.out.println();
        System.out.println("totalAmount: "+getTotalAmount());
        System.out.println("\n");
        System.out.print("do you want to confirm (y/n): ");
        char ch=sc.next().charAt(0);
        if(ch=='y') return true;
        else return false;
    }
}
