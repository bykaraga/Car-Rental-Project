public class CarDriver {
    public static void main(String[] args){
Car rentalcar1 = new Car("Honda","civic",525.5,"black");

Car rentalcar2 = new Car("Mercedes","C200",1800.0,"white");
Car rentalcar3 = new Car("Toyota","Corolla",900.0,"blue");
Car rentalcar4 = new Car("BMW","320i",1500.75,"red");
        Rental rental1 = new Rental(rentalcar1, 5);

        Rental rental2 = new Rental(rentalcar2, 3);

        Rental rental3 = new Rental(rentalcar3, 7);

        Rental rental4 = new Rental(rentalcar4, 2);

        rental1.printInfo();

        rental2.printInfo();

        rental3.printInfo();

        rental4.printInfo();

    }
}
