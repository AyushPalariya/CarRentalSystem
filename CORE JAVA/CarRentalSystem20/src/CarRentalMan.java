

import java.util.ArrayList;
import java.util.List;

public class CarRentalMan {
    private List<Car2> carList;
    private List<Customer2> customer2List;
    private List<Rental2> rental2List;


    public CarRentalMan() {
        carList=new ArrayList<>();
        customer2List=new ArrayList<>();
        rental2List=new ArrayList<>();
        loadCars();
    }
    public void loadCars(){
        Car2 car1=new Car2(101,"Thar",1,1500);
        Car2 car2=new Car2(102,"XUVS",2,1000);
        Car2 car3=new Car2(103,"Duster",3,800);
        Car2 car4=new Car2(104,"Scorpio",4,1300);
        Car2 car5=new Car2(105,"toofan",5,1100);
        Car2 car6=new Car2(106,"alto",6,600);
        carList=List.of(car1,car2,car3,car4,car5,car6);
    }

    public void rentCar(int carNum, Customer2 customer2, int days) throws InterruptedException {
        Car2 car2=null;
        for(Car2 car1:carList){
            if(car1.getCarNumber()==carNum){
                car2=car1;
                break;
            }
        }
        Rental2 rental2=new Rental2(days,car2,customer2);
        Confirmation2 confirmation2=new Confirmation2(rental2);
        System.out.println("confirmation window...");
        Thread.sleep(2500);
        boolean flag=confirmation2.confirmation();
        if(flag) {
            Thread.sleep(2000);
            customer2List.add(customer2);
            rental2List.add(rental2);
            rental2.getCar2().rental();
            System.out.println("car rented and customer added successfully");
        }
        else{
            System.out.println("your answer is no");
            System.out.println("Thanks for enquiry");
        }
    }
    public void returnCar(int carNum){
        boolean flag=false;
        for(Rental2 rental2:rental2List){
            if(rental2.getCar2().getCarNumber()==carNum){
                flag=true;
                rental2List.remove(rental2);
                System.out.println("Car return successfully by "+rental2.getCustomer2().getName());
                customer2List.remove(rental2.getCustomer2());
                rental2.getCar2().returnCar();
                System.out.println("Thanks for returning Car");
                break;
            }
        }
        if(flag==false) System.out.println("Car was not rented");
    }
    public void availableCars(){
        System.out.println("no.|carModel\t|carNumber\t\t|carPrice");
        for (int i = 0; i < carList.size(); i++) {
            Car2 car2=carList.get(i);
            if(car2.isAvailable()){
                System.out.println("#"+". \t"+car2.getModel()+"\t\t\t"+car2.getCarNumber()+"\t\t\t"+car2.getPrice());
            }
        }
    }

    public List<Car2> getCarList() {
        return carList;
    }

    public List<Customer2> getCustomer2List() {
        return customer2List;
    }

    public List<Rental2> getRental2List() {
        return rental2List;
    }
}
