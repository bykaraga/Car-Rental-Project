public class Rental {
    Car car;
    int days;

    public Rental(Car car ,int days){
        this.car = car;
        this.days = days;
    }
    double calculateTotal(){
       return car.dailyPrice *days;
    }
    void printInfo() {
        System.out.println("---------------------");
        car.printInfo();
        System.out.println("Rental days: " + days);
        System.out.println("Total price: " + calculateTotal());
        System.out.println("---------------------");
}
}
