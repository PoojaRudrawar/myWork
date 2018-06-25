package OLD.DesignPattern.FactoryPattern;

/**
 * Created by PRudrawar on 12/12/2017.
 */
public class testComputerFactory {
    public static void main(String[] args) {
        PC pc= (PC) ComputerFactory.getComputer("PC","3gb","1000gb","1000mh");
        Server server=(Server)ComputerFactory.getComputer("Server","10gb","1000tb","2000mh");
        System.out.println("Config for pc:"+pc);
        System.out.println("Config for server:"+server);

    }
}
