package DesignPattern.AbstractFactory;

/**
 * Created by PRudrawar on 12/12/2017.
 */
public class PC extends Computer {

    private  String Ram;
    private String Harddisk;
    private String cpu;

    public PC(String ram, String harddisk, String cpu) {
        Ram = ram;
        Harddisk = harddisk;
        this.cpu = cpu;
    }

    @Override
    public String getRam() {
        return Ram;
    }

    @Override
    public String getHdd() {
        return Harddisk;
    }

    @Override
    public String getCPU() {
        return cpu;
    }
}
