

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        CarRentalMan carRentalMan=new CarRentalMan();

        while(true){
            System.out.println("=============Car Rental System==========");
            System.out.println("1. Rent a Car");
            System.out.println("2. Return a Car");
            System.out.println("3. Exit");
            System.out.println();
            System.out.print("Enter your choice: ");
            int num=sc.nextByte();
            sc.nextLine();
            System.out.println();

            switch(num){
                case 1:
                    System.out.println("==Rent a Car==");
                    System.out.print("Enter your name: ");
                    String name=sc.next();
                    System.out.print("your AdharNum: ");
                    int adhar=sc.nextInt();
                    System.out.print("phone_num: ");
                    String phone=sc.next();
                    System.out.println("--------------------");
                    System.out.println("Car available: ");
                    carRentalMan.availableCars();
                    System.out.println("-----------------------");
                    System.out.print("Enter CarNumber you want to rent: ");
                    int carNum= sc.nextInt();
                    System.out.print("Enter days: ");
                    int days=sc.nextByte();
                    Customer2 customer2=new Customer2(adhar,phone,name);
                    carRentalMan.rentCar(carNum,customer2,days);
                    break;
                case 2:
                    System.out.println("==Return a car==");
                    System.out.println("Enter CarNumber: ");
                    int carNumber=sc.nextInt();
                    carRentalMan.returnCar(carNumber);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    Thread.sleep(3000);
                    System.out.println("Thanks for coming..");
                    return;
                default:
                    System.out.println("invalid choice");
            }
        }
    }
}
