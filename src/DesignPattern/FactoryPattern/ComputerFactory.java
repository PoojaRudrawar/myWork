package DesignPattern.FactoryPattern;

/**
 * Created by PRudrawar on 12/12/2017.
 */
public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String HDD, String CPU) {
        if (type.equals("PC")) {
            return new PC(ram, HDD, CPU);
        } else if (type.equals("Server")) {
            return new Server(ram, HDD, CPU);

        }
        return null;
    }

}
