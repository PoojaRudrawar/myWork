package OLD.DesignPattern.AbstractFactory;

/**
 * Created by PRudrawar on 12/12/2017.
 */
public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
