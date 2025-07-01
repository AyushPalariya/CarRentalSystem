

public class Car2 {
    private int CarNumber;
    private String model;
    private int carId;
    private double pricePerDay;
    private boolean isAvailable;

    public Car2(int carNumber, String model, int carId,double price) {
        CarNumber = carNumber;
        this.model = model;
        this.carId = carId;
        pricePerDay=price;
        isAvailable=true;
    }

    public int getCarNumber() {
        return CarNumber;
    }

    public String getModel() {
        return model;
    }

    public int getCarId() {
        return carId;
    }
    public double getPrice(){
        return pricePerDay;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public void rental(){
        isAvailable=false;
    }
    public void returnCar(){
        isAvailable=true;
    }
}
