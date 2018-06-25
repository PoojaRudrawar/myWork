class Vehicle {
    public String color;
    public long price = 100000;
}

class Car extends Vehicle{
    public String carModel;

    void display() {
        System.out.println(super.color + ',' + super.price + ',' + carModel);
    }
}

public class Program {
    public static void main(String args[]){
        Car car = new Car();
        car.color = "blue";
        car.carModel = "VXI";
        car.display();

    }
}
