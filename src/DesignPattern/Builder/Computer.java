package DesignPattern.Builder;

/**
 * Created by PRudrawar on 12/13/2017.
 */

/*
* There are three major issues with Factory and Abstract Factory design patterns when the Object contains a lot of attributes.

Too Many arguments to pass from client program to the Factory class that can be error prone because most of the time, the type of arguments are same and from client side its hard to maintain the order of the argument.
Some of the parameters might be optional but in Factory pattern, we are forced to send all the parameters and optional parameters need to send as NULL.
If the object is heavy and its creation is complex, then all that complexity will be part of Factory classes that is confusing.
We can solve the issues with large number of parameters by providing a constructor with required parameters and then different setter methods to set the optional parameters. The problem with this approach is that the Object state will be inconsistent until unless all the attributes are set explicitly.

Builder pattern solves the issue with large number of optional parameters and inconsistent state by providing a way to build the object step-by-step and provide a method that will actually return the final Object.*/
public class Computer {
    //compulsary
    private String HDD;
    private String RAM;
    //optional
    private boolean isGraphicsEnabled;
    private boolean isBluetoothEnabled;

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsEnabled() {
        return isGraphicsEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsEnabled = builder.isGraphicsEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    public String toString() {

        return "RAM:" + this.getRAM() + " HDD:" + this.getHDD() + " isGraphicsEnabled:" + this.isGraphicsEnabled()+" isBluetoothEnabled"+this.isBluetoothEnabled();
    }

    public static class ComputerBuilder{
        private String HDD;
        private String RAM;
        //optional
        private  boolean isGraphicsEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder setGraphicsEnabled(boolean graphicsEnabled) {
            this.isGraphicsEnabled = graphicsEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
            this.isBluetoothEnabled = bluetoothEnabled;
            return this;
        }

        public ComputerBuilder(String hdd, String ram){
            this.HDD=hdd;
            this.RAM=ram;
        }

        public Computer build(){
            return new Computer(this);
        }



    }
}
