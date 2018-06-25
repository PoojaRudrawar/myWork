class Alpha {
    public void abc(int i) {
        System.out.println("in abc of Alpha");
    }
}

public class Beta extends Alpha{
    public void abc(long i) {
        System.out.println("in abc of Beta");
    }
    public static void main(String [] args){
        Alpha a = new Beta();
        a.abc(5);
    }
}