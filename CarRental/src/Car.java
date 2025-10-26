public class Car {
    String brand,model,carColor;
  public  double dailyPrice;

    public Car(String brand,String model,double dailyPrice,String carColor){
        this.brand = brand;
        this.dailyPrice = dailyPrice;
        this.model = model;
        this.carColor = carColor;
    }
    void printInfo(){
        System.out.println("Car brand : "+brand);
        System.out.println("Car model : "+model);
        System.out.println("Car daily price : "+dailyPrice);
        System.out.println("Car color : "+carColor);

    }
}
