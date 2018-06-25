package DesignPattern.FactoryPattern;

/**
 * Created by PRudrawar on 12/12/2017.
 */
public abstract class Computer {
    public abstract String getRam();
    public abstract String getHdd();
    public abstract String getCPU();

    public String toString(){

        return "RAM:"+this.getRam() +" HDD:"+this.getHdd()+" CPU:"+this.getCPU() ;   }

}
