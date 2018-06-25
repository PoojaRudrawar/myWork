package OLD.Spring;

/**
 * Created by PRudrawar on 12/6/2017.
 */
public class Triangle {
    int Side1;
    int side2;
    int side3;


    public int getSide1() {
        return Side1;
    }

    public void setSide1(int side1) {
        Side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public String toString(){
        String objDetail="Triangle details are: Side1:"+getSide1()+" Side2: "+getSide2()+" Side3:"+getSide3();
        System.out.println("Triangle details are: Side1:"+getSide1()+" Side2: "+getSide2()+" Side3:"+getSide3());
    return objDetail;
    }

}
