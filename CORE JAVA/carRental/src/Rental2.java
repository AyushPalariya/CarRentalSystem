

public class Rental2 {
    private int days;
    private Car2 car2;
    private Customer2 customer2;

    public Rental2(int days, Car2 car2, Customer2 customer2) {
        this.days = days;
        this.car2 = car2;
        this.customer2 = customer2;
    }

    public int getDays() {
        return days;
    }

    public Car2 getCar2() {
        return car2;
    }

    public Customer2 getCustomer2() {
        return customer2;
    }
}
