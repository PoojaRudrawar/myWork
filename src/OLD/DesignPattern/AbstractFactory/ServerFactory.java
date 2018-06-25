package OLD.DesignPattern.AbstractFactory;

/**
 * Created by PRudrawar on 12/12/2017.
 */
public class ServerFactory implements ComputerAbstractFactory{
    private  String Ram;
    private String Harddisk;
    private String cpu;

    public ServerFactory(String ram, String harddisk, String cpu) {
        Ram = ram;
        Harddisk = harddisk;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(Ram,Harddisk,cpu);
    }
}
