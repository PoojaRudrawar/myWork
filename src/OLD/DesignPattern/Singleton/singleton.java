package OLD.DesignPattern.Singleton;

/**
 * Created by PRudrawar on 12/11/2017.
 */
public class singleton {
    private static final singleton obj=new singleton();//private variablr

    private singleton(){//private constructor so that it cant be instanciated

    }

    public singleton getObj(){ //public method to return that obj

        return obj;
    }

    /*
    * in most of the scenarios, Singleton classes are created for resources such as File System, Database connections etc and we should avoid the instantiation until unless client calls the getInstance method. A*/


}
