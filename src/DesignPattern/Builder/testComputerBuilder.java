package DesignPattern.Builder;

/**
 * Created by PRudrawar on 12/13/2017.
 */
public class testComputerBuilder {

    public static void main(String[] args) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
        Computer comp = new Computer.ComputerBuilder(
                "500 GB", "2 GB").setBluetoothEnabled(true)
                .setGraphicsEnabled(true).build();
        System.out.println("Computer Object is"+comp);
    }

}
