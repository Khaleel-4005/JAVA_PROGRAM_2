public class Car {
    String brand;

    int speed;

    void drive(){
        System.out.println(brand + " is driving at " + speed + " km/h. ");
    }
    public static void main(String[] args){
        Car mycar = new Car();

        mycar.brand = "MAHINDRA THAR";
        mycar.speed = 80;
        mycar.drive();
    }
}
