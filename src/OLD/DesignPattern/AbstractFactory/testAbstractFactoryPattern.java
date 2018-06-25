package OLD.DesignPattern.AbstractFactory;

/**
 * Created by PRudrawar on 12/12/2017.
 */
public class testAbstractFactoryPattern {
    public static void main(String[] args) {
        PC pc= (PC) ComputerFactory.getComputer(new PCFactory("3gb","400gb","2mhz"));
        Server server= (Server) ComputerFactory.getComputer(new ServerFactory("3gb","400gb","2mhz"));

        System.out.println("PC obj:"+pc);

        System.out.println("Server obj:"+server);

    }
}
